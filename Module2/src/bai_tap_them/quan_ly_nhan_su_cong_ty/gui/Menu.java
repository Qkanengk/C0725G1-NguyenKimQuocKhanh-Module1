package bai_tap_them.quan_ly_nhan_su_cong_ty.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JButton addEmployeeButton;
    private JButton displayListEmployeeButton;
    private JButton removeEmployeeByIdButton;
    private JButton findEmployeeByNameButton;
    private JPanel mainMenuPanel;

    public Menu() {
        setTitle("Employee Management");
        setContentPane(mainMenuPanel);
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        addEmployeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ChooseEmployee chooseEmployee = new ChooseEmployee();
                dispose();
            }
        });
    }
}
