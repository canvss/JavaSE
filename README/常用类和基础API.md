### 字符串相关类之不可变字符序列：String

#### String的特性

- `java.lang.String`类代表字符串。Java程序中所有的字符串文字都可以看作是实现此类的实例。
- 字符串是常量，用双引号引起来表示。它们的值在创建之后不能更改。
- 字符串String类型本身是final声明的，意味我们不能继承String
- String对象的字符内容是存储在一个字符数组value[]中的。`"hello"`等效于`char [] data = {'h','e','l','l','o'}`

![](imgs/String_api.jpg)

```java
//JDK8.0中String源码
public final class String
    implements java.io.Serializable, Comparable<String>, CharSequence {
    /** The value is used for character storage. */
    private final char value[];	//String 对象的字符内容是存储在此数组中
```

- private意味着外面无法直接获取字符数组，而且String没有提供value的get和set方法
- final意味字符数组的引用不可改变，而且String也没有提供方法来修改value数组某个元素
- 因此字符串的字符数组内容也是不可改变的，即String代表着不可变的字符序列。即，一旦对字符串进行修改，就会产生新的对象。
- JDK9.0之后，底层使用byte[]数组

```java
//JDK9.0中String源码
public final class String
    implements java.io.Serializable, Comparable<String>, CharSequence,
               Constable, ConstantDesc {
    /**
     * The value is used for character storage.
     *
     * @implNote This field is trusted by the VM, and is a subject to
     * constant folding if String instance is constant. Overwriting this
     * field after construction will cause problems.
     *
     * Additionally, it is marked with {@link Stable} to trust the contents
     * of the array. No other facility in JDK provides this functionality (yet).
     * {@link Stable} is safe here, because value is never null.
     */
    @Stable
    private final byte[] value;
```

> Java语言提供堆字符串串联符号`+`以及将其它对象转为字符串的特殊支持（toString方法）。

### String的内存结构

因为字符串对象设计为不可变，那么所以字符串有 常量池来保存很对常量对象。JDK6中，字符串常量池在方法区。JDK7开始，就移到堆空间中。

#### 使用字面量赋值

![](imgs/String_1.jpg)

```java
    public void test(){
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);   //true
    }
```

![](imgs/String_2.jpg)

```java
public class StringDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "Tom";
        p2.name = "Tom";
        System.out.println(p1==p2); //false
    }
}
class Person{
    String name;
}
```

#### 使用new构造器赋值

![](imgs/String_new.jpg)

```java
    public void test2() {
      	String s1 = "hello";
        String s2 = new String("hello");
        System.out.println(s1 == s2);   //false
    }
```

> s2首先指向堆中的一个字符串对象，然后堆中字符串对象的value数组指向常量池中常量对象的value数组
>
> - 字符串常量存储在字符串常量池，目的是共享
> - 字符串非常量对象存储在堆中

**练习：String s2 = new String("hello")；在内存中创建了几个对象？**

```txt
2个
```

#### intern()

```java
   public void test4() {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "hello" + "world";
        String s4 = s1 + "world";
        String s5 = s1 + s2;
        String s6 = (s1 + s2).intern();
        System.out.println(s3 == s4);   //false
        System.out.println(s3 == s5);   //false
        System.out.println(s4 == s5);   //false
        System.out.println(s3 == s6);   //true
    }
```

> 结论：
>
> - 常量+常量：结果是常量池。且常量池中不会存在相同内容的常量。
> - 变量与常量或变量与变量：结果在堆中
> - 拼接后调用intern()方法：返回值在常量池中

```java
	public void test2() {
        String s1 = new String("hello");
        String s2 = "hello";
        System.out.println(s1 == s2);   //false
    }
    @Test
    public void test3() {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2); //true
        s2 += "world";
        s1 = "helloworld";
        System.out.println(s1 == s2); //false
    }
    @Test
    public void test4() {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "hello" + "world";
        String s4 = s1 + "world";
        String s5 = s1 + s2;
        String s6 = (s1 + s2).intern();
        System.out.println(s3 == s4);   //false
        System.out.println(s3 == s5);   //false
        System.out.println(s4 == s5);   //false
        System.out.println(s3 == s6);   //true
    }
    @Test
    public void test5() {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        String s4 = s1 + "world";
        String s5 = s1 + s2;
        String s6 = "hello" + "world";
        System.out.println(s3 == s4);   //false
        System.out.println(s3 == s5);   //false
        System.out.println(s3 == s6);   //true
    }
    @Test
    public void test06(){
        final String s1 = "hello";
        final String s2 = "world";
        String s3 = "helloworld";
        String s4 = s1 + "world";
        String s5 = s1 + s2;
        String s6 = "hello" + "world";
        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//true
        System.out.println(s3 == s6);//true
    }
    @Test
    public void test07(){
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        String s4 = (s1 + "world").intern();//把拼接的结果放到常量池中
        String s5 = (s1 + s2).intern();
        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//true
    }
    @Test
    public void test08(){
        String str = "hello";
        String str2 = "world";
        String str3 ="helloworld";
        String str4 = "hello".concat("world");  //返回值是new的在堆中
        String str5 = "hello"+"world";
        System.out.println(str3 == str4);//false
        System.out.println(str3 == str5);//true
    }
```

