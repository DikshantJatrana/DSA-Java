public class tileCombination{
    public static int combination(int n,int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        int hor = combination(n-1, m);
        int ver = combination(n-m, m);

        return hor+ver;
    }
    public static void main(String[] args) {
        int n = 4,m = 4;
        System.out.println(combination(n,m));
    }
}