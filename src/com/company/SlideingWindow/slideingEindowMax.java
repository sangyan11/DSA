package com.company.SlideingWindow;

import com.company.Main;

public class slideingEindowMax {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        int k =3;
        int i =0;
        int j =0;
        int sum =0;
        int max = Integer.MIN_VALUE;
        while (j<arr.length){
            sum = sum + arr[j];
            if(j-i+1<k){
                j++;
            }
           else if(j-i+1==k){
              max = Math.max(max,sum);
              sum = sum - arr[i];
                i++;
                j++;
            }

        }
        System.out.println(sum);
    }
}
