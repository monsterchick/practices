import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    JFrame jf = new JFrame(); // 主容器
    Container mainContainer; // 主窗體
    void createFrame(){
        jf.setTitle("Calculator");
        jf.setSize(330,380);
        jf.setLocationRelativeTo(null);
        jf.getContentPane();
        jf.setLayout(new GridBagLayout()); // 採用網格組佈局
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    void init(){
        GridBagConstraints displayConstraint = new GridBagConstraints();
        GridBagConstraints buttonsConstraints = new GridBagConstraints();
        List<String> buttonList = new ArrayList<>(Arrays.asList("AC", "+/-", "%", "➗", "7", "8", "9", "✖", "4","5","6", "➖", "1", "2", "3", "➕","0", ".", "🟰"));
        int numRows = 5;    // y
        int numCols = 4;    // x
        int buttonIndex = 0;    // 按鈕指標
        int buttonSize = buttonList.size();     // 按鈕的數量：由1開始
        int maxButtonsPerRow = 4;   // 每行最多的按鈕數量

        JTextField display;

        // 添加顯示組件
        displayConstraint.gridx = 0;
        displayConstraint.gridy = 0;
        displayConstraint.gridwidth = 4;
        displayConstraint.ipadx = 10;
        displayConstraint.ipady = 2;
        display = new JTextField("");
        display.setEnabled(true);
        mainContainer.add(display, BorderLayout.NORTH);

        // 添加按钮
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numCols; col++) {
                if (buttonIndex < buttonSize) {
                    String buttonName = buttonList.get(buttonIndex);
                    JButton button = new JButton(buttonName);
                    int x = (buttonIndex % maxButtonsPerRow) + 1;
                    int y = (buttonIndex / maxButtonsPerRow) + 1;

                    if (x == 1 && y == 5){
                        buttonsConstraints.gridwidth = 2;
                        buttonsConstraints.fill = GridBagConstraints.BOTH;
                    } else if (x == 2 && y == 5) {
                        x = 3;
                        buttonsConstraints.gridwidth = 1;
                        System.out.println(buttonName);

                    } else if (x == 3 && y == 5) {
                        x = 4;
                        buttonsConstraints.gridwidth = 1;
                        System.out.println(buttonName);
                    }

                    buttonsConstraints.gridx = x;    // return 0 1 2 3 0 1 2 3 0 1 2 3...
                    buttonsConstraints.gridy = y;    // return 1111 2222 3333 4444 5555
                    mainContainer.add(button, buttonsConstraints);
                    System.out.println("(" + x + "," + y + ")");
                    buttonIndex++;
                }
            }
        }
    }
    public static void main(String[] args) {
        Main demo = new Main();
        demo.createFrame();
        demo.init();
        demo.jf.setVisible(true);
    }
}