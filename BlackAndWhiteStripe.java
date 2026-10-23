import java.util.*;

public class BlackAndWhiteStripe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int current_W = 0;
            for(int i=0; i<k; i++){
                if(s.charAt(i) == 'W'){
                    current_W++;
                }
            }
            int mini = current_W;
            for(int i=k; i<n; i++){
                if(s.charAt(i-k) == 'W'){
                    current_W--;
                }
                if(s.charAt(i) == 'W'){
                    current_W++;
                }
                mini = Math.min(mini,current_W);
            }
            System.out.println(mini);
        }
        sc.close();
    }
}