public class Vehicle {
    private final boolean engine;
    private final int cylinders;
    private final String type;
    private final int wheels;

    public Vehicle(int cylinders, String type) {
        this.engine = true;
        this.cylinders = cylinders;
        this.type = type;
        this.wheels = 4;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getType() {
        return type;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

    public void accelerate() {
        System.out.println("Accelerated");
    }

    public void brake() {
        System.out.println("Brake initiated");
    }
}
