package co.za.cput.Singleton;

/**
 *
 */
public class Dog {
    private static Dog dog = null;

    private Dog(){

    }

    public static Dog getInstance(){
        if(dog == null)
        {
            dog = new Dog();
        }
        return dog;
    }



}
