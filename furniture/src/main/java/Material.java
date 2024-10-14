public enum Material {
    WOOD("Durable and strong"),
    METAL("Sturdy and modern"),
    PLASTIC("Lightweight and versatile");

    private final String description;

    Material(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
