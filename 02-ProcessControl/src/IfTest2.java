import java.util.Scanner;

public class IfTest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入考试成绩：");
        int score = input.nextInt();
        if (score >= 90){
            System.out.println("优秀");
        }else if (score >= 70){
            System.out.println("良好");
        } else if (score >= 60){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }
        input.close();
    }
}
