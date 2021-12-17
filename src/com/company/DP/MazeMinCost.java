package com.company.DP;

import java.util.Scanner;

public class MazeMinCost {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int [][] matrix = new int[n][n];
        for(int i =0;i<matrix.length;i++){
            for(int j =0;i<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int [][] dp = new int [m+1][n+1];
        for(int i = 0;i<=dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==m-1 && j==n-1){
               dp[i][j] = matrix[i][j];
                }
                else if(i==m-1){
                    dp[i][j] = dp[i][j+1]+matrix[i][j];
                }
                else if(j==n-1){
                dp[i][j] = dp[i+1][j]+matrix[i][j];
                }
                else{
                dp[i][j] = matrix[i][j]+Math.min(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        System.out.println(dp[0][0]);

    }
}
