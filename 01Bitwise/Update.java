public class Update {
    public static void main(String[] args) {
        int num = 5;
        int pos = 3;
        int Bitmask = 1 << pos;
        int newNum;

        if((num & Bitmask) == 0){
            newNum = num | Bitmask;
        }
        else{
            newNum = num & (~Bitmask);
        }

        System.out.println("New number after Updating number is "+newNum);
    }
}
