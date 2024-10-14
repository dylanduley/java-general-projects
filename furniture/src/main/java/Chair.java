public record Chair(int feet, Material material) {
    public Chair {
        if (feet <= 0) {
            throw new IllegalArgumentException("Number of feet must be greater than zero.");
        }
    }

    public String getMaterialDescription() {
        return material.getDescription();
    }
}
