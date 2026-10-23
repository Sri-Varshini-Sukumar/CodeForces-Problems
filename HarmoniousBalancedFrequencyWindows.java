import java.util.*;

public class HarmoniousBalancedFrequencyWindows {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {8, 2, 4, 7};
        int maxSpread = 4;
        int k = 1;
        HashMap<Integer,Integer> hmp = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxi = arr[0];
        int mini = arr[0];
        int n = arr.length;
        int res = 0;
        for(right=0; right<n; right++){
            hmp.put(arr[right],hmp.getOrDefault(arr[right],0)+1);
            if(arr[right] > maxi){
                maxi = arr[right];
            }
            if(arr[right] < mini){
                mini = arr[right];
            }

            System.out.println(maxi+" " +mini);
            if(Math.abs(maxi-mini) > maxSpread){
                mini = arr[right];
                maxi = arr[right];
            }
            
            if(Math.abs(maxi-mini) <= maxSpread && hmp.get(maxi) <= k && hmp.get(mini) <= k){
                res = Math.max(res,right-left+1);
            }

            while(hmp.get(arr[right]) > k){
                hmp.put(arr[left],hmp.get(arr[left])-1);
                if(hmp.get(arr[left]) == 0){
                    hmp.remove(arr[left]);
                }
                left++;
            }
        }
        System.out.println(res);
        sc.close();
    }
}
