import java.util.*;
public class Prime
{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int number=sc.nextInt();
        int flag=0;
        if(number==0 || number==1){
            System.out.print("number is not prime");
        }else{
            for(int i=2;i<=number;i++){
                if(number%i==0){
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