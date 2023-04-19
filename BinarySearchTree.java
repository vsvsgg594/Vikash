import java.util.*;
public class BinarySearchTree
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
    public static Node insertion(Node root ,int val){
    
        if(root==null){
        
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insertion(root.left,val);
        }else{
            root.right=insertion(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
    public static Boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data>key){
            return search(root.left,key);
        }else if(root.data==key){
            return true;
        }else
        {
            return search(root.right,key);
        }

    }
    public static void main(String args[]){
        int values[]={1,3,4,5,6,7,8,90,22,59,100,45,890,120,100,340};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insertion(root,values[i]);
        }
        inorder(root);
        search(root,66);
    }
}