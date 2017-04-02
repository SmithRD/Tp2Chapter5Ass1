package co.za.cput.Visitor;

/**
 *
 */
public class BlondeGirlfriend implements Girlfriend {
    private String name;

    public BlondeGirlfriend(String name) {
        this.name = name;
    }

    @Override
    public void accept(GirlfriendVisitor visitor){visitor.visit(this);}

    public String getName()
    {
        return name;
    }
}
