package example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Calculator calculator = new Calculator();
        System.out.println("Test");
        System.out.println("add = " + calculator.add(3, 5));
        System.out.println("minus = " + calculator.minus(8, 2));
        System.out.println("multiply = " + calculator.multiply(3, 5));
        System.out.println("divide = " + calculator.divide(6, 3));

    }
}
