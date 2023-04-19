import java.util.*;
public class SwapingTwoNo
{
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        //we want to swaping both number with help of third veriable//
        //let's make third veriable//
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.print(" a : "+ a + " b: "+ b);
    }
}