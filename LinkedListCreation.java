import java.util.*;
public class LinkedListCreation
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void creation()
    {
        int n;
       Scanner sc=new Scanner(System.in);
        do
        {
        System.out.print("Enter the data");
        int data=sc.nextInt();
        Node new_node=new Node(data);
        if(head==null)
        {
            head=new_node;
        }
        else
        {
            new_node.next=head;
            head=new_node;
        }
        System.out.print("do you want to insert more data press 1 ");
        n=sc.nextInt();


        }while(n==1);
       
    }
    public void traversal()
    {
        Node temp=head;
        int count=0;
        if(head==null)
        {
            System.out.print("LinkedList Not Exits");

        }
        else{
            while(temp.next!=null)
            {
                System.out.print(temp.data + " ");
                temp=temp.next;
                count++;
            }
        }
        System.out.print(count);
    }
    public static void main(String[] args)
    {
        LinkedListCreation lc=new LinkedListCreation();
        lc.creation();
        lc.traversal();

    }

}
