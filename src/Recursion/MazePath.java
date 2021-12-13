package Recursion;

import java.util.Scanner;

public class MazePath {
    public static void printMazePath(int sr,int sc,int dr,int dc,String ans){
        if(sr > sc || dr > dc){
            return;
        }
        if(sr==sc && dr==dc){
            System.out.println(ans);
            return;
        }
        printMazePath(sr,sc+1,dr,dc,ans+"h");
        printMazePath(sr+1,sc,dr,dc,ans+"v");

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePath(0, 0, n - 1, m - 1, "");
    }
}
