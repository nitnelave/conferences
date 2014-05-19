package example.livetemplate;

/**
 * Created on 5/19/14
 *
 * @author vtolmer
 */
@SuppressWarnings("UnusedDeclaration")
public class Template
{
    private boolean canDo = false;
    private Object field = null;
    private int[] array = null;
    private int index = 0;

    public void postFix()
    {
        // if

        // else

        // notnull

        // instanceof

    }

    public void prefix()
    {
        // if not null

        // last of an array

        // max

    }

    public void surround()
    {
        // surround with parenthesis
        //noinspection PointlessBooleanExpression,ConstantConditions
        if (true && false || true)
            return;

        System.out.println("Surround with braces");
        System.out.println("Surround with callable");


    }
}
