import java.util.*;
public class StackByArray
{
    int n=10;
    int top=-1;
    int stack[]=new int[n];
    public void push()
    {
        Scanner sc=new  Scanner(System.in);
        int m;
        do
        {

        
        if(top==n-1){
            System.out.println("overflow stack");
        }else{
            System.out.print("enetr the data ");
            int data=sc.nextInt();
            top++;
            stack[top]=data;
            System.out.println("data inserted successfully");
        }
        System.out.print("do you want to insert more data press 1");
        m=sc.nextInt();

        }while(m==1);
    }
     public void pop()
     {
        Scanner sc=new Scanner(System.in);
        int n;
        do
        {

        
       if(top==-1)
         {
             System.out.print("ubderflow situation");
         }
         else{
            top--;
             System.out.print("item deleted succesfully");
         }
         System.out.println("do you want to delete data ");
         n=sc.nextInt();

        }while(n==1);

     }
    public void display()
    {
        if(top==-1)
        {
            System.out.println("no itesm");
        }
        else{
            for(int i=top;i>=0;i--){
                System.out.print(stack[i]);
            }
        }
    }
    public void peek()
    {
        if(top==-1)
        {
            System.out.print("ubderflow sitution ");
        }
        else{
            
        }
    }
    public static void main(String args[])
    {
        StackByArray s1=new StackByArray();
        s1.push();
        s1.display();
         s1.pop();
        s1.display();
    }
}