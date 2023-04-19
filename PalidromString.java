import java.util.*;
public class PalidromString
{
    public static void main(String[] args){
        String str="abbav";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(rev.equals(str)){
            System.out.print("string is palidrom");
        }else{
            System.out.print("string is not palidrom");
        }
    }
}