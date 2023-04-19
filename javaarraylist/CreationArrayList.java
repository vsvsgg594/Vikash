import java.util.*;
public class CreationArrayList
{
    public static void main(String[] args){
        ArrayList<Integer> alist=new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(3);
        alist.add(4);
        alist.add(5);
        // System.out.print(alist);
        for(int i:alist){
            System.out.print(i);
        }
        System.out.println("values of position at 2 is "+alist.get(2));
        System.out.print("we replaced the values 3 to 7 "+alist.set(3,7));
        System.out.println(alist);
        for(int i=0;i<=alist.size();i++){
            alist.remove(i);
        }
        if(alist.isEmpty()){
            System.out.print("list is empty");
        }
        System.out.print(alist);
    }
}