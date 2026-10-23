import java.util.*;

public class BerSuBall{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] a = new long[(int)n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
        }
        long m = sc.nextLong();
        long[] b = new long[(int)m];
        for(int i=0; i<m; i++){
            b[i] = sc.nextLong();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        int j = 0;
        int pairs = 0;
        while(i < n && j < m){
            if(Math.abs(a[i]-b[j]) <= 1){
                pairs++;
                i++;
                j++;
            }else if(a[i] < b[j]){
                i++;
            }else j++;
        }
        System.out.println(pairs);
    }
}