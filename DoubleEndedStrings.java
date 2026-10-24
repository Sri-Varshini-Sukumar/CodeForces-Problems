import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class DoubleEndedStrings {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        while(t-- > 0){
            String s1 = br.readLine();
            String s2 = br.readLine();
            int n = s1.length();
            int m = s2.length();
            int res = 0;
            int[][] dp = new int[n+1][m+1];
            for(int i=1; i<=n; i++){
                for(int j=1; j<=m; j++){
                    if(s1.charAt(i-1) == s2.charAt(j-1)){
                        dp[i][j] = 1 + dp[i-1][j-1];
                        res = Math.max(res,dp[i][j]);
                    }else{
                        dp[i][j] = 0;
                    }
                }
            }
            System.out.println((n+m)-(2*res));
        }
    }
}
