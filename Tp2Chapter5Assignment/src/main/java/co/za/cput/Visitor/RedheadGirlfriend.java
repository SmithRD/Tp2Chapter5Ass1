package co.za.cput.Visitor;

/**
 *
 */
public class RedheadGirlfriend implements Girlfriend{
    private String name, eyeColor;

    public RedheadGirlfriend(String name, String eyeColor) {
        this.name = name;
        this.eyeColor = eyeColor;
    }

    @Override
    public void accept(GirlfriendVisitor visitor){visitor.visit(this);}

    public String getEyeColor()
    {
        return eyeColor;
    }
}
