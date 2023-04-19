import java.util.*;
public class StackThroughArray
{
    int top=-1;
    int n=10;
    int arr[]=new int[100];
    public void push()
    {
        Scanner sc=new Scanner(System.in);
        if(top==n-1){
            System.out.print("stakc is overflow condition");
        }else{
            
                top++;
                System.out.print("enter the data : ");
                int data=sc.nextInt();
                arr[top]=data;
            
            
        }

       
    }
    public void pop(){
        if(top==-1){
            System.out.print("Stack is underFlow conditions ");

        }else{
            top--;
        }
    }
    public void display(){
        if(top==-1){
            System.out.print("stakc is empty");
        }else{
            for(int i=top;i<=0;i--){
                System.out.print(top + " ");
            }
        }
    }
    public static void main(String args[]){
        StackThroughArray st=new StackThroughArray();
        st.push();
       
        st.display();
         st.pop();

    }


    
}