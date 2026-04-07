import java.util.*;

public class GoodMatrixA1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int mid = n/2;
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j || i + j == n-1 || i == mid || j == mid) sum += mat[i][j];
            }
        }

        System.out.println(sum);
    }
}