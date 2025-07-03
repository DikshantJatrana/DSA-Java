public class removeDuplicate {
    public static boolean[] map = new boolean[26];
    public static void remove(String str,int index, String strNew){
        if(index == str.length()){
            System.out.println(strNew);
            return;
        }
        Character chr = str.charAt(index);
        if(map[chr - 'a'] == true){
            remove(str, index+1, strNew);
        }else{
            map[chr - 'a'] = true;
            strNew += chr;
            remove(str, index, strNew);
        }
    }
    public static void main(String[] args) {
        String str = "acbdeabgghabdeghijjklkm";
        remove(str, 0, "");
    }
}
