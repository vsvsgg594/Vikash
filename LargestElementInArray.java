import java.util.*;
public class LargestElementInArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arryas");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the element into arrys :");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            int temp=0;
            for(int j=i+1;j<=size-1;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("largest element is " + arr[size-1]);
         System.out.print("second largest element is " + arr[size-2]);
    

    }
}