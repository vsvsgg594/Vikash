import java.util.*;
public class UnioneUniqueElement
{
    public static void main(String[] args){
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={2,3,7,8,9,10};
        ArrayList<Integer> arrlist=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            arrlist.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(!arrlist.contains(arrlist.get(i))){
                 arrlist.add(arr2[i]);
            }
        }
        Collections.sort(arrlist);
        for(int i:arrlist){
            System.out.print(i + " ");
        }

    }
}