package bai_tap_them.quan_ly_nhan_su_cong_ty.gui;

import javax.swing.*;

public class AddEngineer extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JPanel addEngineer;
    private JButton addButton;
    private JButton cancelButton;
    private JButton mainMenuButton;

    public AddEngineer() {
        setTitle("Add engineer");
        setContentPane(addEngineer);
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
}

