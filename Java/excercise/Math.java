public class Math {
    static int num1;
    static int num2;

    public static int addNum(int num1, int num2){
        return num1 + num2;
    }

    public static int maxNum(int num1, int num2){
        return java.lang.Math.max(num1, num2);
    }
    public static int minNum(int num1, int num2){
        return java.lang.Math.min(num1,num2);
    }

    public static int absNum(int num){
        return java.lang.Math.abs(num);
    }

    public static double generateRandomNum(){
        int randomNum = (int)(java.lang.Math.random() * 101);  // 0 - 100
        return randomNum;
    }
    public static void PrintSomething(int num1, int num2){
        System.out.println(num1 + " + " + num2 + " = " + addNum(num1,num2));
        System.out.println("The max num between " + num1 + " and " + num2 + " is " + maxNum(num1,num2));
        System.out.println("The min num between " + num1 + " and " + num2 + " is " + minNum(num1,num2));
        System.out.println("The absolute positive value of " + num1 + " is " + absNum(num1));
        System.out.println("The random number is " + generateRandomNum());

        System.out.println("");
    }

    public static void main(String[] args) {

        PrintSomething(1,98);
        PrintSomething(-2,43);
        PrintSomething(-999,1000);
        PrintSomething(-115964,999888);
        PrintSomething(666,666);
    }
}
