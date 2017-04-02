package co.za.cput.ChainOfResponsibility;

/**
 *
 */
public class Person3 extends Stranger{

    @Override
    public String handleCall(String name){
        if(name.equalsIgnoreCase("John"))
            return "Yes I am John";
        else
            return strange.handleCall(name);

    }
}
