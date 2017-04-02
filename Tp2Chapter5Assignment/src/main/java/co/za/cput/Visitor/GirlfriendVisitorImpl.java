package co.za.cput.Visitor;

/**
 *
 */
public class GirlfriendVisitorImpl implements GirlfriendVisitor{

   @Override
    public String visit(BlondeGirlfriend blondeGirlfriend)
   {
      return  blondeGirlfriend.getName();
   }

    @Override
    public String visit(BrunetteGirlfriend brunetteGirlfriend)
    {
        return  brunetteGirlfriend.getSurname();
    }

    @Override
    public String visit(RedheadGirlfriend redheadGirlfriend)
    {
        return redheadGirlfriend.getEyeColor();
    }
}
