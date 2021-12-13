package Recursion;

public class KPC {
    static String[] arr = {"..","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String ques,String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch = ques.charAt(0);
        String res = ques.substring(1);
        String codeforch = arr[ch-'0'];
        for(int i=0;i<codeforch.length();i++){
            char cho = codeforch.charAt(i);
            printKPC(res,ans+cho);
        }

    }

    public static void main(String[] args) {
        printKPC("678","");
    }

}
