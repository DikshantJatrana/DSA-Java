
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int marks[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++){
                marks[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++){
                System.out.print(marks[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    
}
