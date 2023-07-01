// keyword static means that the particular member belongs to a type itself
// keyword void is to specify that the method does not return any type
// keyword which declares a member's access as public
// keyword which declares a member's access as private
// HashMap stores items in "key/value" pairs
// keyword final is useful when you want a variable to always store the same value(3.14159...)


public class Variable {
    static int myNum;
    static String myStr;

    // define a method to get datatype of variable
    public static String getType(Object o) {
        return o.getClass().getName();
    }

    public static void main(String[] args) {
        myNum = 5;
        myStr = "I am text";
        System.out.println("myNum: " + getType(myNum));
        System.out.println("myStr: " + getType(myStr));
    }
}
