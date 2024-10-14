public class CarDetails {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            Vehicle vehicle = randomVehicle();
            assert vehicle != null;
            System.out.println("Vehicle #" + i + " is a " +
                    vehicle.getType() + "\nCylinders: " + vehicle.getCylinders());
            vehicle.accelerate();
            vehicle.brake();
            vehicle.startEngine();
            System.out.println();
        }
    }

    public static Vehicle randomVehicle() {
        int randomNum = (int) (Math.random() * 2) + 1;
        System.out.println("Random number generated is " + randomNum);
        return switch (randomNum) {
            case 1 -> new LuxuryCar();
            case 2 -> new Truck();
            default -> null;
        };
    }
}
