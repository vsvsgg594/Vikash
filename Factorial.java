import java.util.*;
public class Factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        int fac=1;
        if(n<0){
            System.out.print("please enter the non-negative number");
        }else{
            for(int i=1;i<=n;i++){
                fac=fac*i;
            }
            System.out.print("factorial is  " + fac);

        }
    
        
    }
}