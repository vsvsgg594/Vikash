import java.util.*;
public class DoublyLinkedListInsertion
{
    static class Node
    {
        int data;
        Node next;
        Node pre;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.pre=null;
        }
    }
    Node head=null;
    Node tail=null;
    //insertion of data//
    public void insertion()
    {
        int data,c,n;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.print("enter the data : ");
            data=sc.nextInt();
            Node new_node=new Node(data);
            if(head==null && tail==null)
            {
                head=new_node;
                tail=new_node;
            }
            else
            {
                System.out.print("1.insertion at start 2.insertion at last 3.insertion at middle ");
                c=sc.nextInt();
                switch(c)
                {
                    case 1 : new_node.next=head;
                             head=new_node;
                             break;

                    case 2:Node temp=head;
                           while(temp.next!=null)
                           {
                            temp=temp.next;
                           }          
                           temp.next=new_node;
                           new_node.pre=tail;
                           tail=new_node;
                           break;
                    case 3:Node temp1=head;
                           Node ptr=temp1.next;
                           System.out.print("enter the position : ");
                           int p=sc.nextInt();
                           for(int i=0;i<(p-1);i++)
                           {
                            temp1=ptr;
                            ptr=ptr.next;
                           }        
                           new_node.pre=temp1;
                           new_node.next=ptr;
                           temp1.next=new_node;
                           ptr.pre=new_node;
                           break;
                }
            }
            System.out.print("do you want to insert more data press 1--- ");
            n=sc.nextInt();
        }while(n==1);
    }
    // delete element//
    public void delete()
    {
        int d,c,n;
        Scanner sc=new Scanner(System.in);
        do
        {
            if(head==null && tail ==null)
            {
                System.out.print("there is no list");
            }
            else
            {
                System.out.print("press data from list 1.start 2.last 3.middle");
                c=sc.nextInt();
                switch(c)
                {
                    case 1: Node temp=head;
                            head=temp.next;
                            temp.pre=null;
                            break;
                    case 2:Node temp1=head;
                           Node ptr=temp1.next;
                           while(ptr.next!=null)
                           {
                            temp1=ptr;
                            ptr=ptr.next;
                           }        
                          tail=ptr.pre;
                          temp1.next=null;
                          break;
                    case 3: Node temp2=head;
                            Node ptr2=temp2.next;
                            System.out.print("enter the position -");
                            int p=sc.nextInt();
                            for(int i=1;i<(p-1);i++)
                            {
                                temp1=ptr2;
                                ptr2=ptr2.next;
                            }      
                            temp2.next=ptr2.next;
                            ptr2.next.pre=temp2;
                            break;
                    default : System.out.print("invalied ");        
                }
            }
            System.out.print("do you want to delete more data from list press 1 -");
            n=sc.nextInt();
        }while(n==1);
    }
    //display element//
    public void display()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.print("no list");

        }
        else
        {
            while(temp!=null)
            {
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
        }
    }
    public static void main(String []args)
    {
        DoublyLinkedListInsertion d1=new DoublyLinkedListInsertion();
        d1.insertion();
        d1.display();
        d1.delete();
        d1.display();
    }
}