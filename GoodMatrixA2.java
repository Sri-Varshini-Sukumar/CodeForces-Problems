/*

The Smart Beaver from ABBYY got hooked on square matrices. Now he is busy studying an n × n size matrix, where n is odd. The Smart Beaver considers the following matrix elements good:

Elements of the main diagonal.
Elements of the secondary diagonal.
Elements of the "middle" row — the row which has exactly  rows above it and the same number of rows below it.
Elements of the "middle" column — the column that has exactly  columns to the left of it and the same number of columns to the right of it.

*/

import java.util.*;
public class GoodMatrixA2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = n/2;
        int sum = 0;
        int[][] mat = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j ||  i+j == n-1 || i == mid || j == mid){
                    sum += mat[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
