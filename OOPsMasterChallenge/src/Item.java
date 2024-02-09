public class Item {
    private String type;
    private int price;

    public Item() {
        this.type = "Unknown";
        this.price = 0;
    }
    public Item(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
class Burger extends Item {
    private Topping topping1, topping2, topping3;

    public Burger(String type, int price) {
        super(type, price);
        this.topping1 = new Topping();
        this.topping2 = new Topping();
        this.topping3 = new Topping();
    }

    @Override
    public int getPrice() {
        int basePrice = super.getPrice();
        int topping1price = topping1.getPrice();
        int topping2price = topping2.getPrice();
        int topping3price = topping3.getPrice();
        return basePrice + topping1price + topping2price + topping3price;
    }

    public Topping getTopping1() {
        return topping1;
    }

    public void setTopping1(Topping topping1) {
        this.topping1 = topping1;
    }

    public Topping getTopping2() {
        return topping2;
    }

    public void setTopping2(Topping topping2) {
        this.topping2 = topping2;
    }

    public Topping getTopping3() {
        return topping3;
    }

    public void setTopping3(Topping topping3) {
        this.topping3 = topping3;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "topping1=" + topping1 +
                ", topping2=" + topping2 +
                ", topping3=" + topping3 +
                "} " + super.toString();
    }
}
class Topping extends Item {
    public Topping() {
        super();
    }
    public Topping(String type, int price) {
        super(type, price);
    }
}
class Drink extends Item {
    private String size;

    public Drink(String type, String size) {
        super(type, (size == "l") ? 60 : ((size == "m") ? 45 : 25));
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
        super.setPrice((size == "l") ? 60 : ((size == "m") ? 45 : 25));
    }

    @Override
    public String toString() {
        return "Drink{" +
                "size='" + size + '\'' +
                "} " + super.toString();
    }
}
class SideItem extends Item {
    public SideItem(String type, int price) {
        super(type, price);
    }

}
class DeluxeBurger extends Burger {
    private Topping topping4, topping5;

    public DeluxeBurger(String type, int price) {
        super(type, price);
        int topping4price = topping4.getPrice();
        int topping5price = topping5.getPrice();
    }

    @Override
    public int getPrice() {
        int basePrice = super.getPrice();
        int topping4price = topping4.getPrice();
        int topping5price = topping5.getPrice();
        return basePrice + topping4price + topping5price;
    }

    public Topping getTopping4() {
        return topping4;
    }

    public void setTopping4(Topping topping4) {
        this.topping4 = topping4;
    }

    public Topping getTopping5() {
        return topping5;
    }

    public void setTopping5(Topping topping5) {
        this.topping5 = topping5;
    }

    @Override
    public String toString() {
        return "DeluxeBurger{" +
                "topping4=" + topping4 +
                ", topping5=" + topping5 +
                "} " + super.toString();
    }
}