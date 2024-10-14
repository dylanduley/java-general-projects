public record Bedroom(Bed bed, Chair chair, Desk desk, Lamp lamp) {
    public void turnOnOrOffLamp() {
        lamp.turnItOnOrOff();
    }

    public void displayDetails() {
        System.out.println("Bedroom details:");
        System.out.println(bed.getDescription());
        System.out.println("Chair material: " + chair.getMaterialDescription());
        System.out.println("Desk size: " + desk.size().getDescription());
        System.out.println("Desk material: " + desk.getMaterialDescription());
        System.out.println("Lamp type: " + lamp.getBulbDescription());
        System.out.println("Lamp wattage: " + lamp.getLightWatts());
    }
}
