public class Calculator {

    public static void main(String[] args) {
        double result = calculateSquareRoot(25);
        System.out.println("Square root: " + result);
    }

    private static double calculateSquareRoot(double number) {
        double approximation = number / 2;
        double tolerance = 0.0001;

        while (Math.abs(approximation - (number / approximation)) > tolerance) {
            approximation = 0.5 * (approximation + (number / approximation));
        }
        return approximation;
    }
}
