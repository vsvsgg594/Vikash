import java.util.*;
public class MapCreation
{
    public static void main(String[] args){
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        //traversing map interface //
        for(Map.Entry m:map.entrySet()){
            System.out.print(m.getKey()  +" "+  m.getValue());
        }
    }
}