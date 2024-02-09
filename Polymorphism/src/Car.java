public class Car {
    private boolean engine;
    private int cyclinders;
    private String name;
    private int wheels;

    public Car(int cyclinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cyclinders = cyclinders;
        this.name = name;
    }

    public int getCyclinders() {
        return cyclinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println(this.getClass().getSimpleName() + " -> startEngine()");
    }
    public void accelerate() {
        System.out.println(this.getClass().getSimpleName() + " -> accelerate()");
    }
    public void brake() {
        System.out.println(this.getClass().getSimpleName() + " -> brake()");
    }
}
class Mitsubishi extends Car {
    public Mitsubishi(int cyclinders, String name) {
        super(cyclinders, name);
    }

}