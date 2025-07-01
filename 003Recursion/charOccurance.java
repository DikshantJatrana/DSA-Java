public class charOccurance {
    public static  int first = -1;
    public static  int last = -1;

    public static void occurance(String str, int idx, char chr){
        if(idx == str.length()){
            System.out.println("first occurence is at "+first+" last occurence at "+last);
            return;
        }
        if(str.charAt(idx) == chr){
            if(first == -1){
                first = idx;
            }
            last = idx;
        }
        occurance(str, idx+1, chr);
    }
    public static void main(String[] args) {
        String str = "aachdefghafeadraeb";
        occurance(str, 0, 'b');
    }
}
