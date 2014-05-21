package example.refactor;

@SuppressWarnings("UnusedDeclaration")
public class ClassRefactor
{
    private static ClassRefactor instance = null;
    private String toto = null;

    // Singleton (live template geti), refactor

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
               "    @Override " +
               "    public String ToString()" +
               "    {" +
               "        return this.getName();" +
               "    }" +
               "} ";
    }

    public class InsideClass {
        ClassRefactor parent = null;
    }

}
