import java.util.*;
public class SumOfFirstNPrimeNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number :");
        int n=sc.nextInt();
        int sum=0;
        int i,j,count;
        for(i=1;i<=n;i++){
            count=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(" " +i+" ");
                sum=sum+i;
            }

        }
        System.out.print("sum of "+n+" prime number"+sum);
    }
}