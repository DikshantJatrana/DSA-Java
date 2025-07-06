public class keypad{

    public static String value[] = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void keys(String str ,int idx ,String newStr){
        if(str.length() == idx){
            System.out.println(newStr);
            return;
        }
        Character ch = str.charAt(idx);
        int n = Character.getNumericValue(ch);
        String st = value[n];
        for (int i = 0; i < st.length(); i++) {
            keys(str, idx+1, newStr + st.charAt(i));
        }

    }
    public static void main(String[] args) {
        String str = "63";
        keys(str,0,"");
    }
}