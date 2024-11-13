import javax.swing.*;
import java.awt.*;

public class Hello{
    
        private static final Color SIDE_PANEL_COLOR=Color.decode("#000000");
        private static final Color BUTTON_COLOR=Color.GRAY;
        private static final Color BUTTON_TEXT_COLOR=Color.decode("#FFFFFF");
        private static final Font BUTTON_TEXT_FONT=new Font("Arial",Font.BOLD,16);
        private static Dimension SIDE_PANEL_SIZE= new Dimension(250,300);

        private JFrame frame;
        private JButton jbtn;

        
        public Hello(){
            initializeFrame();
        }

        
        private void initializeFrame(){
            frame = new JFrame("My Application");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setSize(500,300);
            frame.setLayout(new BorderLayout());

            frame.add(createSidePanel(), BorderLayout.WEST);
            frame.add(createMainPanel(), BorderLayout.CENTER);
            frame.setVisible(true);
        }


        private JPanel createSidePanel(){
            JPanel jpanel=new JPanel();

            jpanel.setBackground(SIDE_PANEL_COLOR);
            jpanel.setPreferredSize(SIDE_PANEL_SIZE);
            jpanel.setLayout(new BorderLayout());

            JLabel heading=new JLabel("Logo");
            heading.setForeground(Color.decode("#FFFFFF"));
            heading.setFont(BUTTON_TEXT_FONT);
            heading.setBorder(BorderFactory.createEmptyBorder(20,20,10,20));

            jpanel.add(heading,BorderLayout.NORTH);
            jpanel.add(createContainer());

            return jpanel;
        }

        private JPanel createContainer(){
            JPanel container=new JPanel();

            container.setBackground(Color.decode("#000000"));
            container.setPreferredSize(new Dimension(150,100));
            container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
            container.setBorder(BorderFactory.createEmptyBorder(40,10,10,0));

            container.add(entryMenu("Discover"));
            container.add(entryMenu("Downloads"));
            container.add(entryMenu("Settings"));

            return container;
        }

        private JLabel entryMenu(String text){
            JLabel entryLabel = new JLabel(text, SwingConstants.CENTER);
            entryLabel.setOpaque(true);
            entryLabel.setBackground(Color.decode("#000000"));
            if ("Discover".equals(text)) { 
                entryLabel.setForeground(Color.decode("#FFFFFF"));
            }else{
                entryLabel.setForeground(Color.decode("#666666"));
            }
            entryLabel.setFont(new Font("Arial", Font.BOLD, 12));
            //entryLabel.setBorder(BorderFactory.createEmptyBorder(40,10,20,0));
            //entryLabel.setHorizontalAlignment(SwingConstants.CENTER);  // Center the text horizontally
            //entryLabel.setVerticalAlignment(SwingConstants.CENTER); 

            entryLabel.setBorder(BorderFactory.createEmptyBorder(15,10,15,10));
            return entryLabel;
        }

        private JButton createButton(String text){
            jbtn=new JButton(text);

            jbtn.setBackground(BUTTON_COLOR);
            jbtn.setForeground(BUTTON_TEXT_COLOR);
            jbtn.setFont(BUTTON_TEXT_FONT);
            jbtn.setFocusPainted(false);

            return jbtn;
        }

        private JPanel createMainPanel(){
            JPanel mainContent=new JPanel();
            
            mainContent.setBackground(Color.decode("#101010"));
            mainContent.add(new JLabel("MAIN AREA VIEW"));

            return mainContent;
        }


        public static void main(String args[]){
            SwingUtilities.invokeLater(Hello::new);
        }

    
}