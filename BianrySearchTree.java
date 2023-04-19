import java.util.*;
public class BianrySearchTree
{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
     }
     public static Node insertion(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insertion(root.left,val);
        }
        else{
            root.right=insertion(root.right,val);
        }
        return root;

     }
     public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
     }
     public static void main(String[] args){
        int value[]={2,50,15,7};
        Node root=null;
        for(int i=0;i<value.length;i++){
            root=insertion(root,value[i]);
        }
        inorder(root);
     }

    
}