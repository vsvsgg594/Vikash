import java.util.*;
public class SwapingTwoNoWithout
{
    public static void main(String args[])
    {
        int a=20;
        int b=10;
        //output will be a=10 and  b=20 without using third varible//
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print(" a : " + a + " b : " + b);
    }
}