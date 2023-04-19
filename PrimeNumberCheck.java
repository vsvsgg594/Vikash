import java.util.*;
public class PrimeNumberCheck
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : " );
        int num=sc.nextInt();
        int flag=0;
        if(num%2==0){
            System.out.print("no prime");
        }
        if(num==0 || num==1){
            System.out.print("these are not prime number");
        }else{
            for(int i=3;i<=num;i+=2){
                if(num%i==0){
                    System.out.print("number is not prime");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.print("number is prime");
        }

     }
    }
}