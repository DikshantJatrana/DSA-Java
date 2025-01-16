public class Recursion {
    public static void printInt(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printInt(n-1);
    }

    public static void printInt1to5(int n){
        if(n > 5){
            return;
        }
        System.out.print(n+" ");
        printInt1to5(n+1);
    }

    public static void sumOfN(int n,int i,int sum){
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sumOfN(n, i+1, sum);
    }

    public static int factorial(int n){
        if(n==1||n==0){
            return 1;
        }
        int fact = n*factorial(n-1);
        return fact;
    }

    public static void printFib(int a,int b,int n){
        if(n==0){
            return;
        }
        int c= a+b;
        System.out.print(c+" ");
        printFib(b, c, n-1);
    }

    public static int Power(int n,int x){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpown1 = x*Power(n-1, x);
        return xpown1;
    }

    public static int LogPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return LogPower(x, n/2)*LogPower(x, n/2);
        }else{
            return LogPower(x, n/2)*LogPower(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        int n =5;
        int m =1;
        printInt(n);
        System.out.println();
        printInt1to5(m);
        System.out.println();
        sumOfN(5, 1, 0);
        System.out.println();
        int ans = factorial(n);
        System.out.println(ans);
        int a =0;
        int b= 1;
        int j =8;
        System.out.print(a+" "+b+" ");
        printFib(a, b, j-2);
        System.out.println();
        int power = Power(4, 3);
        System.out.println(power);
        System.out.println();
        int ans1 = LogPower(3, 5);
        System.out.println(ans1);
    }
}
 