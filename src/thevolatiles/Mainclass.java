package thevolatiles;

import java.util.Scanner;

/**
 * Created by Abu.
 */
public class Mainclass
{
    public static void main(String[] args)
    {
        Multithreadvolatile multithread = new Multithreadvolatile("thread 1");
        multithread.start();

        Multithreadvolatile multithread2 = new Multithreadvolatile("thread 2");
        multithread2.start();

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        multithread.stopThread();
        multithread2.stopThread();
    }
}
