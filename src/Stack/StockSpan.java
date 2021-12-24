package Stack;

import javax.swing.*;
import java.util.*;

public class StockSpan {
//
   static class Pair {
        int first;
        int second;
        Pair(int first,int second){
            this.first = first;
            this.second = second;
        }

    }
//    public static ArrayList<Integer> NextGreaterLeft(int arr[]){
//         ArrayList<Integer> res = new ArrayList<>();
//        Stack<Pair> s = new Stack<>();
//        for(int i=0;i<arr.length;i++){
//            if(s.isEmpty()) res.add(-1);
//            else if(!s.isEmpty() && s.peek().first>arr[i]){
//                res.add(s.peek().second);
//            }
//            else if (!s.isEmpty() && s.peek().first<=arr[i]){
//                while (!s.isEmpty() && s.peek().second<=arr[i]){
//                    s.pop();
//                }
//                if(s.size()==0){
//                    res.add(-1);
//                }
//                else{
//                    res.add(s.peek().second);
//                }
//            }
//            s.push(new Pair(arr[i],i));
//        }
//        Collections.reverse(res);
//        return  res;
//    }

    public static void main(String[] args) {
       ;
        Stack<Pair> s= new Stack<Pair>();
        //pair p= new pair();
        int a[]={ 100,80,60, 70, 60, 75, 85 };
        ArrayList<Integer> list= new ArrayList<Integer>();
        for(int i=0;i<a.length;i++)
        {
            if(s.size()==0)
            {
                list.add(-1);
            }
            else if(s.size()>0 && s.peek().first > a[i])
            {
                list.add(s.peek().second);
            }
            else if(s.size()>0 && s.peek().first<= a[i])
            {
                while(s.size()>0 && s.peek().first<=a[i])
                {
                    s.pop();
                }
                if(s.size()==0)
                    list.add(-1);
                else
                    list.add(s.peek().second);
            }
            s.push(new Pair(a[i],i));
        }
        for(int i=0;i<list.size();i++)
        {
            list.set(i,i-list.get(i));
        }
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}
