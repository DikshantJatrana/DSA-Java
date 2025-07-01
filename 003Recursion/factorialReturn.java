public class factorialReturn {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fac = n*fact(n-1);
        return fac;
    }
    public static void main(String[] args) {
        int n = 6;
        int res = fact(n);
        System.out.println("factorial is "+res);
    }
}
