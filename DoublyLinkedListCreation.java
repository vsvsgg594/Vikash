import java.util.*;
public class DoublyLinkedListCreation
{
    static class Node{
        int data;
        Node next;
        Node pre;
        Node(int data){
            this.data=data;
            this.next=null;
            this.pre=null;
        }
    }
    Node head=null;
    Node tail=null;
    public void creationNode(){
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
                  else{
                        new_node.next=head;
                        head=new_node;
                      }
                 System.out.print("do you want to insert more data press 1");
                 n=sc.nextInt();
        }while(n==1);
     }
     public void display()
     {
        Node temp=head;
        if(head==null){
            System.out.print("list is not there");

        }else{
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
        }
     }
     public void display_travrse()
     {
        Node temp=tail;
        if(tail==null){
            System.out.print("list is not empty");
        }else{
            while(temp.next!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
        }
     }
     public static void main(String []args)
     {
        DoublyLinkedListCreation d1=new DoublyLinkedListCreation();
        d1.creationNode();
        d1.display();
        d1.display_travrse();
     }
     
}