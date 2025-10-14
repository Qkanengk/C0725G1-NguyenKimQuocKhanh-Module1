package bai_tap_them.quan_ly_nhan_su_cong_ty.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseEmployee extends JFrame {
    private JButton addEngineerButton;
    private JButton addOfficerButton;
    private JButton addSalerButton;
    private JButton mainMenuButton;
    private JPanel chooseEmployeePanel;

    public ChooseEmployee() {
        setTitle("Choose employee");
        setContentPane(chooseEmployeePanel);
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        addEngineerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddEngineer addEngineer = new AddEngineer();
                dispose();
            }
        });
    }
}
