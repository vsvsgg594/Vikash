import java.util.*;
public class CreationOfLinkedlist
{
    static class Node
    {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node root=null;
    public void creationNode(){
        int n;
        Scanner sc=new Scanner(System.in);
        do
        {   
            System.out.println("enter the data :" );
            int data=sc.nextInt();
            Node new_node=new Node(data);
            if(root==null){
             root=new_node;
        }else{
            new_node.next=root;
            root=new_node;
        }
        System.out.println("do you want to insert more items press 1 :");
        n=sc.nextInt();
        }while(n==1);
    }
    public void traverse(){
        Node temp=root;

        if(root==null){
            System.out.println("there is no list");

        }else{
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }

        }
    }
    public static void main(String []args){
        CreationOfLinkedlist c1=new CreationOfLinkedlist();
        c1.creationNode();
        c1.traverse();
    }
}