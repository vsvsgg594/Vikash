import java.util.*;
public class ConatinsMethodes
{
    public static void main(String args[]){
        ArrayList<Integer> arrlist=new ArrayList<>();
        arrlist.add(90);
        arrlist.add(80);
        arrlist.add(100);
        arrlist.add(30);
        arrlist.add(800);
        Collections.sort(arrlist);
        System.out.print(arrlist);
        for(int i:arrlist){
            System.out.print(i+ " ");
        }
        boolean ans=arrlist.contains(800);
        if(ans){
            System.out.print("yes list have element");
        }  
        if(arrlist.contains(arrlist.get(4))){
            arrlist.add(900);
        }
        System.out.print(arrlist);
        }
}