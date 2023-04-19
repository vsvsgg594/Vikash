import java.util.*;
public class RemoveDuplicateUsingHashSet
{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,9,6,4,5,3};
        HashSet<Integer> hasg=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hasg.add(arr[i]);
    
        }
       for(int i:hasg){
        System.out.print(i + " ");
       }
    }
}