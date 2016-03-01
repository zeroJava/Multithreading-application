package thebasics;

import thebasics.thread.Mulithread;

/**
 * Created by Abu
 */
public class Mainclass
{
    public static void main(String[] args)
    {
        Mulithread mulithread = new Mulithread("We are multi tasking in thread 1");
        mulithread.start();

        Mulithread mulithread2 = new Mulithread("Look, we're in thread 2");
        mulithread2.start();
    }
}
