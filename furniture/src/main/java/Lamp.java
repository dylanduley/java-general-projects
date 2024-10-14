public class Lamp {
    private final BulbType typeOfLightBulb;
    private final int lightWatts;
    private boolean onOrOff;

    public Lamp(BulbType typeOfLightBulb, int lightWatts, boolean onOrOff) {
        this.typeOfLightBulb = typeOfLightBulb;
        this.lightWatts = lightWatts;
        this.onOrOff = onOrOff;
    }

    public BulbType getTypeOfLightBulb() {
        return typeOfLightBulb;
    }

    public int getLightWatts() {
        return lightWatts;
    }

    public void turnItOnOrOff() {
        onOrOff = !onOrOff;
        System.out.println("Lamp is " + (onOrOff ? "On!" : "Off!"));
    }

    public String getBulbDescription() {
        return typeOfLightBulb.getDescription();
    }
}
