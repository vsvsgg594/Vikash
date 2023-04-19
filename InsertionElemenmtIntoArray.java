import java.util.*;
public class InsertionElemenmtIntoArray
{
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of arrays : ");
        int size=sc.nextInt();
        int arr1[]=new int[size];
        int arr2[]=new int[size+1];
        System.out.print("enter the element into arrays : ");
        for(int i=0;i<size;i++)
        {
            arr1[i]=sc.nextInt();

        }
        System.out.print("original arrays ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr1[i] + " ");
        }
            System.out.print("Enter the index of where you want to insert value");
            int index=sc.nextInt();
            System.out.print("enter the values ");
            int value=sc.nextInt();
            for(int i=0;i<size+1;i++)
            {
                if(i<index)
                {
                    arr2[i]=arr1[i];
                }
                else if(i==index)
                {
                    arr2[i]=value;
                }
                else
                {
                    arr2[i]=arr1[i-1];
                }
            }
            System.out.print("new arrays");
            for(int i=0;i<size+1;i++)
            {
                System.out.print(arr2[i]+ " ");
            }

    }
}