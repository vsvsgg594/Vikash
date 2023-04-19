import java.util.*;
public class StackThroughLinkedList
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
     Node top=null;
     public void push()
     {
        int data,n,ch;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.print("enter the data ");
            data=sc.nextInt();
            Node new_node=new Node(data);
            if(top==null){
                top=new_node;
            }else{
                new_node.next=top;
                top=new_node;
            }
            System.out.print("do you want to insert more data ");
            n=sc.nextInt();
        }while(n==1);
     }
     public void pop()
     {
        Scanner sc=new Scanner(System.in);
        int n;
        Node temp=top;
        do{
            if(top==null)
            {
                System.out.print("underflow situation");
            }else{
                temp=temp.next;

            }
            System.out.print("do you want to delelete more data press 1");
            n=sc.nextInt();

        }while(n==1);


     }
     public void display()
     {
        Node temp=top;
        if(top==null)
        {
            System.out.print("stack is empty");
        }else{
            while(temp!=null)
            {
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
        }
     }
     public static void main(String []args)
     {
        StackThroughLinkedList s1=new StackThroughLinkedList();
        s1.push();
        s1.pop();
        s1.display();
     }
}