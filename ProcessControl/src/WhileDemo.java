import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int num;
        while (true){
            System.out.print("请输入整数（0表示结束）：");
            num = input.nextInt();
            if (num > 0){
                positive++;
            }else if (num < 0){
                negative++;
            }else{
                break;
            }
        }
        System.out.println("正数：" + positive + "个");
        System.out.println("负数：" + negative + "个");
        input.close();
    }
}
