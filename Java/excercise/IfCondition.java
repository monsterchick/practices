
public class IfCondition {
    static int ageOfInvestor;
    static String[] investStyle = {"\'low risk\'","\'middle risk\'","\'high risk\'"};

    public static void genInvesStyle(int ageOfInvestor, String[] investStyle){
        String words = "Your investment style may become ";
        if (ageOfInvestor > 0 && ageOfInvestor <= 30){
            System.out.println(words + investStyle[2]);
        } else if (ageOfInvestor > 30 && ageOfInvestor <=60) {
            System.out.println(words + investStyle[1]);
        } else if (ageOfInvestor > 60 && ageOfInvestor <= 100) {
            System.out.println(words + investStyle[0]);
        } else {
            System.out.println("please give me a correct age");
        }
    }

    public static void shortGenInvesStyle(int ageOfInvestor, String[] investStyle){
        String words = "Your investment style may become ";
        if (ageOfInvestor > 0 && ageOfInvestor <= 30){
            System.out.println(words + investStyle[2]);
        } else if (ageOfInvestor > 30 && ageOfInvestor <=60) {
            System.out.println(words + investStyle[1]);
        } else if (ageOfInvestor > 60 && ageOfInvestor <= 100) {
            System.out.println(words + investStyle[0]);
        } else {
            System.out.println("please give me a correct age");
        }
    }

    public static void main(String[] args) {
        ageOfInvestor = 26;
        genInvesStyle(ageOfInvestor, investStyle);
    }
}
