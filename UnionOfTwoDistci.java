import java.util.*;
public class UnionOfTwoDistci
{
    public static void main(String[] args)
    {
        int arr[]={1, 2, 3, 4, 5}  ;
        int arr2[]={1,2,3};
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            hash.add(arr[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            hash.add(arr2[i]);
        }
        ArrayList<Integer> arrlist=new ArrayList(hash);
        Collections.sort(arrlist);
        System.out.print(arrlist);
    }
}