import java.util.*;
public class Coins {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
			long n = sc.nextLong(); // Read the value of n
			long k = sc.nextLong(); // Read the value of k
            if(n%2 == 0 || (n-k)%2 == 0){
                System.out.println("YES");
            }else System.out.println("NO");
        }
        sc.close();
    }
}
