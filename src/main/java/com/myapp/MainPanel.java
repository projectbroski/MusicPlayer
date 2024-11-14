package com.myapp;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.net.MalformedURLException;

public class MainPanel extends JPanel {

    public MainPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.decode("#101010"));
        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        //add(new JLabel("MAIN AREA VIEW SIDE"));
        //add(notes_container());
        NotesContainer nc = new NotesContainer();
        //nc.setPreferredSize(new Dimension(350,Integer.MAX_VALUE));

        add(nc, BorderLayout.CENTER);
    }


    private JPanel discover_container(){
        JPanel dcontainer=new JPanel();
        dcontainer.setBackground(Color.decode("#101010"));
        dcontainer.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        dcontainer.setLayout(new BorderLayout());
        // dcontainer.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel heading=new JLabel("Discover");
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Arial",Font.BOLD,24));

        JPanel fcontainer= new JPanel();
        fcontainer.setBackground(Color.decode("#202020"));
        fcontainer.setBorder(BorderFactory.createEmptyBorder(40,10,10,10));
        fcontainer.setLayout(new BorderLayout());

        dcontainer.add(heading, BorderLayout.NORTH);
        dcontainer.add(fcontainer);

        return dcontainer;
    }

    private JLabel createLabel(String text){
        JLabel title=new JLabel(text);
        title.setForeground(Color.decode("#FFFFFF"));
        title.setFont(new Font("Arial",Font.PLAIN,14));

        return title;
    }
}
