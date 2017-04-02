package co.za.cput.ChainOfResponsibility;

/**
 *
 */
public class Person2 extends Stranger{

    @Override
    public String handleCall(String name){
        if(name.equalsIgnoreCase("Dave"))
            return "Yes I am Dave";
        else
            return strange.handleCall(name);

    }
}
