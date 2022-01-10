package LinkedList;

public class Queue {
    MyLinkedList ll = new MyLinkedList();
    public int size(){
        return ll.size;
    }

    public void  add(int val){
        ll.addLast(val);
    }
    public  void remove(){
        if(size()==0){
            System.out.println("Stack Underflow");

        }
       else{
           ll.removeFirst();
        }
    }
    public void peek(){
        if(size()==0){
            System.out.println("Stack Underflow");

        }
        else{
             ll.getFirst();
        }
    }
}
