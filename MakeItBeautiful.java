import java.util.*;

public class MakeItBeautiful {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int maxi = arr[n-1];
            int mini = arr[0];
            if(mini == maxi) System.out.println("NO");
            else{
                System.out.println("YES");
                System.out.print(maxi+" ");
                for(int i=0; i<n-1; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
}
