package lab03;

public class Task1 {
    public static void main(String[] args) {
        printResults(5);
        printResults(10);
        printResults(0);
        printResults(-5);
    }

    public static double calc(int k) {
        if (k < 0) {
            throw new IllegalArgumentException("Param k = " + k);
        }
        double sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    static void printResults(int k) {
        System.out.print("k:" + k + " result:");
        try {
            System.out.println(calc(k));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
