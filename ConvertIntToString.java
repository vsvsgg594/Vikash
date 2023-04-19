public class ConvertIntToString
{
    public static void main(String args[]){
       int n=234;
       String str=String.valueOf(n);
       String rev="";
       for(int i=str.length()-1;i>=0;i--){
        rev=rev+str.charAt(i);
       }
       System.out.println(rev);
       int num=Integer.parseInt(rev);
       System.out.println(num+112);

    }
}