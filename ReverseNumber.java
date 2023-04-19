import java.util.*;
public class ReverseNumber
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int num=sc.nextInt();
        int r;
        while(num>0){
            r=num%10;
            System.out.print(r);
            num=num/10;

        }
    }
}