import java.util.*;
public class LinkedListInsertion
{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    //insertion of linkedList//
    public void creationNode(){
        int data,n,ch;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("enter the data : " );
            data=sc.nextInt();
            Node new_node=new Node(data);
            if(head==null)
            {
                head=new_node;
            }
            else
            {
                System.out.println("enter your choice : 1.start 2.last");
                ch=sc.nextInt();
                switch(ch){
                    case 1:new_node=head;
                           head=new_node;
                           break;
                    case 2:Node temp=head;
                           while(temp.next!=null)
                           {
                            temp=temp.next;
                           }
                           temp.next=new_node;
                           break;  
                    default:System.out.print("invalied ");               
                }
            }
            System.out.println("do you want to insert more data then press 1");
            n=sc.nextInt();


        }while(n==1);
    }
    //traverse the linkedList//
    public void traverse(){
        Node temp1=head;
        if(head==null){
            System.out.println("there is no list ");
        }else{
            while(temp1!=null){
                System.out.print(temp1.data + " ");
                temp1=temp1.next;
            }
        }
    }
    public static void main(String []args)
    {
        LinkedListInsertion l1=new LinkedListInsertion();
        l1.creationNode();
        l1.traverse();
    }
}