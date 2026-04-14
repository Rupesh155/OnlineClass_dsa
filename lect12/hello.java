package lect12;

// class Stack{
  
   

    

// }

// public class hello {
//     int[] arr;
//     int top;
//     int size;

//     public hello(int size) {
//         this.size=size;
//         arr=new int[size];
//         top=-1;

//     }
//     void push (int val){
//         if(top==size-1){

//             System.out.println("stack OverFlow");
//             return;
//         }
//         arr[++top]=val;

       
        
//     }
//     int pop(){
//         if(top==-1){
//             System.out.println("stack UnderFlow");
//             return  -1;
//         }
//         return  arr[top--];


//     }
//     int peek(){
//         if(top==-1){
//             return -1;
//         }
//         return  arr[top];
//     }

//     void display(){
//         for(int i=top;i>=0;i--){
//             System.out.println(arr[i]);
//         }
//     }
   

//     public static void main(String[] args) {
        

        
//     }
    
// }



class Queue{
    int arr[];
    int front;
    int rear;
    int size;

    public Queue(int size) {
        this.size=size;
        arr=new int[size];
        front=0;
        rear=-1;
    }

   void enqueue(int val){
        if(rear==size-1){
            System.out.println("Queue overFlow");

        }
        arr[++rear]=val;

    }
    int dequeue(){
        if(front>rear){
            System.out.println("Queue khali hai");
            return -1;
        }
       return   arr[front++];



    }

    int peak(){
        if(front>rear){
            System.out.println("Queue khali hai");
            return -1;
        }
        return  arr[front];

    }
    void display(){
        if(front>rear){
            System.out.println("Queue khali hai");
            return ;
        }

        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }

    }
    

    public static void main(String[] args) {
        Queue list=new Queue(3);
        list.enqueue(1);
        list.enqueue(2);
        list.enqueue(3);
        list.display();
           list.dequeue();

        
    }
}
