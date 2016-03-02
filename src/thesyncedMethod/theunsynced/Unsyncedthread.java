package thesyncedMethod.theunsynced;

/**
 * Created by Abu.
 */
public class Unsyncedthread
{
    public int number = 0;

    public void doSomething()
    {
        Thread thread1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for(int i = 0; i < 10000; i++)
                {
                    increase();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for(int i = 0; i < 10000; i++)
                {
                    increase();
                }
            }
        });

        thread1.start();
        thread2.start();

        mJoin(thread1);
        mJoin(thread2);

        System.out.println(number);
    }

    private static void mJoin(Thread thread)
    {
        try
        {
            thread.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    private void increase()
    {
        number++;
    }
}
