import java.util.*;
public class TreeCreation2
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
    public static Node creation()
    {
        Scanner sc=new Scanner(System.in);
        Node root=null;
        System.out.print("enter the values : ");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        root=new Node(data);
        System.out.print("enter left child of  " + root.data);
        root.left=creation();
        System.out.print("enter the right child of " + root.data);
        root.right=creation();
        return root;
    }

    //traversal of tree//
    //inorder traversal //
    public void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void postorder(Node root){
        if(root==null){
            return;

        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
        // System.out.println();
    }
    //total number of nodes//
    static int countNode(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes=countNode(root.left);
        int rigthNodes=countNode(root.right);
        return leftNodes+rigthNodes+1;
    }
    //height of tree//
    static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHight=height(root.left);
        int rightHinght=height(root.right);
        int treeHeight=Math.max(rightHinght,leftHight)+1;
        return treeHeight;
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sum(root.left);
        int rightsum=sum(root.right);
        return leftsum+rightsum+root.data;
    }
    public static void main(String args[]){
        TreeCreation2 tree=new TreeCreation2();
        Node root=creation();
        tree.inorder(root);
        System.out.println();
        tree.preorder(root);
          System.out.println();
        tree.postorder(root);
          System.out.println();
        int n=countNode(root);
        System.out.println("numbers of nodes are " + n);
        int height1=height(root);
        System.out.print(height1);
          System.out.println();
        int sumtree=sum(root);
        System.out.print(sumtree);
    }
}