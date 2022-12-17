package com.theory.swing;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutSample extends JFrame {

    public FlowLayoutSample() {
        super("Flow Layout Example");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        add(new JButton("First"));
        add(new JButton("Second"));
        add(new JTextField("Enter your text here"));
        add(new JLabel("This is a long label"));
        add(new JButton("Third"));

        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        setVisible(true);
    }

    public static void main(final String[] args) {
        new FlowLayoutSample();
    }
}