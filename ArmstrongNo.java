import java.util.*;
public class ArmstrongNo
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,temp,digits=0;
        int sum=0;
        int remainder;
        System.out.print("enter the number ");
        n=sc.nextInt();
        temp=n;
        //count the number of digits//
        while(temp!=0){
            digits++;
            temp=temp/10;

        }
                while (temp != 0) {
                    remainder = temp%10;
                    sum = sum + power(remainder, digits);
                    temp = temp/10;
                         }
                       if (n == sum)
                              System.out.println(n + " is an Armstrong number.");
                       else
                               System.out.println(n + " is not an Armstrong number."); 

    }
    static int power(int n ,int r)
    {
        int c,p=1;
        for(c=1;c<=r;c++){
            p=p*n;

        }
        return p;
    }
}