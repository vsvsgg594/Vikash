import java.util.*;
public class LinkedListfullInsertion
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
    // insertion code//
    public void insertion(){
        int data,n,ch;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("enter the data : ");
            data=sc.nextInt();
            Node new_node=new Node(data);
            if(head==null){
                head=new_node;
            }else{
                System.out.print("1.beining 2.last 3.middle 4.delete alternative " );
                ch=sc.nextInt();
                switch(ch){
                    case 1 : new_node.next=head;
                             head=new_node;
                             break;
                    case 2: Node temp1=head;
                            while(temp1.next!=null){
                                temp1=temp1.next;

                            }   
                            temp1.next=new_node;
                            break;
                    case 3:Node temp3=head;
                           System.out.print("enter the position : ");
                           int p=sc.nextInt();
                           for(int i=0;i<(p-1);i++){
                            temp3=temp3.next;
                           }        
                           new_node.next=temp3.next;
                           temp3.next=new_node;
                           break;

                    case 4:Node temp_delete=head;
                           while(temp_delete!=null && temp_delete.next!=null){
                            temp_delete.next=temp_delete.next.next;
                            temp_delete=temp_delete.next;
                           }       
                           break;
                    default :System.out.print("invalied");                
                }

            }
            System.out.print("1 press for more data insert ");
            n=sc.nextInt();
        }while(n==1);
    }
    //display data//
    public void display(){
        Node temp2=head;
        if(head==null){
            System.out.print("list is empty ");
        }else{
            while(temp2!=null){
                System.out.print(temp2.data + " ");
                temp2=temp2.next;
            }
        }
    }
    //deletion code//
    public void delete()
    {
        int d,c;
        Scanner sc=new Scanner(System.in);
        do{

        
        if(head==null)
        {
            System.out.print("there is no list");
        }else{
            
            
                System.out.println("1.delete from start 2. from last 3. from middle ");
                d=sc.nextInt();
                switch(d)
                {
                    case 1: Node temp4=head;
                           head=temp4.next;
                           break;
                    case 2 : Node temp5=head;
                             Node ptr=temp5.next;
                             while(ptr.next!=null){
                                temp5=ptr;
                                ptr=ptr.next;
                             }
                             temp5.next=null;
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
                    default : System.out.print("invalied ");        
                }

            
           
            
        }
            System.out.print("do you want to delete more data : ");
            c=sc.nextInt();
           
        }
        while(c==1);
    }
    // reverse linkedlist//
    public void reverse()
    {
        Node currNode=head;
        Node prevNode=null;

        while(currNode!=null)
        {
            Node temp=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=temp;
        }
        System.out.print("reversed");
        head=prevNode;

    }
    //middle data of linkedlist//
    public void getMiddle()
    {
        if(head==null)
        {
            System.out.println("zero ")
        }
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.print(slow.data);
    }
    //main methode//
    public static void main(String []args){
        LinkedListfullInsertion l1=new LinkedListfullInsertion();
        l1.insertion();
        l1.display();
        // l1.delete();
        // l1.display();
        l1.reverse();
        System.out.println();
        l1.display();
    }
}