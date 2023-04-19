import java.util.*;
public class ArrayCreation
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of arrays: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the values of arrays");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }

}