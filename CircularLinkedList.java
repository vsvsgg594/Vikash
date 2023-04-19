import java.util.*;
public class CircularLinkedList
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
    Node tail=null;
    public void insertion()
    {
        Scanner sc=new Scanner(System.in);
        int n,c,data;
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
                System.out.print("enter choice 1.insertion from start 2.insertion from last 3.insertion any position ");
                c=sc.nextInt();
                switch(c)
                {
                    case 1: new_node.next=head;
                            head=new_node;
                            tail.next=new_node;
                            break;

                    case 2:tail.next=new_node;
                           tail=new_node;
                           new_node.next=head;
                           break;

                    //  case 3:Node temp=head;
                    //         System.out.print("enter the position :");
                    //         int p=sc.nextInt();
                    //         for(int i=0;i<(p-1);i++)
                    //         {

                    //            temp=temp.next;
                    //         }
                    //         new_node.next=temp;
                    //         temp.next=new_node;  
                    //         break;
                    default:System.out.print("invailed");                    
                }

               
            }

             System.out.print("press 1 for more data ");
             n=sc.nextInt();
        }while(n==1);
    }

    //delete code //
    public void delete()
    {
        int n ,c;
        Scanner sc=new Scanner(System.in);
        do
        {
            if(head==null)
            {
                System.out.print("no list");

            }
            else
            {
                System.out.print("1.delete from start 2.from last 3.delete any position ");
                c=sc.nextInt();
                switch(c)
                {
                    case 1:Node temp=head;
                           head=temp.next;
                           tail.next=head;
                           break;
                    case 2:Node temp1=head;
                           Node ptr=temp1.next;
                           while(ptr.next!=head)
                           {
                            temp1=ptr;
                            ptr=ptr.next;
                           }       
                           tail=temp1.next;
                           temp1.next=head;
                           break;
                    case 3: Node temp6=head;
                            Node ptr2=temp6.next;
                            System.out.print("enter position : ");
                            int p=sc.nextInt();
                            for(int i=0;i<(p-1);i++){
                                temp6=ptr2;
                                ptr2=ptr2.next;
                            }   
                            temp6.next=ptr2.next;
                            break;
                }

            }
            System.out.print("do you want to delete more data : ");
            n=sc.nextInt();
        }while(n==1);
    }
    public void display()
    {
        Node temp=head;

        if(head==null)
        {
            System.out.print("linkedlist have no data ");
        }
        else{
            do{
                System.out.print(temp.data);
                temp=temp.next;
            }while(temp!=head);
        }
    }
    public static void main(String []args)
    {
        CircularLinkedList c1=new CircularLinkedList();
        c1.insertion();
        c1.display();
        c1.delete();
        c1.display();
    }
    
}