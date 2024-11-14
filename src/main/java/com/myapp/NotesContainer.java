package com.myapp;

import javax.swing.*;
import java.awt.*;
//import com.myapp.NoterList.noterList;

public class NotesContainer extends JPanel {



    public NotesContainer(){
        setLayout(new BorderLayout());
        setBackground(Color.decode("#444444"));

        NoterList noterList = new NoterList();
        noterList.setPreferredSize(new Dimension(350, getHeight()));

        JPanel mainNote = mainNote();

        add(noterList,BorderLayout.WEST);
        add(mainNote(),BorderLayout.CENTER);
    }


    // private JPanel noterList(){
    //     JPanel nList= new JPanel();
    //     nList.setBackground(Color.decode("#101010"));
    //     nList.setLayout(new BoxLayout(nList,BoxLayout.Y_AXIS));
    //     nList.setPreferredSize(new Dimension(350,Integer.MAX_VALUE));

    //     JLabel label1 = new JLabel("My Notes");
    //     label1.setForeground(Color.decode("#d3d3d3"));
    //     label1.setBorder(BorderFactory.createEmptyBorder(10, 0, 20, 10));
    //     nList.add(label1);

    //     return nList;
    // }

    public JPanel mainNote(){
        JPanel mNote = new JPanel();
        mNote.setBackground(Color.decode("#000000"));
        //mNote.setLayout(new BorderLayout());

        JLabel mainLabel = new JLabel("Main Note Area", JLabel.CENTER);
        mainLabel.setForeground(Color.WHITE);
        mNote.add(mainLabel, BorderLayout.CENTER);
        //mNote.setPreferredSize(new Dimension(450, 300)); 

        return mNote;
    }
}