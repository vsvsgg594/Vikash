import java.util.*;
public class HashMapRemovedDuplicate
{
    public static void main(String[] args)
    {
        int arr[]={1,2,2,3};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.add(arr[i]);
            if(hm.contains(arr[i]))
            {
                hm.remove(arr[i]);
            }
            else
            {
                hm.add(arr[i]);
            }
        }
    }
}