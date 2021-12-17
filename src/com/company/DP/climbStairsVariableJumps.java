package com.company.DP;

public class climbStairsVariableJumps {
    public static void climbStairs(int n, int[] arr){
        int [] dp = new int[n+1];
        dp[n] = 1;
        for(int i = n-1;i>=0;i--){
            for(int j=1;j<=arr[i]&&i+j<dp.length;j++){
                dp[i] = dp[i]+dp[i+j];
            }
        }
        System.out.println(dp[0]);

    }
    public static void main(String[] args) {
       int [] arr = {1,2,3,4,5,6};
       climbStairs(arr.length,arr);
    }
}
