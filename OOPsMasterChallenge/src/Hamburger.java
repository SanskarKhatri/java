public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name + " burger on a " + breadRollType + " roll with " + meat + ", price is " + price);
    }

    public void addHamburgerAddition1(String name, double price) {
        addition1Name = name;
        addition1Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }
    public void addHamburgerAddition2(String name, double price) {
        addition2Name = name;
        addition2Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }
    public void addHamburgerAddition3(String name, double price) {
        addition3Name = name;
        addition3Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }
    public void addHamburgerAddition4(String name, double price) {
        addition4Name = name;
        addition4Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }
    public double itemizeHamburger() {
        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }
}
class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }
}
