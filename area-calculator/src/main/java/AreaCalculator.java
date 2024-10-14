import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the circle radius
        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();

        // Get user input for the rectangle dimensions
        System.out.print("Enter the length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();

        // Calculate areas
        double circleArea = calculateCircleArea(circleRadius);
        double rectangleArea = calculateRectangleArea(rectangleLength, rectangleWidth);

        // Display results
        System.out.printf("Area of the circle (radius %.2f): %.2f%n", circleRadius, circleArea);
        System.out.printf("Area of the rectangle (length %.2f, width %.2f): %.2f%n", rectangleLength, rectangleWidth, rectangleArea);

        // Close the scanner
        scanner.close();
    }

    public static double calculateCircleArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        return Math.PI * radius * radius;
    }

    public static double calculateRectangleArea(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width cannot be negative.");
        }
        return length * width;
    }
}
