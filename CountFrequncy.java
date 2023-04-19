import java.util.*;
public class CountFrequncy
{
    public static void main(String[] args)
    {
        String name="welcome to bihar place of peace";
        int count=0;
        for(int i=0;i<=name.length()-1;i++)
        {
            if(name.charAt(i)=='e')
            {
                count++;
            }
        }
        System.out.print(count);
    }
}