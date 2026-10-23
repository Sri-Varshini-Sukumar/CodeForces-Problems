import java.util.*;
public class OneAndTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();
            int totalTwos = 0;
            int currentTwos = 0;
            for(int i=0; i<n; i++){
                if(arr[i] == 2) totalTwos++;
            }
            int ans = -1;
            for(int i=0; i<n; i++){
                if(arr[i] == 2) currentTwos++;

                if(currentTwos == totalTwos - currentTwos){
                    ans = i+1;
                    break;
                }
            }
            System.out.println(ans);   
        }
        sc.close();
    }
}