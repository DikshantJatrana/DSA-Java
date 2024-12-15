import java.util.*;

public class Greater{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();

        if(a==b){
            System.out.println("both number are equal");
        }
        else if (a>b) {
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }
    }
}