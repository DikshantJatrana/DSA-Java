import java.util.*;
public class getBit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int pos = sc.nextInt();
        int bitMask = 1<<pos;

        if((bitMask & n) == 0){
            System.out.println("0 is present at "+ pos);
        }else{
            System.out.println("1 is present at "+pos);
        }
    }
}