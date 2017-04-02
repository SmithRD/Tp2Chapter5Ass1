package co.za.cput.Adapter;

/**
 *
 */
public class FloatClass implements FloatAdapter
{

    private IntegerClass integer = new IntegerClass();

    @Override
    public float adapt()
    {
        return (float)integer.getValue();
    }
}
