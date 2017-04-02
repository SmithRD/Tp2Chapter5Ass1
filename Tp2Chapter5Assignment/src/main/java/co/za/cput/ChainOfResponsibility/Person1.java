package co.za.cput.ChainOfResponsibility;

/**
 *
 */
public class Person1 extends Stranger{

    @Override
    public String handleCall(String name){
        if(name.equalsIgnoreCase("Peter"))
            return "Yes I am Peter";
        else
            return strange.handleCall(name);

    }

}
