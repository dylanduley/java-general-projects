public enum BedSize {
    TWIN("Twin bed, suitable for one person"),
    FULL("Full bed, suitable for one or two people"),
    QUEEN("Queen bed, spacious for two people"),
    KING("King bed, very spacious for two people");

    private final String description;

    BedSize(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
