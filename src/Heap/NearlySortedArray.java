package Heap;

import java.util.PriorityQueue;

public class NearlySortedArray {
    public static void main(String[] args) {
        int [] arr = {2,3,1,4,6,5,8,9};
        int k =3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0;i<=k;i++){
            pq.add(arr[i]);
        }
        for(int i =k+1;i<arr.length;i++){
            System.out.print(pq.poll()+" ");
            pq.add(arr[i]);
        }
        while (pq.size()>0){
            System.out.print(pq.poll()+" ");
        }
    }
}
