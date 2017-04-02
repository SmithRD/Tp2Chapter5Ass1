package co.za.cput.AbstractFactory;

/**
 *
 */
public class TransportFactory implements ITransportFactory{

    private static TransportFactory trans = null;

    private TransportFactory(){}

    public static TransportFactory getInstance()
    {
        if(trans == null)
            return new TransportFactory();

        return trans;
    }

    @Override
    public Car getModel()
    {
        return new Toyota();
    }

    @Override
    public Motorcycle getType()
    {
        return new Ducati();
    }

}
