package com.myapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuLabel extends JLabel {
    
    public MenuLabel(String text) {
        super(text, SwingConstants.CENTER);
        setOpaque(true);
        setBackground(Color.decode("#000000"));
        setForeground("Discover".equals(text) ? Color.decode("#FFFFFF") : Color.decode("#666666"));
        setFont(new Font("Arial", Font.BOLD, 12));
        setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
        //setAlignmentX(Component.CENTER_ALIGNMENT);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(Color.decode("#333333"));
                setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(Color.decode("#000000"));
                setForeground("Discover".equals(text) ? Color.decode("#FFFFFF") : Color.decode("#666666"));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, text + " clicked!");
            }
        });
    }
}
