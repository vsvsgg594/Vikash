public class Question2
{
    public static int convert(int num)
    {
        String s=String.valueOf(num);
        s=s.replaceAll("0","5");
        int n=Integer.parseInt(s);
        return n;
    }
    public static void main(String[] args)
    {
        int num=1004;
        int n1=convert(num);
        System.out.print(n1);
    }
}