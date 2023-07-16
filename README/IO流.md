### java.io.File类的使用

#### 概述

- File类及各种流，都定义在java.io包下
- 一个File对象代表硬盘或网络中可能存在的一个文件或文件目录（万事万物皆对象）。
- File能新建、删除、重命名文件和目录，但File不能访问文件内容本身。如果需要访问文件内容本身，则需要使用输入/输出流
  - File对象可以作为参数传递给流的构造器
- 想要在Java程序中表示一个真实存在的文件或目录，那么必须有一个File对象，但是Java程序中的一个File对象，可能没有一个真实存在的文件或目录。

#### 构造器

- `public File(String pathname) ` ：以pathname为路径创建File对象，可以是绝对路径或相对路径，如果pathname是以相对路径，则默认的当前路径在系统属性user.dir中存储。
  - 绝对路径：从盘符开始的路径，是一个完整的路径
  - 相对路径：相对于当前目录的路径
    - IDEA中，main方法中的文件相对路径，是相对于当前工程
    - IDEA中，单元测试方法的中的文件相对路径，是相对于当前module
- `public File(String parent, String child) ` ：以parent为父路径，child为子路径创建File对象
- `public File(File parent, String child)` ：根据一个父File对象和子文件路径创建File对象

```java
public class FileTest {
    public static void main(String[] args) {
        File file = new File("hello.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath()); //JavaSE/hello.txt
    }
    @Test
    public void test01(){
        File file = new File("hello.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath()); //JavaSE/io/hello.txt
    }
    @Test
    public void test02(){
        File file = new File("/Users/canvs/Desktop/JAVA/JavaSE/io/","hello.txt");
        System.out.println(file.getName()); //hello.txt
    }
    @Test
    public void test03(){
        File file = new File("/Users/canvs/Desktop/JAVA/JavaSE/io/");
        File file2 = new File(file,"hello.txt");
    }
    @Test
    public void test04(){
        File file = new File("/Users/canvs/Desktop/JAVA/JavaSE/io/hello.txt");
        System.out.println("文件目录名称："+file.getName());
        System.out.println("文件目录构造路径："+file.getPath());
        System.out.println("是否是文件："+file.isFile());
        System.out.println("文件目录的父目录："+file.getParent());
    }
    @Test
    public void test05(){
        File file = new File("hello.txt");
        System.out.println("文件目录名称："+file.getName());
        System.out.println("文件目录构造路径："+file.getPath());
        System.out.println("是否是文件："+file.isFile());
        System.out.println("文件目录的父目录："+file.getParent());
        System.out.println("文件目录的父目录："+file.getAbsoluteFile().getParent());
    }
}
```

> 注意：
>
> - 当构造路径是绝对路径时，那么getPath和getAbsolutePath结果一样
>
> - 当构造路径是相对路径时，那么getAbsolutePath的路径 = user.dir的路径+构造路径

#### 常用方法

##### 获取文件和目录基本信息

- public String getName()：获取名称
- public String getPath()：获取路径
- public String getAbsolutePath()：获取绝对路径
- public File getAbsoluteFile()：获取绝对路径的File对象
- public String getParent()：获取上层路径，若无返回null
- public long length()：获取文件的长度（字节数）。不能获取目录的长度
- public long lastModified()：获取最近修改时间，时间戳。

> 如果File对象代表的文件或目录不存在，则File对象实例初始化时，就会用硬盘中对应文件或目录的属性为File对象的属性赋值，否则除了路径和名称，File对象的其他属性将会保留默认值，

```java
public class FileInfoMethodTest {
    @Test
    public void test01(){
        File file = new File("hello.txt");
        System.out.println("文件名："+file.getName());
        System.out.println("文件路父目录："+file.getParent());
        System.out.println("文件路径："+file.getAbsolutePath());
        System.out.println("文件路径："+file.getAbsoluteFile().getAbsolutePath());
        System.out.println("文件长度："+file.length());
        System.out.println("最近修改时间："+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified())));
    }
    @Test
    public void test02(){
        File file = new File("src");
        System.out.println("文件名："+file.getName());
        System.out.println("文件路父目录："+file.getParent());
        System.out.println("文件路径："+file.getAbsolutePath());
        System.out.println("文件路径："+file.getAbsoluteFile().getAbsolutePath());
        System.out.println("文件长度："+file.length());
        System.out.println("最近修改时间："+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified())));
    }
}
```

