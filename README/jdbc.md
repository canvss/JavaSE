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

```java
	public void test02() throws Exception{
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        int eid = 1003;
        String ename = "Lisa";
        String city = "NewYork";
        char gender = '女';
        String email = "lisa@gmail.com";
        String sql = "INSERT INTO emps(eid,ename,city,gender,email) 					VALUES(?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setObject(1,eid);
        pst.setObject(2,ename);
        pst.setObject(3,city);
        pst.setString(4,String.valueOf(gender));
        pst.setObject(5,email);
        int len = pst.executeUpdate();
        System.out.println(len > 0 ? "添加成功" : "添加失败");
        pst.close();
        conn.close();
    }
```

#### 避免sql注入问题

```java
public class SQLInject {
    String url = "jdbc:mysql://bj-cynosdbmysql-grp-an5acmhk.sql.tencentcdb.com:28067/canvs?serverTimezone=UTC";
    @Test
    public void test01() throws Exception {
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String id = 1002 + " OR 1 = 1";
        String sql = "SELECT * FROM employees WHERE employee_id = " + id;
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet resultSet = pst.executeQuery();
        while (resultSet.next()) {
            for (int i = 1; i <= 11; i++) {
                System.out.print(resultSet.getObject(i) + "\t\t");
            }
            System.out.println();
        }
        resultSet.close();
        pst.close();
        conn.close();
    }
    @Test
    public void test02() throws Exception{
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String id = 1002 + " OR 1 = 1";
        String sql = "SELECT * FROM employees WHERE employee_id = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        //会把id=1002 + " OR 1 = 1"整体赋值给id
        pst.setObject(1,id);
        ResultSet resultSet = pst.executeQuery();
        while(resultSet.next()){
            for (int i = 1; i <= 11; i++) {
                System.out.print(resultSet.getObject(i)+"\t");
            }
        }
        resultSet.close();
        pst.close();
        conn.close();
    }
}
```

#### 使用字节IO流读取图片等给blob等二进制类型数据赋值

```java
public class SQLBlob {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://bj-cynosdbmysql-grp-an5acmhk.sql.tencentcdb.com:28067/demo?serverTimezone=UTC";
        int id = 1001;
        String username = "Canvs";
        String password = "123456";
        String path = "photo.jpg";
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String sql = "INSERT INTO t_user(id,username,password,photo) VALUES(?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setObject(1, id);
        pst.setObject(2, username);
        pst.setObject(3, password);
        //因为path是一个路径，需要转换为字节io流表示
        pst.setObject(4, new FileInputStream(path));
        int len = pst.executeUpdate();
        System.out.println(len > 0 ? "添加成功" : "添加失败");
        pst.close();
        conn.close();
    }
}
```

当存储的图片特别大时：

- com.mysql.cj.jdbc.exceptions.PacketTooBigException: Packet for query is too large (6,638,795 > 4,194,304).You can change this value on the server by setting the 'max_allowed_packet' variable.
  - 解决方案：修改my.ini配置文件max_allowed_packet变量的值，先停止服务，然后修改my.ini文件，再重启服务
- com.mysql.cj.jdbc.exceptions.MysqlDataTruncation: Data truncation: Data too long for column 'photo' at row 1
  - 问题：blob类型的数据，存不下这么大的图片
  - 解决方案：修改字段的数据类型
  - alter table t_user modify photo mediumblob;

#### 获取自增长键值

MySQL中有很多表都是有自增长字段，特别是id；当我们添加了一个员工信息后，需要立刻返回该员工的自增长的id

- 在用Connection数据库连接对象获取PreparedStatement对象时，要加一个参数PreparedStatement pst = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)；这里RETURN_GENERATED_KEYS表示执行sql后，返回自增长键值
- 执行完成之后，需要从PreparedStatement对象中获取自增长键值ResultSet rs = pst.getGeneratedKeys();

```Java
public class SQLGenerateKey {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://bj-cynosdbmysql-grp-an5acmhk.sql.tencentcdb.com:28067/demo?serverTimezone=UTC";
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String sql = "INSERT INTO user(user_name,password) VALUES('canvs','123456')";
        PreparedStatement pst = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
        int len = pst.executeUpdate();
        System.out.println(len>0?"添加成功":"添加失败");
        ResultSet generatedKeys = pst.getGeneratedKeys();
        while(generatedKeys.next()){
            Object object = generatedKeys.getObject(1);
            System.out.println(object); //1007
        }
        generatedKeys.close();
        pst.close();
        conn.close();
    }
}
```

#### 批处理

给部门表批量添加1000条部门测试数据

- MySQL服务器端，默认批处理功能没有开启。需要通过参数告知MySQL服务器，开启批处理功能。在url后面再加一个参数 rewriteBatchedStatements=true
  - url格式：jdbc:mysql://localhost:3306/demo？serverTimezone=UTC&rewriteBatchedStatements=true
- PreparedStatement对象调用
  - addBatch()
  - executeBatch()

