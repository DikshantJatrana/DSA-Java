public class Clear{
    public static void main(String[] args) {
        int num = 5;
        int pos = 2;
        int Bitmask = 1 << pos;

        int newNum = num & (~Bitmask);
        System.out.println("New number after clearing an bit is "+newNum);
    }
}