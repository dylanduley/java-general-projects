import java.util.Scanner;

class SubsequenceChecker {
    private Scanner scanner;

    public SubsequenceChecker(Scanner scanner) {
        this.scanner = scanner;
    }

    public void check() {
        System.out.print("Enter size of main array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements of main array:");
        for (int i = 0; i < n; i++) array[i] = scanner.nextInt();

        System.out.print("Enter size of subsequence: ");
        int m = scanner.nextInt();
        int[] sequence = new int[m];
        System.out.println("Enter elements of subsequence:");
        for (int i = 0; i < m; i++) sequence[i] = scanner.nextInt();

        boolean result = isValidSubsequence(array, sequence);
        System.out.println("Is valid subsequence: " + result);
    }

    private boolean isValidSubsequence(int[] array, int[] sequence) {
        int arrIdx = 0, seqIdx = 0;
        while (arrIdx < array.length && seqIdx < sequence.length) {
            if (array[arrIdx] == sequence[seqIdx]) seqIdx++;
            arrIdx++;
        }
        return seqIdx == sequence.length;
    }
}