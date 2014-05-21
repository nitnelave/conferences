package example.complete;

import java.io.OutputStream;

/**
 * @author nitnelave
 */
@SuppressWarnings("UnusedDeclaration")
public class Complete
{
    private String field = null;
    private OutputStream out = null;

    public Complete(String s)
    {
    }

    public Complete(String s, int j)
    {
    }

    public Complete(int o)
    {
        toto(MyEnum.HENRY);
        toto(MyEnum.HENRY);
        toto(MyEnum.HENRY);
        toto(MyEnum.HENRY);
        toto(MyEnum.HENRY);
        toto(MyEnum.HENRY);
        toto(MyEnum.HENRY);

        // Context-sensitive completion
        // call toto()


    }

    public String toto(MyEnum john)
    {
        return field;
    }

    public void veryLongMethodNameWithCamlCase()
    {}

    public void veryLongMethodNameToDifferentiate()
    {}

    public void test()
    {
        // field completion


        // Constructor suggestion


        // CamlCase completion


    }
}
