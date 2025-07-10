public class invitePeople{
    public static int invite(int n){
        if(n <= 1){
            return 1;
        }
        int single = invite(n-1);
        int couple = invite(n-2);
        return single + couple * (n-1);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(invite(n));
    }
}