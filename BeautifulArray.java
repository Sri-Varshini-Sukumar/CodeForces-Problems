import java.util.*;

public class BeautifulArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long b = sc.nextLong();
            long s = sc.nextLong();
            long minimum_s = k * b;
            long maximum_s = k * b + (k - 1) * n;
            if(s < minimum_s || s > maximum_s){
                System.out.println("-1");
            }else{
                long[] ans = new long[(int)n];
                ans[0] = minimum_s;
                s -= minimum_s;
                for(int i=0; i<n; i++){
                    long add = Math.min(k-1,s);
                    ans[i] += add;
                    s -= add;
                }
                for(long val : ans){
                    System.out.print(val+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}