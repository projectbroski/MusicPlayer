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

    public JPanel mainNote(){
        JPanel mNote = new JPanel();
        mNote.setBackground(Color.decode("#000000"));
        mNote.setLayout(new BorderLayout());
        //mNote.setPreferredSize(new Dimension(450, 300)); 

         JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setForeground(Color.WHITE);
        textArea.setBackground(Color.decode("#222222"));
        textArea.setLineWrap(true); // Enable word wrapping
        textArea.setWrapStyleWord(true); // Wrap at word boundaries
        textArea.setFocusable(true);

        textArea.setCaretColor(Color.WHITE);
        textArea.setCaretPosition(0);

        // Title at the top of the text editor
        
        // Add the JTextArea to a JScrollPane for scrollable support
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(40, 20, 10, 20));
        scrollPane.setBackground(Color.decode("#202020")); // Match JTextArea background
        //scrollPane.setViewportBorder(null); 
        //scrollable.setPreferredSize(new Dimension(Integer.MAX_VALUE,Integer.MAX_VALUE));

        mNote.add(scrollPane, BorderLayout.CENTER);

        SwingUtilities.invokeLater(() -> textArea.requestFocusInWindow());

        return mNote;
    }
}