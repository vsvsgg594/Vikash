public class SleepMethodes extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.print(e);

            }
            System.out.print(i);
        }
    }
    public static void main(String args[])
    {
        SleepMethodes s1=new SleepMethodes();
        SleepMethodes s2=new SleepMethodes();
        s1.start();
        s2.start();
    }
}