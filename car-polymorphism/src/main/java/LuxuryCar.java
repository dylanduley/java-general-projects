public class LuxuryCar extends Vehicle {
    public LuxuryCar() {
        super(8, "Luxury Car");
    }

    @Override
    public void startEngine() {
        System.out.println("Luxury engine doesn't start.");
    }

    @Override
    public void accelerate() {
        System.out.println("Luxury car needs gas");
    }

    @Override
    public void brake() {
        System.out.println("Luxury brake doesn't respond. Uh oh.");
    }
}
