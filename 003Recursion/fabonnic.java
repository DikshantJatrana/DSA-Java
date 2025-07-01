
public class fabonnic {
    public static void fab(int a,int b,int n){
        if(n==0){
            return;
        }
        int sum = a+b;
        System.out.print(sum+" ");
        fab(b, sum, n-1);
    }
    public static void main(String[] args) {
        int n = 12 ;
        System.out.print("0 1 ");
        fab(0, 1, n-2);
    }
}
