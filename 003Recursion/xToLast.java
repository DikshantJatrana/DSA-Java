public class xToLast {
    public static int count = 0;
    public static String Str1 = "";
    public static void Last(String str,int index){
        if(index == str.length()){
            Str1 = Str1 + "x".repeat(count);
            System.out.println(Str1);
            return;
        }
        Character chr = str.charAt(index);
        if(chr != 'x'){
            Str1=Str1+chr;
        }else{
            count++;
        }
        Last(str, index+1);
    }

    public static void main(String[] args) {
        String str = "axbcxxdxef";
        Last(str,0);
    }
}
