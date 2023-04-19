import java.util.*;
public class Methods
{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the name :");
        String name=sc.next();
        System.out.print("your name is "+name);
        System.out.print("last alphabate of your name is "+ name.charAt(name.length()-1));
    }
}