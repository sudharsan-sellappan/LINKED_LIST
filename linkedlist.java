import java.util.*;

class Node{

    int data;
    Node next;


    public Node(int data,Node next){
        this.data=data;
        this.next=next;
    }

    public Node(int data){
        this.data=data;
        this.next=null;
    }

   
}





public class linkedlist {
    public static Node converto(int []arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node curr = new Node(arr[i]);
            mover.next=curr;
            mover=curr;
        }
        return head;
   }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        
       Node head= converto(arr);

       while(head != null){
        System.out.print(head.data+"->");
        head=head.next;
       }
       System.out.println("null");
    }
}
