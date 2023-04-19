public class RunMethodes implements Runnable
{
    public void run(){
        System.out.print("this is  run methodes used");
    }
    public static void main(String []args)
    {
        RunMethodes r=new RunMethodes();
        Thread t1=new Thread(r);
        r.run();
    }
}