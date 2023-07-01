
public class Casting {
    public static void main(String[] args) {
        // Widening Casting 放大
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        // Narrowing Casting 縮小
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble; // Manual casting: double to int
        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9
    }
}