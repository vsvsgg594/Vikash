import java.util.*;
public class SortingArryas
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size arrays : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the element into year");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();

        }
          for(int i=0;i<size;i++)
        {
           System.out.print(arr[i]);
        }
        int temp=0;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size-1;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }  
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }    
    }
}