import java.util.*;
public class UnioneArrayByArrayList
{
    public static void main(String args[]){
        int arr1[]={23,78,45,34};
        int arr2[]={90,87,67,32};
        ArrayList<Integer> arrList=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            arrList.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            arrList.add(arr2[i]);
        }
        System.out.print(arrList);
        Collections.sort(arrList);
        for(int i:arrList){
            System.out.print(i + " ");
        }
    }
}