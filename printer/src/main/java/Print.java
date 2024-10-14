public class Print {
    public static void main(String[] args) {
        Printer inkjetPrinter = new Printer(50, true);

        // Fill up toner to 100%
        inkjetPrinter.fillUpToner(50);  // Filling up with 50, total should now be 100
        System.out.println("Toner Level: " + inkjetPrinter.getTonerLevel());

        // Check if printer is duplex
        System.out.println("Is Duplex: " + inkjetPrinter.isDuplex());

        // Print pages
        inkjetPrinter.printPages(10); // Print 10 pages
        System.out.println("Total pages printed: " + inkjetPrinter.getNumOfPagesPrinted());

        // Attempt to print more pages than the toner allows
        inkjetPrinter.printPages(200); // Attempt to print more pages than toner level
        System.out.println("Total pages printed after attempting to print 200: " + inkjetPrinter.getNumOfPagesPrinted());
    }
}
