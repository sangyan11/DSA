package Recursion;

public class PermutationOfString {
    static void permutation(String ques,String ans){
        if (ques.length()==0){
            System.out.println(ans+" ");
            return;
        }

        for(int i=0;i<ques.length();i++){
          char ch = ques.charAt(i);
          String l_part = ques.substring(0,i);
          String r_part = ques.substring(i+1);
          String roq = l_part+r_part;
          permutation(roq,ans+ch);
        }
    }

    public static void main(String[] args) {
        permutation("abc","");
    }

}
