public class Strat extends Thread
{
    public void run()
    {
        System.out.println("i am implenent starts methodes");
    }
    public static void main(String[] args){
        Strat obj=new Strat();
        obj.start();
    }
}