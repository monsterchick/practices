import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // JFrame 表示一個窗口
        JFrame frame = new JFrame();
        // 設置標題
        frame.setTitle("Calculator");
        // 關閉窗口時， 退出程式
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 設置窗口大小
        frame.setSize(400, 300);

        // 創建一個容器， 設置為根容器
        JPanel root = new JPanel();
        frame.setContentPane(root);

        // 添加一個控件
        JButton btnTest = new JButton("test");
        root.add(btnTest);

        // 添加一個控件
        JButton btnTest2 = new JButton("test");
        root.add(btnTest2);

        // 添加一個控件
        JButton btnTest1 = new JButton("test");
        root.add(btnTest1);

        JLabel lblTest = new JLabel("I am Label");
        root.add(lblTest);

        // 顯示窗口
        frame.setVisible(true);
    }
}