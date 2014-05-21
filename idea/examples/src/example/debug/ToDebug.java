package example.debug;

import java.util.ArrayList;

/**
 * Created on 5/19/14
 *
 * @author vtolmer
 */
@SuppressWarnings("MagicNumber")
public final class ToDebug
{
    ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args)
    {
        ToDebug d = new ToDebug();
        printMessage();
        d.longLoop();
        printMessage();
    }

    private void longLoop()
    {
        for (int i = 0; i < 2000; i++)
        {
            // Conditional breakpoint
            // breakpoint after several times
            // View data state
            if (i % 365 == 0)
            {
                System.out.println("A year!");
                list.add(i);
            }
        }

        // run to cursor

        System.out.println("Done!");
    }

    private static void printMessage()
    {
        System.out.println("Test");
    }
}
