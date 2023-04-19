import java.util.*;
public class Farentate 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the tempatures : ");
        int temp=sc.nextInt();
        int cel=((temp-32)*5)/9;
        System.out.print(cel);
    }
}