public class Main {
    public static void main(String[] args) {
        int maxTerms = 1000;
        double piComputed = computePI(maxTerms);
        double percentageOfPI = (piComputed / Math.PI) * 100;

        System.out.println("Computed PI: " + piComputed);
        System.out.println("Actual PI: " + Math.PI);
        System.out.println("Percentage of PI: " + percentageOfPI + "%");
    }

    static double computePI(int maxTerms) {
        double sum = 0.0;
        for (int i = 0; i < maxTerms; i++) {
            double term = 1.0 / (2 * i + 1);
            if (i % 2 == 0) {
                sum += term;
            } else {
                sum -= term;
            }
        }
        return 4 * sum;
    }
}
