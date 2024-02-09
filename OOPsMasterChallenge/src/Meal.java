public class Meal {
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public Meal() {
        this.burger = new Burger("AlooTikki Burger",30);
        this.drink = new Drink("Mountain Dew","m");
        this.sideItem = new SideItem("Fries",20);
    }
    public Meal(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public int getFinalPrice() {
        return burger.getPrice() + drink.getPrice() + sideItem.getPrice();
    }
    public void changeDrinkSize(String size) {
        drink.setSize(size);
    }
    public void addBurgerTopping(Topping topping1) {
        addBurgerTopping(topping1,null,null);
    }
    public void addBurgerTopping(Topping topping1, Topping topping2) {
        addBurgerTopping(topping1,topping2,null);
    }
    public void addBurgerTopping(Topping topping1, Topping topping2, Topping topping3) {
        burger.setTopping1(topping1);
        burger.setTopping2(topping2);
        burger.setTopping3(topping3);
    }
    public String showMeal() {
        return "Meal{" +
                "burger=" + burger +
                ", drink=" + drink +
                ", sideItem=" + sideItem +
                '}';
    }
}
