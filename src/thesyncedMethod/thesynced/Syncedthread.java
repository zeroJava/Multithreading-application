package thesyncedMethod.thesynced;

/**
 * Created by Abu.
 */
public class Syncedthread
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

    private synchronized void increase()
    {
        number++;
    }
    /* The synchronized keyword is a lock used to help provide order in threads, by providing an locking mechanism.
     * Locking mechanism allows us to stop multiple threads using the same property (variable/method) at once,
     * and limit it to just one thread.
     * This allows us to have a situation where a property can only be used by another thread if the previous
     * thread has finished executing.
     */
}
