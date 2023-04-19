import java.util.*;
public class HashSetCreation
{
    public static void main(String[] args){
        HashSet<Integer> hashset=new HashSet<>();
        hashset.add(1);
        hashset.add(2);
        hashset.add(3);
        hashset.add(4);
        hashset.add(5);
        hashset.add(6);
        hashset.add(6);
        System.out.print(hashset);
    }
}