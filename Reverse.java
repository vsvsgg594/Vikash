import java.util.*;
public class Reverse
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int num=sc.nextInt();
        int reverse=0;
        while(num!=0){
            reverse=reverse*10;
            reverse=reverse + num%10;
            num=num/10;
        }
        System.out.print("Reverse number " + reverse);

    }
}