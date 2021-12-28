package Stack;

import java.util.Stack;

public class DuplicateBrackets {
    static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
     for(int i=0;i<str.length();i++){
         if(str.charAt(i)==')'){
             if(s.peek()== '('){
                 return true;
             }
             else{
                 while(s.peek()!='('){
                     s.pop();
                 }
                 s.pop();
             }
         }
         else{
             s.push(str.charAt(i));
         }
     }
     return false;
    }
    public static void main(String[] args) {
    String s = "(a+b)+((c+d))";
        System.out.println(isDuplicate(s));




    }
}
