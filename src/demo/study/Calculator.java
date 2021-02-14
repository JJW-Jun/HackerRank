package demo.study;


public class Calculator {
    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException("Divider must not be 0");
        }
        return a/b;
    }
}
