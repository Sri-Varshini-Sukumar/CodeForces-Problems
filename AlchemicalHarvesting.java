import java.util.*;

public class AlchemicalHarvesting{
    public static int f(int index, int[] values, int[] costs, int budget, int k,int[][] dp){
        if(index < 0 || index >= values.length) return 0;
        if(dp[index][budget] != 0) return dp[index][budget];
        int pick = 0; 
        if(budget >= costs[index]) pick = values[index] + f(index+k+1, values, costs, budget - costs[index], k,dp);
        int notPick = 0 + f(index+1, values, costs, budget,k,dp);
        return dp[index][budget] = Math.max(pick,notPick);
    }
    public static void main(String[] args){
        int[] values = {10, 20, 15, 30};
        int[] costs = {2, 3, 2, 5};
        int budget = 8;
        int k = 1;
        int n = values.length;
        int[][] dp = new int[n][budget+1];
        //for(int[] row : dp) Arrays.fill(dp,-1);
        System.out.println(f(0,values,costs,budget,k,dp));
    }
}