package thebasics.runnable;

/**
 * Created by Abu.
 */
public class Multirunnable implements Runnable
{
    private String string;

    public Multirunnable(String string)
    {
        this.string = string;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("In " + string);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
