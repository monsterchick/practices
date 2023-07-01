import java.util.ArrayList;

public class EscapeSequences {

    public static void main(String[] args) {
        ArrayList<String> escapers = new ArrayList<String>();
        escapers.add("\n");  // New Line
        escapers.add("\r");  // Carriage Return
        escapers.add("\t");  // Tab
        escapers.add("\b");  // Backspace
        escapers.add("\f");  // Form Feed
//        System.out.println(escapers);
        for(int i=0;i<escapers.size();i++){
            System.out.println("I am   ".concat(escapers.get(i)).concat("the best!"));
            System.out.println("=====================");

        }
    }
}
