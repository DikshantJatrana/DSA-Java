
public class factorial {
    public static void fact(int n,int fac){
        if(n==0){
            fac *= 1;
            System.out.print(fac);
            return;
        }
        fac *= n;
        fact(n-1, fac);
    }
    public static void main(String[] args) {
        fact(2, 1);
        System.out.println();
    }
}
