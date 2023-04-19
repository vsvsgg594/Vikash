import java.util.*;
public class ImmediateSmaller
{
     void immediateSmaller(int arr[], int n)
     {
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1])
            {
                arr[i]=arr[i+1];
            }else{
                arr[i]=-1;
            }
        }
        arr[n-1]=-1;
     }
     public static void main(String []args)
     {
        ImmediateSmaller im=new ImmediateSmaller();
        int arr[]={4,2,1,5,3};
        int n=5;
        im.immediateSmaller(arr,5);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
     }
}