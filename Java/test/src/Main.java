public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(5.0);
        System.out.println("Result: " + calculator.getResult());

        calculator.subtract(2.5);
        System.out.println("Result: " + calculator.getResult());

        calculator.multiply(3.0);
        System.out.println("Result: " + calculator.getResult());

        calculator.divide(4.0);
        System.out.println("Result: " + calculator.getResult());

        calculator.clear();
        System.out.println("Result: " + calculator.getResult());
    }
}
