import java.util.*;
public class ArraylistIntersection
{
    public static void main(String[] args){
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={8,9,1,2,3,4,5};
        ArrayList<Integer> arrlist=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            arrlist.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(arrlist.contains(arrlist.get(i)))
            {
                arrlist.remove(arr1[i]);
            }else{
                arrlist.add(arr2[i]);
            }
        }
    }
}