import javax.swing.*;
import java.awt.*;

public class Main {
    JFrame jframe = new JFrame(); // 主容器
    Container mainContainer; // 主窗體
    void createFrame(){
        jframe.setTitle("Calculator");
        jframe.setSize(330,380);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        mainContainer = jframe.getContentPane();
        mainContainer.setLayout(new GridBagLayout());
    }

    void init(){
        GridBagConstraints textField = new GridBagConstraints();
        mainContainer.add(new JTextField(), textField);
//        mainContainer.add(new JButton("btn1"),gdShow);

    }
    public static void main(String[] args) {
        Main demo = new Main();
        demo.createFrame();
        demo.init();
        demo.jframe.setVisible(true);
    }
}