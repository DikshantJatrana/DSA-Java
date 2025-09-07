public class Set{
    public static void main(String[] args) {
        int num = 5;
        int pos = 1;
        int Bitmask = 1 << pos;

        int newnum = num | Bitmask;
        System.out.println(newnum);
    }
}