import java.util.*;

public class HarmoniusElevationSegments{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] heights = {12,4,6,8};
        int maxDiff = 2;
        int m = 5;
        int n = heights.length;
        int maxLen = 0;
        int left = 0;
        int right = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int windowSum = 0;
        for(right=0; right<n; right++){
            if(right > 0 && Math.abs(heights[right] - heights[right-1]) > maxDiff){
                left = right;
            }
            windowSum += heights[right];
            int rem = (windowSum % m + m)%m;
            if(map.containsKey(rem)){
                int prevIndex = map.get(rem);
                if(prevIndex >= left-1){
                    maxLen = Math.max(maxLen,right-prevIndex);
                }else{
                    map.put(rem,right);
                }
            }else{
                map.put(rem,right);
            }
        }

        System.out.println(maxLen);

    }
}