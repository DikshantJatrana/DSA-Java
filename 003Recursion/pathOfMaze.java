public class pathOfMaze{
    public static int count( int i ,int j , int n ,int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        int down = count(i+1, j, n, m);
        int right = count(i, j+1, n, m);
        return down + right;
    }

    public static void main(String[] args) {
        int n = 2, m = 2;
        int path = count(0, 0, n, m);
        System.out.println("number of path for maze are :-- "+path);
    }
}