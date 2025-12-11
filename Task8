package lab03;

public class Task8 {
    public static void main(String[] args) {
        printResults(2.0);
        printResults(0.0);
        printResults(-5.0);
        printResults(100.0);
    }

    public static double calc(double x) {
        if (Double.isNaN(x)) {
            throw new IllegalArgumentException("Param x is NaN");
        }
        if (x > 10) {
            return x * x;
        } else if (x >= 0 && x <= 10) {
            return x * 2;
        } else {
            return -x;
        }
    }

    static void printResults(double x) {
        System.out.print("x:" + x + " result:");
        try {
            System.out.println(calc(x));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
