public class subsequences {
    public static void sub(String str ,int idx , String check){
        if(idx == str.length()){
            System.out.println(check);
            return;
        }
        sub(str, idx+1, check+str.charAt(idx));
        sub(str, idx+1, check);
    }

    public static void main(String[] args) {
        String str = "abc";
        sub(str, 0, "");
    }
}
