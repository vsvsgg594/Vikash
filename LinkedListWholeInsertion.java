import java.util.*;
public class LinkedListWholeInsertion
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
    public void insertion(){
        int data,n,choice;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter the Data : ");
            data=sc.nextInt();
            Node new_node=new Node(data);
            if(head==null)
            {
                head=new_node;
            }else{
                System.out.print("Enter your choice press 1.Begining Insertion 2.Ending Insertion 3.particular Insertion");
                choice=sc.nextInt();
                switch(choice){
                    case 1:new_node.next=head;
                           head=new_node;
                           break;
                    case 2:Node temp=head;
                           while(temp.next!=null)
                           {
                            temp=temp.next;
                           }       
                           temp.next=new_node;
                           break;
                    case 3:Node temp1=head;
                           System.out.print("Enter the place where you want to insert data");
                           int p=sc.nextInt();
                           for(int i=0;i<(p-1);i++)
                           {
                              temp1=temp1.next;
                           }         
                           new_node.next=temp1.next;
                           temp1.next=new_node;
                           break;
                    default :System.out.print("you are enter invalied number ");       
                }
            }
            System.out.println("do you want to insert more data press 1 otherwise press anythings");
            n=sc.nextInt();
        }while(n==1);
    }
    public void deletion()
    {
        Scanner sc=new Scanner(System.in);
        int c;
        int d;
        do{
            System.out.print("enter your choice where you want to delete node 1.at beging 2.at ending 3.at any position");
            c=sc.nextInt();
            switch(c)
            {
                case 1:Node temp2=head;
                       head=temp2.next;
                       break;
                case 2 : Node temp3=head;
                        Node ptr1=temp3.next;
                        while(ptr1.next!=null)
                        {
                             temp3=ptr1;
                             ptr1=ptr1.next;

                        }       
                        temp3.next=null;
                        break;
                case 3:   Node temp4=head;
                          Node ptr2=temp4.next;
                          System.out.print("enter the place");
                          int p=sc.nextInt();
                          for(int i=0;i<(p-1);i++)
                          {
                            temp4=ptr2;
                            ptr2=ptr2.next;
                          }
                          temp4.next=ptr2;
                          break;
                default :System.out.print("invalied optiopn") ;         

            }
            System.out.print("do you want to delete more node : ");
            d=sc.nextInt();


        }while(d==1);
    }
    public void traversal()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.print("LinedList is Empty");
        }
        else{
            while(temp!=null)
            {
                System.out.print(temp.data +" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args)
    {
        LinkedListWholeInsertion ll=new LinkedListWholeInsertion();
        ll.insertion();
        ll.traversal();
        ll.deletion();
        ll.traversal();

    }

}