import java.util.*;
public class DoubleLinkedList
{
    static class Node
    {
        Node next;
        Node pre;
        int data;
        Node(int data)
        {
            this.data=data;
            this.pre=null;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;
    public void insertion()
    {
        int d,c;
        Scanner sc=new Scanner(System.in);
        do
        {

        
        System.out.print("Enter the data : ");
        int data=sc.nextInt();
        Node new_node=new Node(data);
        if(head==null && tail==null)
        {
            head=new_node;
            tail=new_node;

        }else
        {
           System.out.print("enter your choice : 1.insertio at being 2.insertion at ending 3.position");
           c=sc.nextInt();
           switch(c){
            case 1:new_node.next=head;
                   head=new_node;
                   break;
            case 2:Node temp=head;
                   while(temp.next!=null){
                    temp=temp.next;
                   }        
                   new_node.pre=temp.pre;
                   temp.next=new_node;
                   tail=new_node;
                   break;
            case 3:Node temp1=head;
                   Node ptr=temp1.next;
                   System.out.print("enter the position : ");
                   int p=sc.nextInt();
                   for(int i=0;i<(p-1);i++){
                    temp1=ptr;
                    ptr=ptr.next;

                   }
                   new_node.pre=temp1;
                   new_node.next=ptr;
                   temp1.next=new_node;
                   ptr.pre=new_node;
                   break;
            default:System.out.print("invailed ");                
           }
        }
        System.out.print("do you want to insert more data press 1.");
        d=sc.nextInt();
        }while(d==1);

    }
    public void traversal()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.print("");
        }else{
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
        }

    }
    public void backTraversal()
    {
        Node temp=tail;
        if(tail==null)
        {
            System.out.print("no");
        }else{
            while(temp.next!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
            }

        }

    }
    public void delete()
    {
        int d;
        int p;
        Scanner sc=new Scanner(System.in);
        do{
            if(head==null){
                System.out.print("there is ni");
            }else{
                System.out.print("1.starting 2.ending 3. postion");
                p=sc.nextInt();
                switch(p)
                {
                    case 1: Node temp=head;
                            head=temp.next;
                            head.pre=null;
                            break;
                    case 2:Node temp1=head;
                           while(temp1.next!=null){
                            temp1=temp1.next;
                           }
                           temp1.pre=null;
                           tail=head;
                           break;        
                }  
               
               
            }
            System.out.print("Do you want to delete more node press 1.");
            d=sc.nextInt();
            
        }while(d==1);
    }
    public static void main(String args[])
    {
        DoubleLinkedList dd=new DoubleLinkedList();
        dd.insertion();
        dd.traversal();
        dd.delete();
        dd.traversal();
       
    }
}