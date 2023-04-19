import java.util.*;
public class AdditionOfMultiDimension
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row :");
        int r=sc.nextInt();
        System.out.print("enter the column : ");
        int c=sc.nextInt();
        int arr1[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        int result[][]=new int[r][c];
        int mul[][]=new int[r][c];
        System.out.print("enter element into arrays1 : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr1[i][j]=sc.nextInt();

            }
        }
         System.out.print("enter element into arrays2 : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr2[i][j]=sc.nextInt();
                
            }
        }
        // System.out.print("sum of two arrays ");
        // for(int i=0;i<r;i++)
        // {
        //     for(int j=0;j<c;j++)
        //     {
        //         result[i][j]=arr1[i][j]+arr2[i][j];
        //         System.out.print(result[i][j]);
        //     }
        //     System.out.println();
        // }
        for(int i=0;i<r;i++)
        {
            for(int j=0;i<c;i++)
            {
                mul[i][j]=0;
                for(int k=0;k<r;k++)
                {
                    mul[i][j]=mul[i][j]+arr1[i][j]*arr2[k][j];
                }
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }


    }
}