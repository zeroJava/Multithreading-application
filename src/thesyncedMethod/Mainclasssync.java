package thesyncedMethod;

import thesyncedMethod.thesynced.Syncedthread;
import thesyncedMethod.theunsynced.Unsyncedthread;

/**
 * Created by Abu.
 */
public class Mainclasssync
{
    public static void main(String[] args)
    {
        Unsyncedthread thread1 = new Unsyncedthread();
        thread1.doSomething();

        Syncedthread syncedthread = new Syncedthread();
        syncedthread.doSomething();
    }
}
