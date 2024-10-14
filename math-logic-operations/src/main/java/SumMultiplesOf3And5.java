class SumMultiplesOf3And5 {
    public void calculate() {
        int sum = 0, count = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum += i;
                if (++count == 5) break;
            }
        }
        System.out.println("Sum: " + sum);
    }
}