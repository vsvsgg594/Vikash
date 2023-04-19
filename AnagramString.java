import java.util.*;
public class AnagramString
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter string : ");
    String str1=sc.next();
    System.out.println("enter second string : ");
    String str2=sc.next();
    boolean flag=false;
    char[] arr1=str1.toCharArray();
    char[] arr2=str2.toCharArray();
    int len1=arr1.length;
    int len2=arr2.length;
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    if(len1==len2){
        for(int i=0;i<len1;i++){
            if(arr1[i]==arr2[i]){
                flag=true;


            }

        }
    }
    if(flag){
        System.out.println("string is anagram");
    }else{
        System.out.println("string is not anagram");
    }


  }
}