**练习：下列程序运行结果**

```java
public class StringTest1 {
    String str = new String("good");
    char[] ch = {'g','o','o','d'};
    public void change(String str,char[] ch){
        str = "hello";
        ch[0] ='G';
    }
    public static void main(String[] args) {
        StringTest1 t = new StringTest1();
        t.change(t.str,t.ch);
        System.out.println(t.str);  //good
        for (int i = 0; i < t.ch.length; i++) { //Good
            System.out.print(t.ch[i]+"\t");
        }
    }
}
```

### String的常用API

#### 构造器

- `public String() ` ：初始化新创建的 String对象，以使其表示空字符序列。
- ` String(String original)`： 初始化一个新创建的 `String` 对象，使其表示一个与参数相同的字符序列；换句话说，新创建的字符串是该参数字符串的副本。
- `public String(char[] value) ` ：通过当前参数中的字符数组来构造新的String。
- `public String(char[] value,int offset, int count) ` ：通过字符数组的一部分来构造新的String。
- `public String(byte[] bytes) ` ：通过使用平台的**默认字符集**解码当前参数中的字节数组来构造新的String。
- `public String(byte[] bytes,String charsetName) ` ：通过使用指定的字符集解码当前参数中的字节数组来构造新的String。

```java
   public void test01() throws Exception{
        String s1 = new String("hello");
        String s2 = new String(s1);
        System.out.println(s2==s1); //false
        char[] s3 = {'h','e','l','l','o'};
        String s4 = new String(s3);
        System.out.println(s4); //hello
        byte[] b = {65,66,67};
        System.out.println(new String(b));  //ABC
        String s5 = new String(b,"utf-8");
    }
```

#### String与其他结构间的转换

**字符串 --> 基本数据类型、包装类：**

- Integer包装类的public static int parseInt(String s)：可以将由“数字”字符组成的字符串转换为整型。
- 类似的，使用java.lang包中的Byte、Short、Long、Float、Double类调相应的类方法可以将由“数字”字符组成的字符串，转化为相应的基本数据类型。

**基本数据类型、包装类 --> 字符串：**

- 调用String类的public String valueOf(int n)可将int型转换为字符串
- 相应的valueOf(byte b)、valueOf(long l)、valueOf(float f)、valueOf(double d)、valueOf(boolean b)可由参数的相应类型到字符串的转换。

 **字符数组 -->  字符串：**

- String 类的构造器：String(char[]) 和 String(char[]，int offset，int length) 分别用字符数组中的全部字符和部分字符创建字符串对象。 

 **字符串 -->  字符数组：**

- public char[] toCharArray()：将字符串中的全部字符存放在一个字符数组中的方法。

- public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)：提供了将指定索引范围内的字符串存放到数组中的方法。

**字符串 --> 字节数组：（编码）**

- public byte[] getBytes() ：使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
- public byte[] getBytes(String charsetName) ：使用指定的字符集将此 String 编码到 byte 序列，并将结果存储到新的 byte 数组。

 **字节数组 --> 字符串：（解码）**

- String(byte[])：通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String。
- String(byte[]，int offset，int length) ：用指定的字节数组的一部分，即从数组起始位置offset开始取length个字节构造一个字符串对象。
- String(byte[], String charsetName ) 或 new String(byte[], int, int,String charsetName )：解码，按照指定的编码方式进行解码。

```java
    public void test02(){
        String s1 = "helloworld";
        char[] ch = s1.toCharArray();
        String s2 = "ABC";
        byte[] b = s2.getBytes();
        String s3 = "456";
        int i = Integer.parseInt(s3);
        double d =45.3;
        String s4 = String.valueOf(d);
    }
```

