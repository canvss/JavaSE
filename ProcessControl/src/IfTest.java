import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入数字:");
        int i = input.nextInt();
        if (i % 2 == 0){
            System.out.println(i + " 偶数");
        }else {
            System.out.println(i + " 奇数");
        }
    }
}
