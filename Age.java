import java.util.*;
public class Age {
    public static void main(String[] agrs){
        Scanner sc =new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("your are an adult");
        }
        else{
            System.out.println("you are not adult");
        }
    }
}
