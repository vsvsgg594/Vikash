import java.util.*;
public class MultiDimensionArrayCreation
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row : ");
        int r=sc.nextInt();
        System.out.print("Enter the column : ");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.print("enter the element into arrays : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("MultiDimension Arrays :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}