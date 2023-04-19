import java.util.*;
public class DeletionOfArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of arrays : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int arr1[]=new int[size-1];
        System.out.print("enter the element into arrays");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.print("enter the index where you want to delet the values");
        int index =sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(i<index)
            {
                arr1[i]=arr[i];
            }
            else if(i==index)
            {
                continue;
            }
            else
            {
                arr1[i-1]=arr[i];
            }
        }
            System.out.print("new arrays");
            for(int i=0;i<size-1;i++)
            {
                System.out.print(arr1[i] + " ");
            }
        }
    
}