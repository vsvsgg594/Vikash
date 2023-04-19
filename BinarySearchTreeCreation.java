import java.util.*;
public class BinarySearchTreeCreation
{
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insertion(Node root,int val)
    {
        if(root==null)
        {
            root=new Node(val);
            return root;
        }
        if(root.data>val)
        {
            root.left=insertion(root.left,val);
        }
        else
        {
            root.right=insertion(root.right,val);
        }
        return root;
    }
    //inorder traversal//
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static boolean search(Node root,int key)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data>key){
            return search(root.left,key);
        }
        else if(root.data==key)
        {
            return true;

        }
         else
        {
            return search(root.right,key);

        }
    }
    public static Node deleteNode(Node root,int val)
    {
        if(root.data>val)
        {
            root.left=deleteNode(root.left,val);
        }else if(root.data<val){
            root.right=deleteNode(root.right,val);
        }else{// root.data==val//
            // case 1 where child has no nodes //
            if(root.left==null && root.right==null)
            {
                return null;
            }
            //case 2 where there is one child of node//
            if(root.left==null){
                return root.right;
            }
            if(root.right==null)
            {
                return root.left;
            }
            //case 3 where nodes has two child nodes//
            Node SI=inOrderSeccsor(root.right);
            root.data=SI.data;
            root.right=deleteNode(root.right,SI.data);
            


        }
        return root;

    }
    public static Node inOrderSeccsor(Node root)
    {
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String []args)
    {
        int arr[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<arr.length;i++)
        {
            root=insertion(root,arr[i]);
        }
        System.out.println();
        inorder(root);
        System.out.println();
        if(search(root,2)){
            System.out.print("found");

        }else{
            System.out.print("not found");
        }
        deleteNode(root,1);
        inorder(root);
        System.out.println();
        deleteNode(root,4);
        inorder(root);


    }
}