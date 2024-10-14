public class Printer {
    private int tonerLevel;
    private int numOfPagesPrinted;
    private final boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        setTonerLevel(tonerLevel);
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillUpToner(int amount) {
        if (amount < 0) {
            System.out.println("Invalid amount to fill toner.");
            return;
        }
        // Ensure toner level does not exceed 100
        tonerLevel = Math.min(tonerLevel + amount, 100);
        System.out.println("Toner level is now: " + tonerLevel);
    }

    public void printPages(int pages) {
        if (pages < 0) {
            System.out.println("Error: Cannot print a negative number of pages.");
            return;
        }

        if (tonerLevel < pages) {
            System.out.println("Not enough ink to print " + pages + " pages.");
        } else {
            System.out.println("Printing " + pages + " pages...");
            numOfPagesPrinted += pages;
            tonerLevel -= pages;
            System.out.println("Printing job is complete!");
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumOfPagesPrinted() {
        return numOfPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplexPrinter;
    }

    private void setTonerLevel(int tonerLevel) {
        if (tonerLevel < 0 || tonerLevel > 100) {
            System.out.println("Invalid toner level. Setting to 0.");
            this.tonerLevel = 0;
        } else {
            this.tonerLevel = tonerLevel;
        }
    }
}
