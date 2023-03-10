package com.theory.swing;

import javax.swing.*;
import java.awt.*;

public class WindowBasicSample extends JFrame {

    public WindowBasicSample() {
        super("Hello App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);

        JLabel nameLabel = new JLabel();
        nameLabel.setText("Your Name");
        nameLabel.setBounds(40, 20, 100, 30);
        add(nameLabel);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(160, 20, 100, 30);
        add(nameTextField);

        JPanel greenPanel = new JPanel();
        greenPanel.setBounds(40, 150, 220, 70);
        greenPanel.setLayout(new java.awt.BorderLayout());
        greenPanel.setBackground(Color.GREEN);
        add(greenPanel);

        JLabel helloLabel = new JLabel("Hola");
        helloLabel.setBounds(50, 20, 100, 30);
        helloLabel.setHorizontalAlignment(SwingConstants.CENTER);
        helloLabel.setVerticalAlignment(SwingConstants.CENTER);

        Font font = new Font("Courier", Font.BOLD, 12);
        helloLabel.setFont(font);
        helloLabel.setFont(helloLabel.getFont().deriveFont(16f));

        greenPanel.add(helloLabel); // adding label to the panel

        JButton acceptButton = new JButton("Accept");
        acceptButton.setBounds(100, 70, 100, 30);
        add(acceptButton);

        acceptButton.addActionListener(e -> {
            String helloText = "Hola";
            String name = nameTextField.getText();
            if (name != null && name.trim().length() > 0) {
                helloText += String.format(", %s", name);
            }
            helloLabel.setText(helloText);
        });
    }


    public static void main(String[] args) throws Exception {
        Runnable initFrame = new Runnable() {
            @Override
            public void run() {
                new WindowBasicSample();
            }
        };

        SwingUtilities.invokeAndWait(initFrame);
    }
}