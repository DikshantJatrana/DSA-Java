
public class power {
    public static int pow(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return x*pow(x, n-1);
    }
    public static void main(String[] args) {
        int x = 5;
        int n = 4;
        int res = pow(x, n);
        System.out.println(x+" raise to power "+n+" is "+res);
    }
}
