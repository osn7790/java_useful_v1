package _my_test.swing;

import javax.swing.*;

public class SwingExample extends JFrame {

    private JButton button;
    private JLabel label;
    private JTextField textField;
    private JPasswordField passwordField;
    private JCheckBox checkBox;

    public SwingExample() {

    }

    private void initData() {
        setTitle("컴포넌트 확인");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        button = new JButton("JButton");
        label = new JLabel("글자를 띄우는 컴포넌트");
        textField = new JTextField("아이디입력하세요", 30);
        passwordField = new JPasswordField("비밀번호를 입력하세요", 40);

    }

    private void setInitLayout() {

    }

    public static void main(String[] args) {
        SwingExample swing = new SwingExample();

    }



}
