package Recursion;

public class Subsequence {
    public static void main(String[] args) {
        printSubsequence("abc","");
    }

    private static void printSubsequence(String ques, String ans) {
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String res = ques.substring(1);
        printSubsequence(res,ans+ch);
        printSubsequence(res,ans+"");

    }
}
