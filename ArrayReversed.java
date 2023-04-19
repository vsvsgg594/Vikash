import java.util.*;
public class ArrayReversed
{
    public static void main(String[] agrs)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of arrays");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("enter the element into arrays :");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("original arrays :");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.print("Reversed array");
        for(int i=size-1;i>=0;i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}