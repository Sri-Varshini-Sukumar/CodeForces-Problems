import java.util.*;

public class OlyaAndGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            long n = sc.nextLong();
            List<Long> secondElements = new ArrayList<>();
            long lowestFirstMin = Long.MAX_VALUE;
            for(int i=0; i<n; i++){
                long m = sc.nextLong();
                long[] a = new long[(int)(m)];
                for(int j=0; j<m; j++){
                    a[j] = sc.nextLong();
                }
                Arrays.sort(a);
                secondElements.add(a[1]);
                lowestFirstMin = Math.min(lowestFirstMin,a[0]); //
            }
            Collections.sort(secondElements);
            long sumOfElements = 0;
            for(long element : secondElements){
                sumOfElements += element;
            }
            long lowestSecondMin = secondElements.get(0);
            long ans = lowestFirstMin+sumOfElements-lowestSecondMin;
            System.out.println(ans);
        }
    }
}