### String常用API-2

`String`类包括的方法可用于检查序列的单个字符、比较字符串、搜索字符串、提取字符串、创建字符串副本并将所有字符全部转换为大写或小写。

#### 常用方法：

- boolean isEmpty()：字符串是否为空
- int length()：返回字符串的长度
- String concat(xx)：拼接
- boolean equals(Object obj)：比较字符串是否相等，区分大小写
- boolean equalsIgnoreCase(Object obj)：比较字符串是否相等，不区分大小写
- int compareTo(String other)：比较字符串大小，区分大小写，按照Unicode编码值比较大小;
- int compareToIgnoreCase(String other)：比较字符串大小，不区分大小写
- String toLowerCase()：将字符串中大写字母转为小写
- String toUpperCase()：将字符串中小写字母转为大写
- String trim()：去掉字符串前后空白符
- public String intern()：结果在常量池中共享

```java
		public void test03(){
        String s1 = "helloworld";
        System.out.println(s1.isEmpty());   //false
        System.out.println("".isEmpty());   //true
        System.out.println(s1.length());   //10
        String s2 = s1.concat("!!!");
        System.out.println(s2); //helloworld!!!
        String s3 = "HELLOWORLD";
        System.out.println(s1.equals(s3));  //false
        System.out.println(s1.equalsIgnoreCase(s3)); //true
        System.out.println("A".compareTo("a")); //-32
        System.out.println("A".compareToIgnoreCase("a")); //0
        System.out.println("abcd".toUpperCase());   //ABCD
        System.out.println("EFG".toLowerCase());    //efg
        System.out.println("    a b    ".trim());
        String str = "你好";
        String str1 = str.intern();
        System.out.println(str == str1);    //true
    }
```

#### 查找方法：

- boolean contains(xx)：是否包含xx
- int indexOf(xx)：从前往后找当前字符串中xx，即如果有返回第一次出现的下标，要是没有返回-1
- int indexOf(String str, int fromIndex)：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始
- int lastIndexOf(xx)：从后往前找当前字符串中xx，即如果有返回最后一次出现的下标，要是没有返回-1
- int lastIndexOf(String str, int fromIndex)：返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索。

```java
   public void test04(){
        String s1 = "helloworldhello";
        System.out.println(s1.contains("wor")); //true
        System.out.println(s1.indexOf("ll"));    //2
        System.out.println(s1.indexOf("ll",7)); //12
        System.out.println(s1.lastIndexOf("ld"));   //8
        System.out.println(s1.lastIndexOf("ll",10)); //2
    }
```

#### 字符串截取

- String substring(int beginIndex) ：返回一个新的字符串，它是此字符串的从beginIndex开始截取到最后的一个子字符串。 
- String substring(int beginIndex, int endIndex) ：返回一个新字符串，它是此字符串从beginIndex开始截取到endIndex(不包含)的一个子字符串。 

```java
 	public void test05(){
        String s1 = "helloworld";
        System.out.println(s1.substring(7));    //rld
        System.out.println(s1.substring(3,6));  //low
    }
```

#### 字符/字符数组

- char charAt(index)：返回[index]位置的字符
- char[] toCharArray()： 将此字符串转换为一个新的字符数组返回
- static String valueOf(char[] data)  ：返回指定数组中表示该字符序列的 String
- static String valueOf(char[] data, int offset, int count) ： 返回指定数组中表示该字符序列的 String
- static String copyValueOf(char[] data)： 返回指定数组中表示该字符序列的 String
- static String copyValueOf(char[] data, int offset, int count)：返回指定数组中表示该字符序列的 String

```java
    public void test06(){
        String s1 = "helloworld";
        System.out.println(s1.charAt(2));   //l
        char[] ch = s1.toCharArray();
        char[] ch2 = {'l','o','w'};
        String s2 = String.valueOf(ch2);
        String s3 = String.copyValueOf(ch);
    }
```

#### 开头与结尾

- boolean startsWith(xx)：测试此字符串是否以指定的前缀开始 
- boolean startsWith(String prefix, int toffset)：测试此字符串从指定索引开始的子字符串是否以指定前缀开始
- boolean endsWith(xx)：测试此字符串是否以指定的后缀结束 

```java
    public void test07(){
        String s1 = "helloworld";
        System.out.println(s1.startsWith("h")); //true
        System.out.println(s1.endsWith("d"));   //true
        System.out.println(s1.startsWith("w",5));   //true
    }
```

#### 替换

