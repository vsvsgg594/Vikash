import java.util.*;
public class Fascinating
{
    public static void main(String args[])
    {
        int num,multipl2,multipl3;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        num=sc.nextInt();
        multipl2=num*2;
        multipl3=num*3;
        String str=num+""+multipl2+multipl3;
        boolean flag=true;
        for(char ch=1;ch<='9';ch++)
        {
            int count=0;
            for(int i=0;i<str.length();i++)
            {
                char ch2=str.charAt(i);
                if(ch2==ch)
                {
                    count++;
                }
            }
            if(count>1||count==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.print(num+"fascinating number");
        }else
        {
            System.out.print(num+"not fasicnating number");
        }
    }
}