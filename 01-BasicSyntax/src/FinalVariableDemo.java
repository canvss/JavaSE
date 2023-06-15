public class FinalVariableDemo {
    public static void main(String [] args){
        final int FULL_MARK = 100;
        System.out.println("满分：" + FULL_MARK);
        int passMark = FULL_MARK - 40;
        System.out.println("及格：" + passMark);
    }
}
