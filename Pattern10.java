public class Pattern10 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(4-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(4-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=4-i;j<=4;j--){
                System.out.print(" ");
            }
            for(int j=4-i;j<=4;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
