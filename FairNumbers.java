import java.util.*;

public class FairNumbers{
    public static boolean isFair(long n){
        long num = n;
        while(num != 0){
            long digit = num%10;
            if(digit != 0 && n%digit != 0) return false;
            num /= 10;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            long n = sc.nextLong();
            while(!isFair(n)){
                n++;
            }
            System.out.println(n);
        }
        sc.close();
    }
}