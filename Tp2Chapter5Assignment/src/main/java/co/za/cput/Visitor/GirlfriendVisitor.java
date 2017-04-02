package co.za.cput.Visitor;

/**
 *
 */
public interface GirlfriendVisitor
{
    public String visit(BlondeGirlfriend blondeGirlfriend);
    public String visit(BrunetteGirlfriend brunetteGirlfriend);
    public String visit(RedheadGirlfriend redheadGirlfriend);
}
