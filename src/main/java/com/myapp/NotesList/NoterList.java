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

        add(allnotes("My first note","Sub lorem ipsum got to say something"));
    }

    private JPanel allnotes(String title,String subtitle){
        JPanel noteCard = new JPanel();
        noteCard.setLayout(new BoxLayout(noteCard,250));
        noteCard.setBackground(Color.decode("#444444"));

        JLabel heading = new JLabel(title);
        heading.setForeground(Color.WHITE);

        JLabel subheading = new JLabel(subtitle);
        subheading.setForeground(Color.WHITE);

        noteCard.add(heading);
        noteCard.add(subheading);

        return noteCard;
    }

}