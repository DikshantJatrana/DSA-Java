public class sumOfNumber {
    public static void sumNum(int n,int i,int sum){
        if(i==n){
            sum += n;
            System.out.println("sum is "+sum);
            return;
        }
        sum += n;
        sumNum(n+1, i, sum);
    }
    public static void main(String[] args) {
        sumNum(1, 10, 0);
    }
}
