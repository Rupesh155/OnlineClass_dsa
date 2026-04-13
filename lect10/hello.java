package lect10;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;    
    }

    
}
public class hello {
    Node head;
    void addAtFist(int data){
        Node  newNode=new Node(data);
        if(head!=null){
            head.prev=newNode;
            newNode.next=head;
        }
        head=newNode;

    }

    void addAtLast(int data){
        Node  newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null) { 
            temp=temp.next;
            
        }
        temp.next=newNode;
        newNode.prev=temp;


    }
    void deletFS(){
        if(head==null){
            return;
        }
        if(head.next!=null){
            head=head.next;
            head.prev=null;
        }
        else{
            head=null;
        }
    }
    public static void main(String[] args) {
        
    }

   
   
}
