public record Desk(DeskSize size, Material material) {
    public Desk {
        if (size == null || material == null) {
            throw new IllegalArgumentException("Desk size and material cannot be null.");
        }
    }

    public String getMaterialDescription() {
        return material.getDescription();
    }
}
