import java.util.HashSet;

public class uniqueSubSequences {
    public static void unique(String str,int idx , String strNew , HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(strNew)){
                return;
            }else{
                set.add(strNew);
                System.out.println(strNew);
                return;
            }
        }
        unique(str, idx+1, strNew+str.charAt(idx), set);
        unique(str, idx+1, strNew, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        unique(str, 0, "", set);
    }
}
