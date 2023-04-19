import java.util.*;
public class PrimenumberRange
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number range that you want to print the prime number ");
        int num=sc.nextInt();
        int i;
        int j;
        int count;
        for(i=1;i<=num;i++){
            count=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i + " ");
            }
        }
    }
}