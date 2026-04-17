package lect14;

import lect13.hello;

public class Node {
    int data;
    hello left,right;

    public hello(int data) {
        this.data=data;
        left=right=null;
    }
     
}
 //1,2,3,4,5,5,6,7
class hell{
    //Inorder 
    public  static  void inorder(hello root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);

    }
    public  static  void prerder(hello root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        prerder(root.left);
        prerder(root.right);

    }
    public  static  void postorder(hello root){
        if(root==null){
            return;
        }
       
        prerder(root.left);
        prerder(root.right);
        System.out.println(root.data);

    }  
    public static void main(String[] args) {
        hello root =new hello(1);
        root.left=new hello(2);
        root.right=new hello(3);

        root.left.left=new hello(4);
        root.left.right=new hello(5);

        root.right.left=new hello(6);
        root.right.right=new hello(7);
        inorder(root);


       // 4 2 5 1 6 3 7 

       // 1 2 4 5 3 6 7 

        //  4 5  2 6 7 3 1




        
    }
}
