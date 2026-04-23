
class Node {
    int data ;
    Node left,right;

    public Node(int data) {
        this.data=data;
        left=right=null;
    }
    
}
public class hello {
    static  int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right))+1;

    }
    static  boolean  isBalanced(Node root){
        if(root==null){
            return true;
        }
       // 0-2=-2
        int lh=height(root.left);
        int rh=height(root.right);
        if(Math.abs(lh-rh)>1){
            return  false;
        }


        return  isBalanced(root.left) && isBalanced(root.right);


    }
    public static void main(String[] args) {
        
    }
    
}
