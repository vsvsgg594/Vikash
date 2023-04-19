import java.util.*;
public class CreationLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<String> al=new LinkedList<>();
        al.add("viaksh");
        al.add("kumar");
        al.add("sharma");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        al.add("shekhar");
        al.addFirst("A");
        al.addLast("z");
        System.out.println(al);
        System.out.println(al.get(4));
        System.out.println(peek());
       
        

    }
}