package es.dim45.tests;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class WindowBasicSample extends JFrame {

    public WindowBasicSample() {
        super("My First Swing App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
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