package Stack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class NGR {
    public static ArrayList<Integer>  NextGreaterRight(int arr[]){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
        if (s.isEmpty()) res.add(-1);
       else if(!s.isEmpty() && s.peek()>arr[i]){
            res.add(s.peek())  ;
       }
       else if (!s.isEmpty() && s.peek()<=arr[i]){
           while (!s.isEmpty() && s.peek()<=arr[i]){
               s.pop();
           }
           if(s.size()==0){
               res.add(-1);
           }
           else {
               res.add(s.peek());
           }
        }
       s.push(arr[i]);
        }

        Collections.reverse(res);

        return res;
    }
    public static ArrayList<Integer> NextGreaterLeft(int arr[]){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(s.isEmpty()) res.add(-1);
            else if(!s.isEmpty() && s.peek()>arr[i]){
                res.add(s.peek());
            }
            else if (!s.isEmpty() && s.peek()<=arr[i]){
                while (!s.isEmpty() && s.peek()<=arr[i]){
                   s.pop();
                }
                if(s.size()==0){
                    res.add(-1);
                }
                else{
                    res.add(s.peek());
                }
            }
            s.push(arr[i]);
        }
        return  res;
    }
    public static ArrayList<Integer> NextSmallerLeft(int arr[]){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(s.isEmpty()) res.add(-1);
            else if(!s.isEmpty() && s.peek()<arr[i]){
                res.add(s.peek());
            }
            else if (!s.isEmpty() && s.peek()>=arr[i]){
                while (!s.isEmpty() && s.peek()>=arr[i]){
                    s.pop();
                }
                if(s.size()==0){
                    res.add(-1);
                }
                else{
                    res.add(s.peek());
                }
            }
            s.push(arr[i]);
        }
        return  res;
    }
    public static ArrayList<Integer>  NextSmallerRight(int arr[]){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if (s.isEmpty()) res.add(-1);
            else if(!s.isEmpty() && s.peek()<arr[i]){
                res.add(s.peek())  ;
            }
            else if (!s.isEmpty() && s.peek()>=arr[i]){
                while (!s.isEmpty() && s.peek()>=arr[i]){
                    s.pop();
                }
                if(s.size()==0){
                    res.add(-1);
                }
                else {
                    res.add(s.peek());
                }
            }
            s.push(arr[i]);
        }

        Collections.reverse(res);

        return res;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,2,4};
        ArrayList<Integer> res = NextSmallerRight(arr);

        System.out.println(res);
   ;
    }
}
