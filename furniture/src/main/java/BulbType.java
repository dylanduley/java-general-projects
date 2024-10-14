public enum BulbType {
    INCANDESCENT("Traditional bulb"),
    LED("Energy-efficient bulb"),
    CFL("Fluorescent bulb");

    private final String description;

    BulbType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
