package co.za.cput.Bridge;

/**
 *
 */
public class Abstraction {

    private IFruit fruit;

    public Abstraction()
    {
        fruit = new Apple();
    }

    public String types()
    {
        return fruit.types();
    }
}
