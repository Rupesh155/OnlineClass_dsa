package lect15;

class Node {
    int data;
    Node left,right;

    public Node(int data) {
        this.data=data;
        left=right=null;
    }
    
}
public class hello {
    //Height of tree
    public  static  int height(Node root){
        if(root==null){
            return 0;
        }
          int leftH= height(root.left);
          int rightH= height(root.right);
          return  Math.max(leftH, rightH)+1;

    } 
    // count of the node 
    public static int count (Node root) {
        if(root==null){
            return 0;
        }
        return count(root.left)+count(root.right)+1;

   
    }
   // Sum of the nodes
   public  static  int Sum(Node root){
    if(root==null){
        return 0;
    }
    return count(root.left)+count(root.right)+root.data;


   }
   //Max element
   public  static  int Max(Node root){
    if(root==null){
        return 0;
    }
    int leftH= height(root.left);
    int rightH= height(root.right);
    return  Max.max(root.data,  Max.max(leftH,rightH));





   }



    public static void main(String[] args) {
        
    }
    
}
