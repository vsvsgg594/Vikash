public class PrintOddPositionString
{
    public static void main(String agrs[]){
        String name="welcome";
        for(int i=0;i<=name.length()-1;i++){
            if(i%2!=0){
                System.out.println("Char is " + i +" place " +" "+ name.charAt(i));
            }
        }
    }
}