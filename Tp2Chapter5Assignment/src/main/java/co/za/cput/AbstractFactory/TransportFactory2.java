package co.za.cput.AbstractFactory;

/**
 *
 */
public class TransportFactory2 implements ITransportFactory{

    private static TransportFactory2 trans2 = null;

    private TransportFactory2(){}

    public static TransportFactory2 getInstance()
    {
        if(trans2 == null)
            return new TransportFactory2();

        return trans2;
    }

    @Override
    public Car getModel()
    {
        return new Mercedes();
    }

    @Override
    public Motorcycle getType()
    {
        return new HarleyDavidson();
    }

}
