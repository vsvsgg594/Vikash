import java.util.*;
public class EqualsMethodString
{
    public static void main(String args[]){
        // String s1="vikash";
        // String s2="VIKASH";
        // String s3="Vikash";
        // String s4=new String("vikash");
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s3));
        // System.out.println(s1.equals(s4));
        // System.out.println(s1.equalsIgnoreCase(s3));
        //using == operator which comapre reference not values//
        // String s5="vikash";
        // String s6="viraj";
        // String s7=new String("viaksh");
        // String s8="VIKASH";
        //  String s9="vikash";
        // System.out.println(s5==s6);
        // System.out.println(s6==s7);
        // System.out.println(s5==s8);
        // System.out.println(s5==s9);
        //using compareTo()
        String s1="viaksh";
        String s2="sona";
        String s3=new String("minanama");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s2.compareTo(s3));

    
    }
}