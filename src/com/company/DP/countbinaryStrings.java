package com.company.DP;

import java.util.Scanner;

class countBinaryStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int [] dp0 = new int[n+1];
//        int [] dp1 = new int[n+1];
//        dp0[1] =1;
//        dp1[1] = 1;
        int oczeros = 1;
        int ocones = 1;
        for(int i=2;i<=n;i++){
            int nzeros = ocones;
            int nones = ocones+oczeros;
            ocones = nones;
            oczeros = nzeros;
        }
        System.out.println(oczeros+ocones);

    }
}
