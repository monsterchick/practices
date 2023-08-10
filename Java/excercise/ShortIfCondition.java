// short hand of If...Else
// variable = (condition) ? expressionTrue :  expressionFalse;

public class ShortIfCondition {
    static String result;
    public static void printThing(int num){
        String result = (num < 0) ? "Negative" :(num == 0) ? "Zero" : "Positive";
        System.out.println("The number is " + result);
    }
    public static void main(String[] args) {
        printThing(-12);
        printThing(84);
        printThing(-1);
        printThing(53);
        printThing(0);
    }
}
