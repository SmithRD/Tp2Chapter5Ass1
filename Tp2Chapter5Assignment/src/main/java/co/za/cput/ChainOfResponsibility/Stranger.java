package co.za.cput.ChainOfResponsibility;

/**
 *
 */
public abstract class Stranger {

    Stranger strange;

    public void setSuccessor(Stranger strange)
    {
        this.strange = strange;
    }

    public abstract String handleCall(String name);
}
