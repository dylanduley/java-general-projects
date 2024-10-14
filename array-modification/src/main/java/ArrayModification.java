import java.util.Arrays;
import java.util.Scanner;

public class ArrayModification {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Read the array from the user
        System.out.println("Enter the number of integers that will make up the array: ");
        int count = input.nextInt();
        int[] array = readIntegers(count);

        // Display the original array
        System.out.println("The array contains: " + Arrays.toString(array));

        // Find and display the minimum value
        int minimumValueOfArray = findMin(array);
        System.out.println("Minimum value of the array is " + minimumValueOfArray);

        // Sort the array in descending order and display it
        int[] sortedArray = sortArrayDescendingOrder(array);
        System.out.println("Sorted array in descending order: " + Arrays.toString(sortedArray));

        // Reverse the array and display it
        int[] reversedArray = reverseArray(array);
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter " + count + " numbers for the array:");
        for (int i = 0; i < count; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int minimum = array[0];
        for (int number : array) {
            if (minimum > number) {
                minimum = number;
            }
        }
        return minimum;
    }

    public static int[] sortArrayDescendingOrder(int[] array) {
        // Create a copy of the original array to sort
        int[] sortedArray = array.clone();
        int temp;
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[j] > sortedArray[i]) {
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[i];
                    sortedArray[i] = temp;
                }
            }
        }
        return sortedArray;
    }

    public static int[] reverseArray(int[] array) {
        // Create a new array for the reversed version
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            // Fill the new array with reversed values
            reversedArray[i] = array[maxIndex - i];
        }
        return reversedArray;
    }
}
