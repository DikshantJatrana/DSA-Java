public class permutationString{
    public static void permutation(String str, String newStr){
        if(str.length() == 0){
            System.out.print(newStr+" ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String currString = str.substring(0,i)+str.substring(i+1);
            permutation(currString, newStr+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abcd";
        permutation(str ,"");
    }
}