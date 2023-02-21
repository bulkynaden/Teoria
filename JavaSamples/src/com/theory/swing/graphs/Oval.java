package com.theory.swing.graphs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Oval extends JFrame implements MouseMotionListener {
    private int rectX = 50;
    private int rectY = 50;

    public static void main(String[] args) {
        Oval drawing = new Oval();
        drawing.setVisible(true);
    }

    public Oval() {
        super("Oval Picture");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        addMouseMotionListener(this);
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.drawRect(rectX, rectY, 50, 50);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        rectX = e.getX();
        rectY = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}