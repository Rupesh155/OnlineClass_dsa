package lect16;

class Node{
    int data;
    Node left, right;

    public Node(int data) {
        this.data=data;
        left=null;
        right=null;
    }
    
}
public class hello {
    //Insert in Bst
    public  static  Node insertIBst(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        if(val<root.data){
            root.left=insertIBst(root.left, val);
        }else{
            root.right=insertIBst(root.right, val);
        }
        return  root;


    }

    // search in bst
    public static  boolean search(Node root,int key){
        if(root==null){
            return  false;
        }
        if(root.data==key){
            return  true;
        }
        if(key<root.data){
                return  search(root.left, key);
        }else{
            return  search(root.right, key);
        }

    }
   // Inorder traversal
   public static  void Inorder(Node root){
    if(root==null){
        return;
    }
    Inorder(root.left);
    System.out.println(root.data);
    Inorder(root.right);

   }
    public static void main(String[] args) {
        
    }
    
}
