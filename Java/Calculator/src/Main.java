import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    JFrame jFrame = new JFrame(); // 主容器
    JPanel mainPanel = new JPanel(); // 主窗體
    JPanel displayPanel;
    JPanel buttonPanel;
    void createFrame(){
        jFrame.setTitle("Calculator");
        jFrame.setSize(330,330);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new GridBagLayout()); // 採用網格組佈局
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainPanel.setPreferredSize(new Dimension(290, 220));
    }

    void createDisplay(){
        displayPanel = new JPanel(new GridBagLayout());
        GridBagConstraints displayConstraints = new GridBagConstraints();
        JTextField textField = new JTextField("");
        textField.setPreferredSize(new Dimension(295,60));
//        displayPanel.setBackground(new Color(255,192,203));
        displayPanel.add(textField, displayConstraints);
        mainPanel.add(displayPanel);
    }

    void createButton(){
        buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints buttonConstraints = new GridBagConstraints();
        List<String> buttonList = new ArrayList<>(Arrays.asList("AC", "+/-", "%", "➗", "7", "8", "9", "✖", "4","5","6", "➖", "1", "2", "3", "➕","0", ".", "🟰"));
        int numRows = 8;    // y
        int numCols = 4;    // x
        int buttonIndex = 0;    // 按鈕指標
        int buttonSize = buttonList.size();     // 按鈕的數量：由1開始
        int maxButtonsPerRow = 4;   // 每行最多的按鈕數量

        // 添加按钮
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numCols; col++) {
                if (buttonIndex < buttonSize) {
                    String buttonName = buttonList.get(buttonIndex);
                    JButton button = new JButton(buttonName);
                    int x = (buttonIndex % maxButtonsPerRow) + 1;
                    int y = (buttonIndex / maxButtonsPerRow) + 1;

                    if (x == 1 && y == 5){
                        buttonConstraints.gridwidth = 2;
                        buttonConstraints.fill = GridBagConstraints.BOTH;
                    } else if (x == 2 && y == 5) {
                        x = 3;
                        buttonConstraints.gridwidth = 1;
                        System.out.println(buttonName);

                    } else if (x == 3 && y == 5) {
                        x = 4;
                        buttonConstraints.gridwidth = 1;
                        System.out.println(buttonName);
                    }

                    buttonConstraints.gridx = x;    // return 0 1 2 3 0 1 2 3 0 1 2 3...
                    buttonConstraints.gridy = y;    // return 1111 2222 3333 4444 5555
                    buttonPanel.add(button, buttonConstraints);
                    mainPanel.add(buttonPanel);
                    System.out.println("(" + x + "," + y + ")");
                    buttonIndex++;
                }
            }
        }
    GridBagConstraints constraints = new GridBagConstraints();
//    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
//    mainPanel.setBackground(new Color(255,192,203));

    jFrame.add(mainPanel);
    }
    public static void main(String[] args) {
        Main demo = new Main();
        demo.createFrame();
        demo.createDisplay();
        demo.createButton();
//        demo.jFrame.pack();
        demo.jFrame.setVisible(true);
    }
}