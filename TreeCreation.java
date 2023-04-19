import java.util.*;
public class TreeCreation
{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node createBinaryTree(){
        Scanner sc=new Scanner(System.in);
        Node root=null;
        System.out.print("enter the values : ");
        int data=sc.nextInt();
        root=new Node(data);
        if(data==-1){
            return null;
        }
        System.out.print("left child of tree " + root.data);
        root.left=createBinaryTree();
        System.out.print("rigth child of tree " + root.data);
        root.right=createBinaryTree();
        return root;
    }
    //inordr trvesal //
    public  void inorder(Node root){
        if(root==null){
            return;
        }
       
        inorder(root.left);
         System.out.print(root.data);
        inorder(root.rigth);
    }
    //pre order //
    public void preorder(Node root){
        if(root==null){
            return;
        }
        System.our.print(root.data);
        preorder(root.left);
        preorder(root.rigth);
        
    }
    //post order//
    public void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.rigth);
        System.out.print(root.data);

    }
    public static void main(String args[]){
        TreeCreation tree=new TreeCreation();
        tree.createBinaryTree();
        tree.inorder();
        tree.preorder();
        tree.postorder();

    }
}