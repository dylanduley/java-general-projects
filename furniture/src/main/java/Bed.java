public record Bed(BedSize size, int numOfPillows) {
    public Bed {
        numOfPillows = Math.max(numOfPillows, 0);
        if (numOfPillows <= 0) {
            System.out.println("Invalid number of pillows, setting to 0.");
        }
    }

    public String getDescription() {
        return size.getDescription() + " with " + numOfPillows + " pillows.";
    }
}