- String replace(char oldChar, char newChar)：返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。 不支持正则。
- String replace(CharSequence target, CharSequence replacement)：使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
- String replaceAll(String regex, String replacement)：使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。 
- String replaceFirst(String regex, String replacement)：使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。 

```java
	public void test08(){
        String s1 = "helloworld";
        String s2 = s1.replace("world","世界");
        System.out.println(s2); //hello世界
        String str1 = "hello244world.java;887";
        //把其中的非字母去掉
        str1 = str1.replaceAll("[^a-zA-Z]", "");
        System.out.println(str1);
        String str2 = "12hello34world5java7891mysql456";
        //把字符串中的数字替换成,，如果结果中开头和结尾有，的话去掉
        String string = str2.replaceAll("\\d+", ",").replaceAll("^,|,$", "");
        System.out.println(string);
    }
```

#### 常见算法题

```java
public class StringUtil {
    //取消字符串所有空格
    public static String trimOfAll(String str){
        String s = "";
        if (str != null){
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i,i+1).equals(" ")){
                    continue;
                }else {
                    s += str.substring(i,i+1);
                }
            }
        }
        return s;
    }
    //去掉字符串两端空格
    public static String trim(String str){
        int start = 0;
        int end =0;
        if (str != null){
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' '){
                    continue;
                }else {
                    start = i;
                    break;
                }
            }
            for (int i = str.length()-1; i >= 0; i--) {
                if (str.charAt(i) == ' '){
                    continue;
                }else {
                    end = i;
                    break;
                }
            }
        }
        return str.substring(start,end+1);
    }
    public static String trim2(String str){
        if (str != null){
            int start = 0;
            int end = str.length()-1;
            while (start < end && str.charAt(start) == ' '){
                start++;
            }
            while (end > start && str.charAt(end) == ' '){
                end--;
            }
            return str.substring(start,end+1);
        }
        return null;
    }
    //指定范围字符串的反转
    public static String reversel(String str,int start,int end){
        if (str != null){
            char[] charArray = str.toCharArray();
            for (int i = start,j=end; i < j; i++,j--) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
            }
            return new String(charArray);
        }
        return null;
    }
    public static String reversel2(String str,int start,int end){
        if (str!=null){
            String newStr = str.substring(0,start);
            for (int i = end; i >= start; i--) {
                newStr += str.charAt(i);
            }
            return new String(newStr+str.substring(end+1));
        }
        return null;
    }
    public static String reversel3(String str,int start,int end){
        if (str!=null){
            StringBuffer sb = new StringBuffer(str.length());
            sb.append(str.substring(0,start));
            for (int i = end; i >= start; i--) {
                sb.append(str.charAt(i));
            }
            return sb.append(str.substring(end+1)).toString();
        }
        return null;
    }
    //获取一个字符串在另一个字符串中出现的次数
    public static int getCount(String str,String subStr){
        if (str.equals(subStr)){
            return 0;
        }
        int count = 0;
        if (str.length()>=subStr.length()){
            int index = 0;
            for (int i = index; i < str.length(); i++) {
                if (str.indexOf(subStr,index) != -1){
                    index = str.indexOf(subStr,index)+subStr.length();
                    count++;
                }else {
                    break;
                }
            }
        }
        return count;
    }
    //对字符串进行自然顺序排序
    public static String stringSort(String str){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    public static void main(String[] args) {
        System.out.println(StringUtil.trimOfAll("   shjansa  sa   "));
//        System.out.println(StringUtil.trim("   sh  hb  ")+"**");
        System.out.println(StringUtil.trim2("   sh  hb  ")+"**");
        System.out.println(StringUtil.reversel3("helloworld",2,6));  //heowollrld
        System.out.println(StringUtil.getCount( "abkkcadkabkebfkabkskab","ab"));
        System.out.println(StringUtil.stringSort("DCBA"));  //ABCD
    }
}
```

### 字符串相关类之可变字符序列：StringBuffer、StringBuilder

因为String对象是不可变对象，虽然可以共享常量对象，但是对于频繁字符串的修改和拼接操作，效率极低，空间消耗也比较高。因此，JDK又在java.lang包提供了可变字符串序列StringBuffer和StringBuilder类型。

#### StringBuffer与StringBuilder概述

java.lang.StringBuffer代表可变字符序列，JDK1.0中声明，可以对字符串内容进行增删，此时不会产生新的对象。

```java
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("我喜欢学习");
        sb.append(" JAVA");
        System.out.println(sb); //我喜欢学习 JAVA
    }
}
```

