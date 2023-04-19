import java.util.*;
public class PalidronArray
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n=sc.nextInt();
        int sum=0,r,temp;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.print("Given Number is palidron");
        }
        else
        {
            System.out.print("Given number is not palidron");
        }
        

    }
}