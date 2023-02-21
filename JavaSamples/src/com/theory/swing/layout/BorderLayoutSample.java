package com.theory.swing.layout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutSample extends JFrame {

    public BorderLayoutSample() {
        super("Border Layout");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        add(new JButton("North"), BorderLayout.NORTH);
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("Center"), BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(final String[] args) {
        new BorderLayoutSample();
    }
}