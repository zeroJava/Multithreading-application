package thevolatiles;

/**
 * Created by Abu.
 */
public class Multithreadvolatile extends Thread
{
    private volatile boolean state = true;
    /* volatile keyword is used to assign variable that makes it truly global, and place in the memory to it can be
     * seen by other threads.
     * When a change happens in a thread, theoretically there is a chance that it will only happen in the cache,
     * so adding volatile, it places in the memory, and when a change happens, it will happens in the memory.
     */
    // http://javarevisited.blogspot.co.uk/2011/06/volatile-keyword-java-example-tutorial.html
    private String string;

    public Multithreadvolatile(String string)
    {
        this.string = string;
    }

    @Override
    public void run()
    {
        while(this.state)
        {
            System.out.println("Hello " + string);
            try
            {
                sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public void stopThread()
    {
        this.state = false;
    }
}
