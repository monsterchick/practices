import javax.swing.*;
import java.awt.*;

public class Test{
    JFrame jf = new JFrame();

    void createFrame(){
        jf.setTitle("test");
        jf.setSize(400,400);
        jf.getContentPane();
        jf.setLocationRelativeTo(null);
        jf.setLayout(new GridBagLayout());
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    void startDemo(){
        Test demo = new Test();
        demo.createFrame();
        demo.jf.setVisible(true);
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.startDemo();
    }
}