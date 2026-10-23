import java.util.*;

public class Monsters{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            List<long[]> lst = new ArrayList<>();
            for(long i=0; i<n; i++){
                long a = sc.nextLong();
                lst.add(new long[]{a,i+1});
            }

            for(long[] hp : lst){
                hp[0] = hp[0]%k;
                if(hp[0] == 0){
                    hp[0] = k;
                }
            }

            lst.sort((a,b) -> {
                if(a[0] != b[0]){
                    return Long.compare(b[0],a[0]);
                }
                return Long.compare(a[0],b[0]);
            });

            for(long[] hp : lst){
                System.out.print(hp[1] +" ");
            }
            System.out.println();
        }
    }
}