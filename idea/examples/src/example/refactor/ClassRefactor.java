package example.refactor;

/**
 * Created on 5/19/14
 *
 * @author vtolmer
 */
@SuppressWarnings("UnusedDeclaration")
public class ClassRefactor
{
    private static ClassRefactor instance = null;
    private String toto;

    // Singleton (live template geti)

    public String getToto()
    {
        return toto;
    }

    public void CapitalMethodName()
    {
    }

    public String injection()
    {
         //noinspection ClassNameDiffersFromFileName
        return "class InsideAString {" +
               "    private static String name = null;" +
               "    public String getName()" +
               "    {" +
               "        return name;" +
               "    }" +
               "    public String toString()" +
               "    {" +
               "        return this.getName();" +
               "    }" +
               "} ";
    }

}
