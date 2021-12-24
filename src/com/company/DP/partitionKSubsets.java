package com.company.DP;

public class partitionKSubsets {
    // Reccursive Solution
    // TC  - 2^n
    public static int  partition(int n,int k){
        if(n==0 || k==0 || n<k){
            return 0;
        }
        else if(n==k){
            return 1;
        }
        return k*partition(n-1,k)+partition(n-1,k-1);
    }
    // DP Optimization (n^2)
    public static long partitionTeams(int n,int k) {
        long[][] dp = new long[k + 1][n+1];
        if (n == 0 || k == 0 || n < k) {
            return 0;
        } else if (n == k) {
            return 1;
        }
        for(int t=1;t<=k;t++){
            for(int p=1;p<=n;p++){
                if(p<t){
                    dp[t][p] = 0;
                }
               else if(t==p){
                    dp[t][p] = 1;
                }
               else{
                   dp[t][p] = t*dp[t][p-1]+dp[t-1][p-1];
                }
            }
        }

        return dp[k][n];
    }


    public static void main(String[] args) {
        long ans = partitionTeams(4,3);
        System.out.println(ans);
    }

}
