public class reverseString {
    public static void reverse(String Str) {
        if(Str.length() == 0){
            return;
        }
        int len = Str.length()-1;
        System.out.print(Str.charAt(len));
        String remaining = Str.substring(0, len);
        reverse(remaining);

    }
    public static void main(String[] args) {
        String str = "dikshant";
        reverse(str);
        System.out.println();
    }
}
