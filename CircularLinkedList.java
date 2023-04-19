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
        int choice,m;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("enter the data");
            int data=sc.nextInt();
            Node new_node=new Node(data);
            if(head==null)
            {
                head=new_node;
                tail=new_node;
                new_node.next=head;
            }
            else{
                System.out.print("enter the choice 1.press for insertion at starting 2.press for ending insertion 3.press for insertion at any posistio");
                choice=sc.nextInt();
                switch(choice){
                    case 1: new_node.next=head;
                            head=new_node;
                            tail.next=head;
                            break;
                    case 2:tail.next=new_node;
                           tail=new_node;
                           new_node.next=head;
                           break;
                    case 3: System.out.print("enter the position : ");
                            int p=sc.nextInt();
                            Node temp1=head;
                            for(int i=0;i<(p-1);i++)
                            {
                                temp1=temp1.next;
                            }     
                            new_node.next=temp1.next;
                            temp1.next=new_node;
                            break;
                    default:System.out.print("invailked ");             
                }



            }
            System.out.print("do you want to insert more data 1: ");
            m=sc.nextInt();

        }while(m==1);
    }
   public void deletion()
   {int choice,d;
      Scanner sc=new Scanner(System.in);
      do{
        if(head==null){
            System.out.print("no");
        }else{
            System.out.print("enter your choice : 1.at starting 2.ending ");
            choice=sc.nextInt();
            switch(choice){
                case 1:Node temp1=head;
                       head=temp1.next;
                       tail=head;
                       break;
                case 2:Node temp2=head;
                       Node ptr=temp2.next;
                       while(ptr.next!=head){
                        temp2=ptr;
                        ptr=ptr.next;
                       }
                       temp2.next=head;
                       tail=temp2;
                       break;       
            }


        }
        System.out.print("do you want to delete more data press 1: ");
        d=sc.nextInt();

      }while(d==1);

   }
    public void traversal()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.print("nothing");
        }else{
            do{
                System.out.print(temp.data);
                temp=temp.next;
            }while(temp!=head);
        }
    }
    public static void main(String args[])
    {
        CircularLinkedList cc=new CircularLinkedList();
        cc.insertion();
        cc.traversal();
        cc.deletion();
        cc.traversal();

    }


}