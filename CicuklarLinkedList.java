import java.util.*;
public class CicuklarLinkedList
{
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }

    }
    Node head=null;
    Node tail=null;
    public void insertion()
    {
        int n;
        Scanner sc=new Scanner(System.in);
        
        do{
            System.out.print("enter the data : ");
        int data=sc.nextInt();
        Node new_node=new Node(data);
        if(head==null && tail==null)
        {
            head=new_node;
            tail=new_node;
            new_node.next=head;
        }else{
            new_node.next=head;
            head=new_node;
            tail.next=head;
        }
        System.out.print("do you want to insert more data press 1");
        n=sc.nextInt();


        }while(n==1);
        
    }
    public void traversal()
    {
        Node temp=head;
        if(head ==null && tail==null)
        {
            System.out.print("list is empty");
        }
        else
        {
            do{
                
            System.out.print(temp.data);
            temp=temp.next;
            } while(temp!=head);

        }
       
       


    }
    public static void main(String args[])
    {
        CicuklarLinkedList cc=new CicuklarLinkedList();
        cc.insertion();
        cc.traversal();

    }

}