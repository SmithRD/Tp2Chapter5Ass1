package co.za.cput.AbstractFactory;

/**
 *
 */
public interface ITransportFactory {
    abstract Motorcycle getType();
    abstract Car getModel();
}