##### 列出目录的下一级

- public String[] list()：返回一个String数组，表示该File目录中的所有子文件或目录
- public File[] listFile()：返回一个File数组，表示该File目录中的所有子文件或目录
- java.io.FilenameFilter：实现此接口的类实例可用于过滤器文件名
  - boolean accept(File dir,String name) ：测试指定文件是否应该包含在某一文件列表中
- java.io.FileFilter：用于抽象路径名(File对象)的过滤器
  - boolean accept(File pathname)：测试pathname是否应该包含在当前File目录中 若符合则返回true

```java
public class DirListFilesTest {
    @Test
    public void test01(){
        File file = new File("src/com/canvs/");
        for (File fl : file.listFiles()) System.out.println(fl.getName());
    }
    @Test
    public void test02(){
        File file = new File("src/com/canvs/");
        for (String fs : file.list()) System.out.println(fs);
    }
    @Test
    public void test03(){
        File file = new File("/Users/canvs/Desktop/JAVA/JavaSE/README/imgs/");
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".jpg");
            }
        });
        for (File fs : files) System.out.println(fs.getName());
    }
    @Test
    public void test04(){
        File file = new File("/Users/canvs/Desktop/JAVA/JavaSE/README/imgs/");
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jpg");
            }
        });
        for (File fs : files) System.out.println(fs);
    }
}
```

##### File类的重命名

- public boolean renameTo(File dest)：把文件重命名为指定的文件路径

##### 判断功能的方法

- public boolean exists()：判断文件或目录是否实际存在
- public boolean isDirectory()：判断是否为目录
- public boolean isFile()：判断是否为文件
- public boolean canRead()：判断是否可读
- public boolean canWrite()：判断是否可写
- public boolean isHidden()：判断是否隐藏

```java
public class FileIsTest {
    @Test
    public void test01(){
        String src = "hello.txt";
        String desc = "hello_copy.txt";
        File file = new File(src);
        file.renameTo(new File(desc));
    }
    @Test
    public void test02(){
        String desc = "hello_copy.txt";
        File file = new File(desc);
        System.out.println("文件目录是否存在"+file.exists());
        System.out.println("是否为文件："+file.isFile());
        System.out.println("是否为目录："+file.isDirectory());
        System.out.println("是否可读："+file.canRead());
        System.out.println("是否可写："+file.canWrite());
        System.out.println("是否隐藏："+file.isHidden());
    }
    @Test
    public void test03(){
        String desc = "src/com/canvs/";
        File file = new File(desc);
        System.out.println("文件目录是否存在："+file.exists());
        System.out.println("是否为文件："+file.isFile());
        System.out.println("是否为目录："+file.isDirectory());
        System.out.println("是否可读："+file.canRead());
        System.out.println("是否可写："+file.canWrite());
        System.out.println("是否隐藏："+file.isHidden());
    }
}
```

##### 创建、删除功能

- public boolean createNewFile()：创建文件，若文件存在，则不创建，返回false
- public boolean mkdir()：创建文件目录。如果此文件目录存在，则不创建。如果此文件目录的上层目录不存在，也不创建
- public boolean mkdirs()：创建文件目录，如果上层文件目录不存在，一并创建
- public boolean delete()：删除文件或目录，删除一个目录，则该文件目录下不能包含文件或目录才能删除

```java
public class FileCreateDeleteTest {
    @Test
    public void test01() {
        File file = new File("/Users/canvs/Desktop/Test/hello.java");
        try {
            System.out.println(file.createNewFile() ? "创建成功！" : "创建失败！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void test02() {
        File file = new File("/Users/canvs/Desktop/Test/hello/");
        System.out.println(file.mkdir() ? "创建成功！" : "创建失败！");
    }
    @Test
    public void test03(){
        File file = new File("/Users/canvs/Desktop/Test/hello1/test/");
        System.out.println(file.mkdirs() ? "创建成功！" : "创建失败！");
    }
    @Test
    public void test04(){
        File file = new File("/Users/canvs/Desktop/Test/","hello.java");
        System.out.println(file.delete()? "删除成功":"删除失败");
        File file2 = new File("/Users/canvs/Desktop/Test/","hello1/test/");
        System.out.println(file2.delete() ? "删除成功":"删除失败");
    }
}
```

#### 练习

练习1:遍历指定目录所有文件名称，包括子文件目录中的文件。

