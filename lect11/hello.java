package lect11;

import java.util.*;


// class Node{
//     int data;
//     Node next;

//     public Node(int data) {
//         this.data=data;
//         this.next=null;
//     }
    

// }
// public class hello {
//     Node head;
//     void addAtFist(int data){
//         Node newNode=new Node(data);
//         if(head==null){
//             newNode.next=newNode;
//             head=newNode;
//             return;

//         }
//         Node temp=head;

//         while (temp.next!=head) { 
//             temp=temp.next;

            
//         }
//         newNode.next=head;
//         temp.next=newNode;
//         head=newNode;


//     }


//     void addAtLast(int data){
//         Node newNode=new Node(data);
     
//             if(head==null){
//                 newNode.next=newNode;
//                 head=newNode;
//                 return;
    
//             }

        

//     }


//     void  deletFS(){
//         if(head==null){
//             return;
//         }
//         if(head.next==head){
//             head=null;
//         }
//         Node temp=head;
//         while (temp.next!=head) { 
//             temp=temp.next;
            
//         }
//         temp.next=head.next;
//         head=head.next;

//     }

//     public static void main(String[] args) {
        
//     }
 
// }


class hello {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        System.out.println(list);
        list.addLast(10);
        list.addLast(111);
        list.removeFirst();


    }
}