#### 继承结构

<img src="imgs/AbstractStringBuilder.png"/>

#### StringBuffer与StringBuilder区别

StringBuilder和StringBuffer非常相似，均代表可变字符序列，而且提供相关功能的方法也一样。

- String、StringBuffer、StringBuilder区别：
  - String：不可变字符序列；底层使用char[]数组存储(JDK8.0中)
  - StringBuffer：可变的字符序列；线程安全（方法有synchronized修饰），效率低；底层使用char[]数组存储（JDK8.0中）
  - StringBuilder：可变的字符序列；JDK1.5引入，线程不安全的，效率高；底层使用char[]数组存储（JDK8.0中）

> 当append和insert时，如果原来value数组长度不够，可扩容。
>
> ```java
>  //JDK1.8源码   
> @Override    
> synchronized StringBuffer append(String str) {        
>   toStringCache = null;        
>   super.append(str);      
>   return this;   
> }
> ```

### StringBuilder、StringBuffer的API

StringBuilder、StringBuffer的API是完全一致的，并且很多方法与String相同。

#### 常用API

- StringBuffer append(xx)：提供了很多的append()方法，用于进行字符串追加的方式拼接
- StringBuffer delete(int start, int end)：删除[start,end)之间字符
- StringBuffer deleteCharAt(int index)：删除[index]位置字符
- StringBuffer replace(int start, int end, String str)：替换[start,end)范围的字符序列为str
- void setCharAt(int index, char c)：替换[index]位置字符
- char charAt(int index)：查找指定index位置上的字符
- StringBuffer insert(int index, xx)：在[index]位置插入xx
- int length()：返回存储的字符数据的长度
- StringBuffer reverse()：反转

#### 其他API

- int indexOf(String str)：在当前字符序列中查询str的第一次出现下标
- int indexOf(String str, int fromIndex)：在当前字符序列[fromIndex,最后]中查询str的第一次出现下标
- int lastIndexOf(String str)：在当前字符序列中查询str的最后一次出现下标
- int lastIndexOf(String str, int fromIndex)：在当前字符序列[fromIndex,最后]中查询str的最后一次出现下标
- String substring(int start)：截取当前字符序列[start,最后]
- String substring(int start, int end)：截取当前字符序列[start,end)
- String toString()：返回此序列中数据的字符串表示形式
- void setLength(int newLength) ：设置当前字符序列长度为newLength

```java
public class StringBuilderTest {
    @Test
    public void test01(){
        StringBuilder sb = new StringBuilder();
        sb.append("hello").append(true).append('a').append(123);
        System.out.println(sb); //hellotruea123
        System.out.println(sb.length());    //13
    }
    @Test
    public void test02(){
        StringBuilder sb = new StringBuilder("helloworld");
        sb.insert(5,"java");
        System.out.println(sb); //hellojavaworld
    }
    @Test
    public void test03(){
        StringBuilder sb = new StringBuilder("helloworld");
        sb.deleteCharAt(2);
        sb.delete(5,10);
        System.out.println(sb); //helow
    }
    @Test
    public void test04(){
        StringBuilder sb = new StringBuilder("helloworld");
        sb.reverse();
        System.out.println(sb); //dlrowolleh
    }
    @Test
    public void test05(){
        StringBuilder sb = new StringBuilder("helloworld");
        sb.setCharAt(2,'A');
        System.out.println(sb); //heAloworld
    }
    @Test
    public void test06(){
        StringBuilder sb = new StringBuilder("helloworld");
        sb.setLength(15);
        System.out.println(sb); //helloworld     
        System.out.println(sb.length());    //15
    }
}
```

#### String、StringBuffer、StringBuilder效率对比

```java
public class EfficiencyTest {
    public static void main(String[] args) {
        //初始设置
        long startTime = 0L;
        long endTime = 0L;
        String text = "";
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");

				//开始对比
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间：" + 
                           (endTime - startTime));  //StringBuffer的执行时间：4 						
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间：" + 
                           (endTime - startTime));  //StringBuilder的执行时间：3
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间：" + 
                           (endTime - startTime));  //String的执行时间：995
    }
}
```

#### 面试题

```java
public class InterviewQuestion {
    public static void main(String[] args) {
        String str = null;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        System.out.println(sb); //null
        System.out.println(sb.length());    //4
        StringBuilder sb2 = new StringBuilder(str); //NullPointerException
        System.out.println(sb2);
    }
}
```