- 并计算指定目录占用空间的大小
- 删除指定文件目录及其下的所有文件

```java
public class ListFilesTest {
    public static void main(String[] args) {
        String src = "/Users/canvs/Desktop/test/";
        printSubFile(new File(src));
        System.out.println(getDirectorySize(new File(src)));
        deleteDirctory(new File(src));
    }
    public static void printSubFile(File file) {
        if (file.isFile()) {
            System.out.println(file.getPath());
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) for (File fs : files) printSubFile(fs);
        }
    }
    public static Long getDirectorySize(File file) {
        long size = 0;
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) for (File fs : files) size += getDirectorySize(fs);
        }else if (file.isFile()) size += file.length();
        return size;
    }
    public static void deleteDirctory(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) for (File fs : files) deleteDirctory(fs);
        }
        file.delete();
    }
}
```

### IO流原理及流的分类

#### Java IO原理

- Java程序中，对于数据的输入/输出操作以`流(Stream)`的方式进行，可以看作是一种数据的流动。

  <img src="imgs/image-20220503123117300.png" alt="image-20220503123117300" style="zoom: 80%;" />

- I/O流中的I/O式`Input/Output`的缩写，I/O技术式非常实用的技术，用于处理设备之间的数据传输。如读/写文件，网络通讯等。

  - 输入Input：读取外部数据（磁盘、光盘等存储设备的数据）到程序（内存）中。
  - 输出Output：将程序（内存）数据输出到磁盘、光盘等存储设备中。

![image-20220412224700133](/Users/canvs/Desktop/JAVA/JavaSE/README/imgs/image-20220412224700133.png)

#### 流的分类

`java.io`包下提供了各种流类和接口，用于获取不同种类的数据，并通过标准的方法输入或输出数据。

- 按数据的流向不同分为：输入流和输出流

  - 输入流：把数据从其他设备上读取到内存中的流
    - 以InputStream、Reader结尾
  - 输出流：把数据从内存中写出到其他设备上的流
    - 以OutputStream、Writer结尾

- 按操作数据单位的不同分为：字节流（8bit）和字符流（16bit）

  - 字节流：以字节为单位，读写数据的流
    - 以InputStream、OutputStream结尾
  - 字符流：以字符为单位，读写数据的流
    - 以Reader、Writer结尾

- 根据IO流的角色不同分为：节点流和处理流

  - 节点流：直接冲数据源或目的地读写数据

  ![image-20220412230745170](imgs/image-20220412230745170.png)

  - 处理流：不直接连接到数据源或目的地，而是连接在已存在的流（节点流或处理流）之上，通过对数据的处理为程序提供更为强大的读写功能。

  ![image-20220412230751461](imgs/image-20220412230751461.png)

### 流的API

- Java的IO流共涉及40多个类，实际上非常规则，都是如下4个抽象基类派生的

| 抽象基类 |   输入流    |    输出流    |
| :------: | :---------: | :----------: |
|  字节流  | InputStream | OutputStream |
|  字符流  |   Reader    |    Writer    |

- 由这4个派生出来的子类名称都是以其父类名作为子类名后缀

| 分类       | 字节输入流           | 字节输出流            | 字符输入流        | 字符输出流         |
| :--------- | -------------------- | --------------------- | ----------------- | ------------------ |
| 抽象基类   | Inputstream          | Outputstream          | Reader            | Writer             |
| 访问文件   | FilelnputStream      | FileOutputStream      | FileReader        | FileWriter         |
| 访问数组   | ByteArraylnputStream | ByteArrayOutputStream | CharArrayReader   | CharArrayWriter    |
| 访问管道   | PipedlnputStream     | PipedOutputStream     | PipedReader       | PipedWriter        |
| 访问字符串 |                      |                       | StringReader      | StringWriter       |
| 缓冲流     | BufferedlnputStream  | BufferedOuputStream   | BufferedReader    | BufferedWriter     |
| 转换流     |                      |                       | InputstreamReader | OutputStreamWriter |
| 对象流     | ObjectlnputStream    | ObjectOutputStream    |                   |                    |
|            | FilterlnputStream    | FilterOutputStream    | FilterReader      | FilterWriter       |
| 打印流     |                      | Printstream           |                   | PrintWriter        |
| 推回输入流 | PushbacklnputStream  |                       | PushbackReader    |                    |
| 特殊流     | DatalnputStream      | DataOutputStream      |                   |                    |

