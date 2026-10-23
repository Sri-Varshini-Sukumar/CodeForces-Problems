import java.util.*;

public class BlankSpace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int count_0s = 0;
            int maxi = 0;

            for(int i=0; i<n; i++){
                if(arr[i] == 0) count_0s++;
                else count_0s = 0;
                maxi = Math.max(maxi,count_0s);
            }
            System.out.println(maxi);
        }
    }
}
