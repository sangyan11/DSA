package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class MergeOverlappingInterval {
    public static class Pair implements Comparable<Pair> {
        int start;
        int end;

        Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Pair other) {
            if(this.start != other.start){
                return  this.start-other.start;
            }
            else{
                return this.end- other.end;
            }
        }
    }
    public static  void  mergeIntervals(int[][] arr){
        Pair [] pairs = new Pair[arr.length];
        for(int i=0;i<arr.length;i++){
            pairs[i] = new Pair(arr[i][0],arr[i][1]);
        }
        Arrays.sort(pairs);
        Stack<Pair> stack = new Stack<>();
        for(int i=0;i<pairs.length;i++){

            if(i==0){
                stack.push(pairs[i]);
            }
            else{
                Pair top = stack.peek();
                if(pairs[i].start>top.end){
                    stack.push(pairs[i]);
                }
            else {
                top.end = Math.max(top.end,pairs[i].end);
                }
            }

        }
        Stack< Pair> rs = new Stack< >();
        while (stack.size() > 0) {
            rs.push(stack.pop());
        }

        while (rs.size() > 0) {
            Pair p = rs.pop();
            System.out.println(p.start + " " + p.end);
        }


    }
    public static void main(String[] args) {
      // mayank_g@skillvertex.in
    }
}
