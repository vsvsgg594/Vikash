import java.util.*;
public class StackThroughLinkedList
{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        

    }
    Node top=null;
    public void push(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the data : ");
        int data=sc.nextInt();
        Node new_node=new Node(data);
        if(top==null){
            top=new_node;

        }else{
            new_node.next=top;
            top=new_node;
        }
    }
    public void pop()
    {
        if(top==null){
            System.out.print("list is emtpy");
        }else{
            Node temp=top;
            top=temp.next;
        }
    }
    public void display(){
        Node temp=top;
        if(top==null){
            System.out.print("list is empty ");
        }else{
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
        }
    }
    public static void main(String args[]){
        StackThroughLinkedList st=new StackThroughLinkedList();
        st.push();
        st.pop();
        st.display();


    }
}