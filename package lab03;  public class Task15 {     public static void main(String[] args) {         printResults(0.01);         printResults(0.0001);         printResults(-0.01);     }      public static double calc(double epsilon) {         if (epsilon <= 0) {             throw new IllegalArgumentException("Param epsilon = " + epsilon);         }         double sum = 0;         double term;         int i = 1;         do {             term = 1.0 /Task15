package lab03;

public class Task15 {
    public static void main(String[] args) {
        printResults(0.01);
        printResults(0.0001);
        printResults(-0.01);
    }

    public static double calc(double epsilon) {
        if (epsilon <= 0) {
            throw new IllegalArgumentException("Param epsilon = " + epsilon);
        }
        double sum = 0;
        double term;
        int i = 1;
        do {
            term = 1.0 / (i * i);
            if (Math.abs(term) >= epsilon) {
                sum += term;
            }
            i++;
        } while (Math.abs(term) >= epsilon);
        return sum;
    }

    static void printResults(double epsilon) {
        System.out.print("epsilon:" + epsilon + " result:");
        try {
            System.out.println(calc(epsilon));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
