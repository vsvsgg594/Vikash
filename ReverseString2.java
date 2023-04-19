import java.util.*;
public class ReverseString2
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string : ");
        String str=sc.next();
        char []arr1=str.toCharArray();
        for(int i=arr1.length-1;i>=0;i--){
            System.out.print(arr1[i]);
        }
    }
}