package lect9;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
        this.next=null;
    }
                                //head
}
    //  |3|->next->null           |4|->next-> null
public class hello {
    Node head;
    void addAtFist(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;

    }
   // |4|->next-> |5|->next-> null
    void addAtLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null) { 
            temp=temp.next;
            
        }
        temp.next=newNode;


    }

    void printList(){
        Node temp=head;
        while (temp!=null) { 
            System.out.print(temp.data+ "->");
            temp=temp.next;
            
        }
        System.out.println("null");
    }


    boolean search(int key){
        Node temp=head;
        while (temp!=null) { 
            if(temp.data==key){
                return true;
               
            }
            temp=temp.next;
            
        }
        return  false;


    }
//|3|->next-> -|5|->next->null|4|->next
    void update(int oldata,int newData){
        Node temp=head;
        while (temp!=null) { 
            if(temp.data==oldata){
                temp.data=newData;
                return;
            }
            temp=temp.next;
            
        }

    }

   // 30-40


    int findMiddle(){
        Node newNode=new Node(16);
        if(head==null){
            return -1;
        }
        int count=0;
        Node temp=head;
        while (temp!=null) { 
            count++;
            temp=temp.next;
            
        }
        temp=head;
        int mid=count/2;
        for(int i=0;i<mid-1;i++){
            temp=temp.next;
      

        }
        newNode.next=temp.next;
        temp.next=newNode;
        // return  temp.data;





    }

    //slow pointer -> fast pointer

    int findMiddleSlowFast(){
        if(head==null){
            return -1;
        }
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) { 
            slow=slow.next;
            fast=fast.next.next;
            
        }



    }

    public static void main(String[] args) {
        hello list =new hello();
        list.addAtFist(3);
        list.addAtFist(4);
        list.addAtFist(5);
        list.addAtFist(6);
        list.addAtLast(10);
        list.printList();

        
    }
    
}
