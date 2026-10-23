import java.util.*;
public class VasilijeinCacak {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();
            long minimumSum = (k * (k+1))/2;
            long maximumSum = (n*(n+1))/2 - ((n-k) * (n-k+1))/2;
            if(x >= minimumSum && x <= maximumSum){
                System.out.println("YES");
            }else System.out.println("NO");
        }
        sc.close();
    }
}
