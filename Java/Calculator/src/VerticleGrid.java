import javax.swing.*;
import java.awt.*;

public class VerticleGrid {
    JFrame jf = new JFrame();
    JPanel jp = new JPanel();
    JPanel jp1 = new JPanel();
    JPanel jp2 = new JPanel();

    void createFrame() {
        jf.setTitle("test");
        jf.setSize(400, 400);
        jf.setLocationRelativeTo(null);
        jf.setLayout(new GridBagLayout());
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jp.setLayout(new GridBagLayout());
        jp.setBackground(Color.yellow); // Set background color for jp

        GridBagConstraints constraints = new GridBagConstraints();
        GridBagConstraints conTTT = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        conTTT.gridx = 10;
        conTTT.gridy = 10;
        conTTT.gridheight = 4;
        conTTT.gridwidth = 10;
//        jp1.add(tf, conTTT)
        JTextField tf = new JTextField("test");
        tf.setPreferredSize(new Dimension(200,tf.getPreferredSize().height));
        jp1.setBackground(Color.black);
        jp1.add(tf, conTTT);
        jp.add(jp1, constraints);

//        constraints.gridx = 0;
//        constraints.gridy = 1;
//        jp2.setLayout(new GridBagLayout());
//        jp2.setBackground(Color.blue);
//        JButton btn = new JButton("aaaa");
//        JButton btn1 = new JButton("btnnn");
//        JButton btn2 = new JButton("btnnn");
//        JButton btn3 = new JButton("btnnn");
//        JButton btn4 = new JButton("btnnn");
//        JButton btn5 = new JButton("btnnn");
//        JButton btn6 = new JButton("btnnn");
//        jp2.add(btn, constraints);
//        jp2.add(btn1);
//        jp2.add(btn2);
//        jp2.add(btn3);
//        jp2.add(btn4);
//        jp2.add(btn5);
//        jp2.add(btn6);
//        jp.add(jp2, constraints);
//
        jf.add(jp);
    }

    public static void main(String[] args) {
        VerticleGrid demo = new VerticleGrid();
        demo.createFrame();
        demo.jf.setVisible(true);
        demo.jf.pack();
    }
}
