package thebasics;

import thebasics.runnable.Multirunnable;
import thebasics.thread.Mulithread;

/**
 * Created by Abu
 */
public class Mainclass
{
    public static void main(String[] args)
    {
        Thread mulithread = new Mulithread("We are multi tasking in thread 1");
        mulithread.start();

        Thread mulithread2 = new Mulithread("Look, we're in thread 2");
        mulithread2.start();

        Thread runnable = new Thread(new Multirunnable("Thread runnable 1"));
        runnable.start();

        Thread runnable2 = new Thread(new Multirunnable("Thread runnable 2"));
        runnable2.start();

        Thread  threadnRunnable = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for(int i =0; i < 10; i++)
                {
                    System.out.println("Me in thread");
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
        });
        threadnRunnable.start();
    }
}
