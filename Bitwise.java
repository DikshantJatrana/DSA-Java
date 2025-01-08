
public class Bitwise{
    public static void main(String[] args) {
        int n = 5; //101
        int pos = 1;
        int pos2 = 2;
        int bitMask = 1<<pos;
        
        if((bitMask & n)==0){
            System.out.println("bit was 0");
        }else{
            System.out.println("bit waas 1");
        }

        int newNumber = bitMask | n;
        System.out.println(newNumber);

        int bitMask2 = ~(1<<pos2);
        int clearBit = bitMask2 & n;
        System.out.println(clearBit);
    }
}