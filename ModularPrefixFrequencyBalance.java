import java.util.*;

public class ModularPrefixFrequencyBalance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,8};
        int m = 5;
        int k = 2;

        int currsum = 0;
        int left=0;
        int right=0;
        int n = arr.length;
        int max = 0;
        HashMap<Integer,Integer> hmp = new HashMap<>();
        for(right=0; right<n; right++){
            currsum += arr[right];
            hmp.put(arr[right],hmp.getOrDefault(arr[right],0)+1);
            while(hmp.get(arr[right]) > k){
                currsum -= arr[left];
                hmp.put(arr[left],hmp.get(arr[left])-1);
                if(hmp.get(arr[left]) == 0){
                    hmp.remove(arr[left]);
                }
                left++;
            }
            if(currsum%m == 0){
            max = Math.max(max,right-left+1);
            }
        }
        System.out.println(max);
    }
}