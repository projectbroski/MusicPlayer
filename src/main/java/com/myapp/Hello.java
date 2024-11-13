package com.myapp;

import javax.swing.*;
import java.awt.*;

public class Hello {
    
    private JFrame frame;

    public Hello() {
        initializeFrame();
    }

    private void initializeFrame() {
        frame = new JFrame("My Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout());

        frame.add(new SidePanel(), BorderLayout.WEST);
        frame.add(new MainPanel(), BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Hello::new);
    }
}
