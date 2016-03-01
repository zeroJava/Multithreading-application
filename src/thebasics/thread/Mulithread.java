package thebasics.thread;

/**
 * Created by Abu
 */
public class Mulithread extends Thread
{
    private String string;

    public Mulithread(String string)
    {
        this.string = string;
    }

    @Override
    public void run()
    {
        for(Character character : string.toCharArray())
        {
            System.out.println(this.string);
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
