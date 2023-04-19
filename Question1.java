public class Question1
{
      public static Long product(Long arr[], Long mod, int n)
      {
        long mul=1;
        for(int i=0;i<arr.length;i++)
        {
            mul=((long)mul*arr[i])%mod;
        }
        return mul;
      }
    
}