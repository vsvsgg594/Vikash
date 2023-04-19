import java.util.*;
public class UnionOfTwoArray
{
    public static void main(String[] args)
    {
        int arr1[]={1,2,3,4,5,6,7};
        int arr2[]={3,6,7,9,0,11,23};
        int count=0;
        ArrayList<Integer> arrList=new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        {
            arrList.add(arr1[i]);

        }
        for(int i=0;i<arr2.length;i++)
        {
            if(arrList.contains(arr2[i]))
            {
                count++;
                arrList.add(arr2[i]);
            }
            
        }
        Iterator<Integer> itr=arrList.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }
        System.out.print("Common element is " +count);

    }
}