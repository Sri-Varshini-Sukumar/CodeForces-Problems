import java.util.*;

public class DistinctSplit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            long[] prefix = new long[n+1];
            long[] suffix = new long[n+1];
            HashSet<Character> st = new HashSet<>();
            for(int i=1; i<=n; i++){
                st.add(s.charAt(i-1));
                prefix[i] = st.size();
            }
            st.clear();
            for(int i=n; i>=1; i--){
                st.add(s.charAt(i-1));
                suffix[i] = st.size();
            }
            long ans = 0;
            for(int i=0; i<n; i++){
                ans = Math.max(ans,suffix[i+1] + prefix[i]);
            }
            System.out.println(ans);
        }
    }
}