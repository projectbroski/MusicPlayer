package com.myapp;

import javax.swing.*;
import java.awt.*;

public class SidePanel extends JPanel {
    
    public SidePanel() {
        setBackground(Color.decode("#000000"));
        setPreferredSize(new Dimension(250, 300));
        setLayout(new BorderLayout());

        JLabel heading = new JLabel("Logo");
        heading.setForeground(Color.decode("#FFFFFF"));
        heading.setFont(new Font("Arial", Font.BOLD, 16));
        heading.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));
        add(heading, BorderLayout.NORTH);

        add(createContainer(), BorderLayout.CENTER);
    }

    private JPanel createContainer() {
        JPanel container = new JPanel();
        container.setBackground(Color.decode("#000000"));
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.setBorder(BorderFactory.createEmptyBorder(40, 10, 10, 10));

        container.add(new MenuLabel("Discover"));
        container.add(new MenuLabel("Downloads"));
        container.add(new MenuLabel("Settings"));

        return container;
    }
}
