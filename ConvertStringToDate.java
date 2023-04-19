import java.util.*;
import java.text.SimpleDateFormat;  
import java.util.Date;
public class ConvertStringToDate
{
    public static void main(String args[])throws Exception{
        String sDate="03/04/2023";
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
        System.out.print(sDate + " "+ date1);
    }
}