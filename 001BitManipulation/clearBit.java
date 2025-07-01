
import java.util.Scanner;

public class clearBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();

        int bitMask = 1<<pos;
        if((bitMask & n) == 0){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else{
            int newNumber = ~bitMask & n;
            System.out.println(newNumber);
        }
    }
}
