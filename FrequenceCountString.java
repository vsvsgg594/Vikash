import java.util.*;
public class FrequenceCountString
{
    public static void main(String args[]){
        String str="helle everyone how are you";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                count++;
            }
        }
        System.out.println(count);
    }
}