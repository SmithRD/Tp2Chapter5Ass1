package co.za.cput.Prototype;

/**
 *
 */
public class Sheep implements Clone {
    private String name, countryOfOrigin;

    public Sheep(String name, String countryOfOrigin) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public Sheep copy() {
        return new Sheep(name, countryOfOrigin);
    }

    public String toString() {
        return String.format("Name: " + name + "Country of Origin: " + countryOfOrigin);

    }
}
