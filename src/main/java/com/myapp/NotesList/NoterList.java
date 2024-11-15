package com.myapp;

import javax.swing.*;
import java.awt.*;

public class NoterList extends JPanel{
    public NoterList(){
        setBackground(Color.decode("#101010"));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel label1 = new JLabel("My Notes");
        label1.setForeground(Color.WHITE);
        
        // Set left padding (20px) for the label
        label1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        add(label1);
        add(Box.createRigidArea(new Dimension(0, 10)));

        add(allnotes("My first note","Sub lorem ipsum got to say something in an easy way to display some text"));
        add(allnotes("Some other note","Sub lorem ipsum got to say something"));
        add(allnotes("Something on my mind","Sub lorem ipsum got to say something"));
    }

    private JPanel allnotes(String title,String subtitle){
        JPanel noteCard = new JPanel();
        noteCard.setLayout(new BoxLayout(noteCard,BoxLayout.Y_AXIS));

        noteCard.setMaximumSize(new Dimension(Integer.MAX_VALUE, 80));
        noteCard.setPreferredSize(new Dimension(Integer.MAX_VALUE, 80));

        noteCard.setBorder(BorderFactory.createEmptyBorder(20, 20, 30, 20));

        noteCard.setBackground(Color.decode("#101010"));

        JLabel heading = new JLabel(title);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Arial",Font.BOLD,14));

        JLabel subheading = new JLabel("<html><body style='width:300px'>" + subtitle + "</body></html>");
        subheading.setForeground(Color.WHITE);
        subheading.setFont(new Font("Arial",Font.PLAIN,12));


        noteCard.add(heading);
        noteCard.add(Box.createRigidArea(new Dimension(0, 5)));
        noteCard.add(subheading);

        return noteCard;
    }

}