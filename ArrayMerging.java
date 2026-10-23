import java.util.*;

public class ArrayMerging{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            long n = sc.nextLong();
            long[] a = new long[(int)(n)];
            long[] b = new long[(int)(n)];
            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }
            for(int j=0; j<n; j++){
                b[j] = sc.nextLong();
            }
            long[] longestSubarrayA = new long[(int)(2*n+1)];
            long[] longestSubarrayB = new long[(int)(2*n+1)];
            long cnt = 1;
            for(int i=1; i<n; i++){
                if(a[i] == a[i-1]){
                    cnt++;
                }else{
                    longestSubarrayA[(int)a[i-1]] = Math.max(longestSubarrayA[(int)a[i-1]],cnt);
                    cnt = 1;
                }
            }
			longestSubarrayA[(int) a[(int) (n - 1)]] = Math.max(longestSubarrayA[(int) a[(int) (n - 1)]], cnt);
            cnt = 1;
            for(int i=1; i<n; i++){
                if(b[i] == b[i-1]){
                    cnt++;
                }else{
                    longestSubarrayB[(int)b[i-1]] = Math.max(longestSubarrayB[(int)b[i-1]],cnt);
                    cnt = 1;
                }
            }
            longestSubarrayB[(int)b[(int)(n-1)]] = Math.max(longestSubarrayB[(int)b[(int)(n-1)]],cnt);

            long maxFreq = -1;
            for(int i=1; i<=2*n; i++){
                maxFreq = Math.max(maxFreq,longestSubarrayA[i] + longestSubarrayB[i]);
            }
            System.out.println(maxFreq);
        }
        sc.close();
    }
}