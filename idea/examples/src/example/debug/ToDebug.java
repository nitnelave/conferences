package example.debug;

/**
 * Created on 5/19/14
 *
 * @author vtolmer
 */
@SuppressWarnings("MagicNumber")
public final class ToDebug
{
    public static void main(String[] args)
    {
        printMessage();
        longLoop();
        printMessage();
    }

    private static void longLoop()
    {
        for (int i = 0; i < 2000; i++)
        {
            if (i % 365 == 0)
            {
                System.out.println("A year!");
            }
        }
        System.out.println("Done!");
    }

    private static void printMessage()
    {
        System.out.println("Test");
    }
}
