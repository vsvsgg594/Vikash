import java.util.*;
public class BinaryTreeCreation
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
    public static Node creation()
    {
        Scanner sc=new Scanner(System.in);
        Node root=null;
        System.out.println("enter the values : ");
        int data=sc.nextInt();
        if(data==-1)
        {
            return null;
        }
        root=new Node(data);
        System.out.print(" enter left child " + root.data);
        root.left=creation();
        System.out.print("enter right child " + root.data);
        root.right=creation();
        return root;
    }
    //traversal of tree//
    public void inorder(Node root)
    {
        if(root==null)
        {
            return; 
        }
        inorder(root.left);
        System.out.print(root.data +" " );
        inorder(root.right);
    }
    public void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data);
       preorder( root.left);
        preorder(root.right);
    }
    public void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public int heightOfTree(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftheight=heightOfTree(root.left);
        int rigthheight=heightOfTree(root.right);
        int results_height=Math.max(leftheight,rigthheight)+1;
        return results_height;
    }
    public static int getNumberOfNode(Node root)
    {
        if(root==null){
            return 0;
        }
        int leftNode=getNumberOfNode(root.left);
        int rightNode=getNumberOfNode(root.right);
        return leftNode+rightNode+1;
    }
    public static int sumOfNode(Node root)
    {
        if(root==null){
            return 0;
        }
        int leftSum=sumOfNode(root.left);
        int rightSum=sumOfNode(root.right);
        int total_sum=leftSum+rightSum+root.data;
        return total_sum;
    }
    public static void main(String []args)
    {
        BinaryTreeCreation tree=new BinaryTreeCreation();
        Node root=creation();
        tree.inorder(root);
        System.out.println();
        tree.preorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println("height of tree" + tree.heightOfTree(root));
        System.out.println(getNumberOfNode(root));
        System.out.println("total sum is " + sumOfNode(root));



    }
}