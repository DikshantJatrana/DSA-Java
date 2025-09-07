public class Get{
    public static void main(String[] args) {
        int num = 5;
        int pos = 2;
        int Bitmask = 1 << pos;
        if((Bitmask & num) == 0){
            System.out.println("Bit on pos is 0");
        }else{
            System.out.println("Bit on pos is 1");
        }
    }
}