```java
public class SQLBatch {
    @Test
    public void test01() throws Exception{
        long start = System.currentTimeMillis();
        String url = "jdbc:mysql://bj-cynosdbmysql-grp-an5acmhk.sql.tencentcdb.com:28067/demo?serverTimezone=UTC";
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String sql = "INSERT INTO dept(dname,`desc`) VALUES(?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        for (int i = 1; i <= 1000; i++) {
            pst.setObject(1,"部门 "+i);
            pst.setObject(2,"部门说明 "+i);
            int len = pst.executeUpdate();  //意味着需要IO流与文件通信1000次
            System.out.println("第"+i+"条 "+(len > 0 ? "添加成功" : "添加失败"));
        }
        pst.close();
        conn.close();
        long end = System.currentTimeMillis();
        System.out.println("一共耗时："+(end-start)+"ms");
    }
    @Test
    public void test02() throws Exception{
        long start = System.currentTimeMillis();
        String url = "jdbc:mysql://bj-cynosdbmysql-grp-an5acmhk.sql.tencentcdb.com:28067/demo?serverTimezone=UTC&rewriteBatchedStatements=true";
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String sql = "INSERT INTO dept(dname,`desc`) VALUES(?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        for (int i = 1; i <=1000 ; i++) {
            pst.setObject(1,"部门 "+i);
            pst.setObject(2,"部门说明 "+i);
            //不需要设置一次执行一次；设置完成，会重新编译sql，生成一条完整的sql
            pst.addBatch();
        }
        //一次性执行完
        pst.executeBatch();
        pst.close();
        conn.close();
        long end = System.currentTimeMillis();
        System.out.println("一共耗时："+(end-start)+"ms");
    }
}
```

#### 事务处理

如果多条SQL要组成一个事务，要么一起成功，要么一起失败

例如：订单

- 修改商品表的商品库存和销量
- 订单表新建订单数据
- 订单明细表新建订单明细记录（多条）

这些SQL要么一起成功，要么都还原到最初

**jdbc处理事务**

- mysql默认是自动提交事务，每执行一条语句成功后，自动提交。需要开启手动提交模式
  - Connection连接对象.setAutoCommit(false); //取消自动提交模式，开始手动提交模式
- sql执行成功，需要提交事务
  - Connection连接对象.commit()
- sql执行失败，回滚事务
  - Connection连接对象.rollback()

```java
public class SQLTransaction {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://bj-cynosdbmysql-grp-an5acmhk.sql.tencentcdb.com:28067/demo?serverTimezone=UTC";
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String sql1 = "UPDATE dept SET dname = 'IT部' WHERE did = 2002";
        String sql2 = "UPDATE dept SET dname = '运维部' WHERE did = 2003";
        conn.setAutoCommit(false);
        try (
                PreparedStatement pst1 = conn.prepareStatement(sql1);
                PreparedStatement pst2 = conn.prepareStatement(sql2);
        ) {
            pst1.executeUpdate();
            pst2.executeUpdate();
            System.out.println("update 2 row");
            conn.commit();
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("update error");
            conn.rollback();    //回滚事务
        }finally {
            conn.close();
        }
    }
    @Test
    public void test() throws Exception{
        String url = "jdbc:mysql://bj-cynosdbmysql-grp-an5acmhk.sql.tencentcdb.com:28067/demo?serverTimezone=UTC";
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String sql1 = "UPDATE dept SET dname = 'IT部' WHERE did = 2002";
        String sql2 = "UPDATE dept SET dname = '运维部' WHERE eid = 5000";
        conn.setAutoCommit(false);
        try (
                PreparedStatement pst1 = conn.prepareStatement(sql1);
                PreparedStatement pst2 = conn.prepareStatement(sql2);
        ) {
            pst1.executeUpdate();
            pst2.executeUpdate();
            System.out.println("update 2 row");
            conn.commit();
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("update error");
            conn.rollback();    //回滚事务
        }finally {
            conn.close();
        }
    }
}
```

### 数据库连接池

连接对象的缓冲区。复制申请，分配管理，释放连接的操作。

#### 为什么要使用数据库连接池

- 不使用数据库连接池，每次都通过DriverManager获取新连接，用完直接抛弃断开，连接的利用率太低，太浪费。
- 对于数据库服务器来说，压力太大了。数据库服务器和Java程序队连接数也无法控制，很容易导致数据库服务器崩溃

#### 连接池的好处

- 可以建立一个连接池，这个池中可以容纳一定数量的连接对象，一开始，我们可以先替用户先创建号一些连接对象，等用户要拿连接对象时，就直接从池中拿，不用新建了，这样也可以节约时间。然后用户用完后，放回去，别人可以接着使用。
- 可以提高连接的使用率。当池中的现有的连接都用完了，那么连接池可以向服务器申请新的连接放到池中。
- 知道池中的连接达到了最大连接数，就不能再申请新的连接了，如果没有拿到连接的用户只能等待。

#### 市面上的数据库连接池技术

- JDBC的数据库连接池使用`javax.sql.DataSource`来表示，DataSource只是一个接口（通常被称为数据源），该接口通常由服务器（Weblogic、WebSphere、Tomcat）提供实现，也有一些开源组件提供实现：
  - DBCP是Apache提供的数据库连接池，速度相对c3p0较快，但因自身存在BUG，Hibernate3已不再提供支持
  - C3P0是一个开源组织提供的一个数据库连接池，速度相对较慢，稳定性还可以
  - Proxool是sourceforge下的一个开源项目数据库连接池，有监控连接池状态的功能，稳定性较c3p0差一点
  - BoneCP是一个开源组织提供的数据库连接池，速度快
  - Druid是阿里提供的数据库连接池，据说是集DBCP、C3P0、Proxool优点与一身的数据库连接池
