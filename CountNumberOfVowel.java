public class CountNumberOfVowel
{
    public static void main(String args[])
    {
        String str="a men can sit anywhere";
        int count=0;
        for(int i=0;i<=str.length()-1;i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='e'||str.charAt(i)=='W'||str.charAt(i)=='w'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='u'||str.charAt(i)=='U')
            {
                count++;
            }
        }
        System.out.print("total number of string is " + count);
    }
}