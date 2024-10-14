public class Truck extends Vehicle {
    public Truck() {
        super(4, "Truck");
    }

    @Override
    public void startEngine() {
        System.out.println("Truck starts.");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck needs more gas.");
    }

    @Override
    public void brake() {
        System.out.println("Truck brake initiated.");
    }
}
