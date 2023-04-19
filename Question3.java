import java.util.*;
public class Question3
{
     public static int NumberofElementsInIntersection(int a[], int b[], int n, int m)
     {
        HashSet<Integer> hash=new HashSet<>();
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            hash.add(a[i]);
        }
        for(int i=0;i<b.length;i++)
        {
            if(hash.contains(b[i]))
            {
                count++;
                hash.remove(b[i]);
            }
        }
        return count;
     }
    public static void main(String []args)
    {
       int a[] = {89, 24, 75, 11, 23};
       int b[] = {89, 2, 4};
       int n=NumberofElementsInIntersection(a,b,a.length,b.length);
       System.out.print(n);

    }
   
}