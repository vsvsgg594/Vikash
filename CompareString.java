public class CompareString
{
    public static void main(String[] args)
    {
        String name1="vikash";
        String name2="vikash";
        String name3=new String("vikash");
        System.out.println(name1==name2);
        System.out.println(name1==name3);
        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name1.compareTo(name2));
        System.out.println(name2.compareTo(name3));
    }
}