// import java.util.*;

// public class SubstringKDistinctAlternatingParities {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         int k = sc.nextInt();
//         int x = atMostK(s,k);
//         int y = atMostK(s,k-1);

//         System.out.println(x-y);

//     }

//     public static int atMostK(String s, int k){
//         if(k <= 0) return 0;
//         int n = s.length();
//         int left = 0;
//         int right = 0;
//         int res = 0;
//         HashMap<Character,Integer> hmp = new HashMap<>();
//         for(right=0; right<n; right++){
//             if(right > 0){
//                 if((s.charAt(right)-'a')%2 == (s.charAt(right-1)-'a')%2){
//                    left = right;
//                    hmp.clear();
//                 }
//             }
//             hmp.put(s.charAt(right),hmp.getOrDefault(s.charAt(right),   0)+1);


//             while(hmp.size() > k){ 
//                 hmp.put(s.charAt(left),hmp.get(s.charAt(left))-1);
//                 if(hmp.get(s.charAt(left)) == 0){
//                     hmp.remove(s.charAt(left));
//                 }
//                 left++;
//             }

//             res += (right-left+1);
//         }
//         return res;
//     }
// }


import java.util.*;

public class SubstringKDistinctAlternatingParities {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        
        // Fixed subtraction syntax
        System.out.println(atMostK(s, k) - atMostK(s, k - 1));
    }

    public static int atMostK(String s, int k){
        if (k <= 0) return 0;
        
        int n = s.length();
        int left = 0;
        int res = 0;
        HashMap<Character, Integer> hmp = new HashMap<>();

        for (int right = 0; right < n; right++) {
            // 1. Reset window if adjacent characters share the same parity
            if (right > 0) {
                if ((s.charAt(right) - 'a') % 2 == (s.charAt(right - 1) - 'a') % 2) {
                   left = right;
                   hmp.clear();
                }
            }

            // 2. Always add the current character to the map
            hmp.put(s.charAt(right), hmp.getOrDefault(s.charAt(right), 0) + 1);

            // 3. Shrink window if unique characters exceed k
            while (hmp.size() > k) { 
                hmp.put(s.charAt(left), hmp.get(s.charAt(left)) - 1);
                if (hmp.get(s.charAt(left)) == 0) {
                    hmp.remove(s.charAt(left));
                }
                left++;
            }

            // 4. Count valid substrings ending at 'right'
            res += right - left + 1;
        }
        return res;
    }
}