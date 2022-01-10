package LinkedList;

public class Stack {
    MyLinkedList ll = new MyLinkedList();
    public int size(){
        return ll.size;
    }
    public void push(int val){
        ll.addFirst(val);
    }
    public int pop(){
        if(size()==0){
            System.out.println("Stack Overflow");
            return -1;
        }
        else{
            int val = ll.getFirst();
            ll.removeFirst();
            return val;
        }
    }
    public int top(){
        if(size()==0){
            System.out.println("Stack Overflow");
            return -1;
        }
        else{
            int val = ll.getFirst();

            return val;
        }
    }
}
