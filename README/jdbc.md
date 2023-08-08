### JDBC概述

JDBC：Java Database Connectivity，它是代表一组独立于任何数据库管理系统（DBMS）的API，声明在java.sql与javax.sql包中，是SUN(现在Oracle)提供给的一组接口规范。由各个数据库厂商来提供实现类，这些实现类的集合构成了数据库驱动jar。

<img src="imgs/jdbc-architecture-.png" style="zoom:50%;" />

即JDBC技术包含两个部分：

- java.sql包和javax.sql包中的API

> 因为为了项目代码的可移植性，可维护性，SUN公司从最初就制定了Java程序连接各种数据库的统一接口规范。这样的话，不管是连接哪一种DBMS软件，Java代码可以保持一致性

- 各个数据库厂商提供的jar

> 因为各个数据库厂商的DBMS软件各有不同，那么内部如何通过sql实现增、删、改、查等管理数据库，只有这个数据厂商自己更清楚，因此把接口规范的实现交给各个数据厂商自己实现

#### Java代码连接MySQL数据库

- 1.模块中添加mysql依赖驱动相关库

- 2.在内存中加载驱动类(可选)

  - 较早版本：org.gjt.mm.mysql.Driver
  - 5.0版本：com.mysql.jdbc.Driver
  - 8.0版本：com.mysql.cj.jdbc.Driver

  > 新版本的mysql驱动jar可以省略，旧版mysql驱动必须加一这步骤。因为新版mysql驱动jar包下有一个META-INF/services/java.sql.Driver文件里面有填写mysql驱动类的全名称，DriverManager会自动读取这个文件，并加载对应的驱动类后期使用数据库连接池，或者MyBatis等框架时，在配置文件中加这个驱动类的配置即可

- 3.连接数据库：通过DriverManager工具类的静态方法获取数据库连接Connection对象

  - mysql服务器ip地址
  - 端口号
  - 用户名
  - 密码

  > MySQL8使用时，url需要加参数：serverTimezone=UTC，否则会报错

- 4.操作数据库

  - 通过Connection对象获取Statement或PreparedStatement对象
  - 通过Statement或PreparedStatement对象执行sql
    - 执行增、删、改：int executeUpdate()
    - 执行查询：ResultSet executeQuery()
    - 执行DDL语句：boolean execute()：可以用来执行DDL语句
  - 如果服务器有查询结果返回，需要用ResultSet接收
    - 遍历结果集的方法：
      - boolean next()：判断是否还有下一行
      - getString(字段名或序号)
      - getInt(字段名或序号)
      - getObject(字段名或序号)

- 4.断开连接：close方法

```java
    @Test
    public void test01() throws ClassNotFoundException, SQLException {
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, "root", "Lbwnb123");
        System.out.println(connection);
        connection.close();
    }
```

#### 实现增删改查

```java
public class JdbcTest {
    String url = "127.0.0.1:3306/demo?serverTimezone=UTC";
    @Test
    public void insert() throws Exception {
        //把驱动类加载到内存中
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        //获取数据库连接对象
        Connection connection = DriverManager.getConnection(url, "root", "Lbwnb123");
        String sql = "INSERT INTO user(uid,user_name,password) VALUES(1006,'Rose','123456')";
        //获取PreparedStatement IO流 网络编程的socket.getOuputStream()发送数据用的
        PreparedStatement statement = connection.prepareStatement(sql);
        //返回sql影响的记录数
        int len = statement.executeUpdate();
        System.out.println(len > 0 ? "插入成功" : "插入失败");
        statement.close();
        connection.close();
    }

    @Test
    public void update() throws Exception {
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String sql = "UPDATE user SET password = '123456' WHERE uid = 1001";
        PreparedStatement pst = conn.prepareStatement(sql);
        int len = pst.executeUpdate();
        System.out.println(len > 0?"修改成功！":"修改失败！");
        pst.close();
        conn.close();
    }
    @Test
    public void delete() throws Exception{
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String sql = "DELETE from user WHERE uid = 1002";
        PreparedStatement pst = conn.prepareStatement(sql);
        int len = pst.executeUpdate();
        System.out.println(len>0?"删除成功":"删除失败");
        pst.close();
        conn.close();
    }
    @Test
    public void select() throws Exception{
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String sql = "SELECT uid,user_name,password FROM user";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet resultSet = pst.executeQuery();
        while(resultSet.next()){
            System.out.print(resultSet.getInt("uid")+"\t");
            System.out.print(resultSet.getString("user_name")+"\t");
            System.out.print(resultSet.getString("password")+"\t");
            System.out.println();
        }
        resultSet.close();
        pst.close();
        conn.close();
    }
}
```

#### 避免sql拼接问题

- PreparedStatement接口是Statement接口的子接口
- Statement接口是不支持？通配符形式的sql，只能拼接sql

```java
public void test() throws Exception {
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        int eid = 1002;
        String ename = "Canvs";
        String city = "HONGKONG";
        char gender = '男';
        String email = "canvs@gmail.com";
        String sql = "INSERT INTO emps(eid,ename,city,gender,email)VALUES(" +
                eid + "," +
                "'" + ename +  "'" +"," +
                "'" + city +  "'" +"," +
                "'" + gender + "'" + "," +
                "'" + email + "'" + ")";
        System.out.println(sql);
        PreparedStatement pst = conn.prepareStatement(sql);
        int len = pst.executeUpdate();
        System.out.println(len > 0 ? "插入成功" : "插入失败");
        pst.close();
        conn.close();
    }
```

