public class Main {
    public static void main(String[] args) {
        GCDCalculator gcd = (a, b) -> {
            while (b != 0) {
                int oldB = b;
                b = a % b;
                a = oldB;
            }
            return a;
        };
        System.out.println(gcd.gcd(25, 20));
    }

    @FunctionalInterface
    public interface GCDCalculator {
        int gcd(int a, int b);

    }
}