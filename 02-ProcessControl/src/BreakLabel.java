public class BreakLabel {
    public static void main(String[] args) {
        label:for (int i=1; i<=5;i++){
            for (int j=1; j<=5; j++){
                if(j%4==0){
                    break label;
                }
                System.out.println(j);
            }
            System.out.println();
        }
    }
}
