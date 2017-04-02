package co.za.cput.Visitor;

/**
 *
 */
public class BrunetteGirlfriend implements Girlfriend{
    private String name, surname;

    public BrunetteGirlfriend(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void accept(GirlfriendVisitor visitor){visitor.visit(this);}

    public String getSurname()
    {
        return surname;
    }
}
