public enum DeskSize {
    SMALL("Small desk, ideal for compact spaces"),
    MEDIUM("Medium desk, suitable for a variety of setups"),
    LARGE("Large desk, provides ample workspace");

    private final String description;

    DeskSize(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
