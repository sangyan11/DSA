package LinkedList;

public class MyLinkedList {
    Node head;
    Node tail;
    int size;

    public static class Node {
        int data;
        Node next;
    }

    public void addLast(int val) {
        Node temp = new Node();
        temp.data = val;
        temp.next = null;
        if (size == 0) {

            head = tail = temp;
        } else {


            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void removeFirst() {
        Node temp = head;
        Node tail = head;
        head = temp.next;
        tail = temp;
    }

    public int getFirst() {
        if (size == 0) {
            System.out.println("List is empty");
            return -1;
        } else {
            return head.data;
        }
    }

    public int getLast() {
        if (size == 0) {
            System.out.println("List is Empty");
            return -1;
        } else {
            return tail.data;
        }

    }

    public void addFirst(int val) {
        Node temp = new Node();
        temp.data = val;
        temp.next = head;
        head = temp;

    }

    public void addAtIndex(int val, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid Argument");
        }
        if (index == 0) {
            addFirst(val);
        }
        if (index == size) {
            addLast(val);
        } else {
            Node node = new Node();
            node.data = val;
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;


        }
    }

    public void removeAtIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid Argument");
        }
        if (index == 0) {
         removeFirst();
        }
        if (index == size) {
           removeLast();
        } else {
            Node node = new Node();

            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next=temp.next.next;

            size++;


        }
    }

    public void removeLast() {
        Node temp = head;
        while (temp.next.next != null) {

            temp = temp.next;
        }
        temp.next = null;
    }
    public int getAt(int index){
        if (size==0){
            System.out.println("List is Empty");
            return -1;
        }
       else if(index<0 || index>=size){
            System.out.println("Invalid Index");
            return -1;
        }
       else {
           Node temp = head;
           for (int i=0;i<index;i++){
               temp = temp.next;
           }
           return temp.data;
        }

    }
    public Node merge(Node l1,Node l2){
        if(l1==null) return l2;
        if(l2 == null) return l1;
        if(l1==null && l2==null) return null;
        if(l1.data > l2.data){
            Node temp = l1;
            l1 = l2;
            l2 = temp;
        }
        Node res = l1;
        while (l1!=null && l2!=null){
            Node temp = head;
            while(l1!=null && l1.data<=l2.data){
                temp = l1;
                l1 = l1.next;
            }
            temp.next = l2;

            Node t = l1;
            l1 = l2;
            l2 = t;
        }
        return res;
    }
    public void oddEvenList(){
        MyLinkedList odd = new MyLinkedList();
        MyLinkedList even = new MyLinkedList();


        while(this.size>0){
       int val = this.getFirst();
       this.removeFirst();
       if(val% 2 ==0){
           even.addLast(val);
       }
       else{
           odd.addLast(val);
       }
        }
        if(odd.size>0 && even.size>0){
            this.tail = even.tail;
            this.head = odd.head;
            this.size = odd.size+even.size;
        }
       else if(odd.size>0){
            this.tail =  odd.tail;
            this.head = odd.head;
            this.size = odd.size;
        }
       else if(even.size>0){
            this.tail =  even.tail;
            this.head = even.head;
            this.size = even.size;
        }

    }

}
