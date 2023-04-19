import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class AnagramString

{
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first string : ");
        String str1=sc.next();
        System.out.print("enter the second string : ");
        String str2=sc.next();

       
        char a1[]=str1.toCharArray();
        char a2[]=str2.toCharArray();
        int len1=a1.length;
        int len2=a2.length;
        Arrays.sort(a1);
        Arrays.sort(a2);
        boolean flag=false;
        if(len1==len2){
            for(int i=0;i<len1;i++){
                if(a1[i]==a2[i]){
                   flag=true;
                }
            }

        }
        if(flag){
            System.out.print("yes  string is anagram");
        }else{
            System.out.print("no  string is not anagram");
        }
    }
       
}