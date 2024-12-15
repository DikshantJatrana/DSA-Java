
import java.util.Scanner;

public class Function {
    public static int sum(int a,int b){
        int add = a+b;
        return add;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum(a, b));
    }
}
