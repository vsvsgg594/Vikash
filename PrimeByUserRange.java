import java.util.*;
public class PrimeByUserRange
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number range tha you want to prime number");
        int n=sc.nextInt();
        int j;
        int i;
        int count;
        for(i=1;i<=n;i++)
        {
            count=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }

        }
    }
}