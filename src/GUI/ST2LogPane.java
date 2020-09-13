package GUI;

import java.awt.GridBagLayout;
import java.awt.RenderingHints;
import java.util.HashMap;
import java.util.Map;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextPane;

import sun.swing.SwingUtilities2;

public class ST2LogPane extends JPanel {    
    public ST2LogPane() {
        super(new GridBagLayout());        
        
        GridBagConstraints c = new GridBagConstraints();
        
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.8;
        c.weighty = 0.0;
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 2;
        
        logPane.putClientProperty(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        logPane.putClientProperty(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        logPane.setEditable(false);       
        logPane.setBackground(Color.BLACK);        
        logPane.setForeground(Color.WHITE);
        logPane.setText("Dummy Text");
        logPane.setFont(new Font("Inconsolata LGC", Font.PLAIN, 28));

        this.add(logPane,c);
        
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.15;
        c.weighty = 0.45;
        c.gridx = 1;
        c.gridy = 0;  
        c.gridheight = 1;
        this.add(clearLogButton, c);
        
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 0.15;
        c.weighty = 0.45;
        c.gridx = 1;
        c.gridy = 1;               
        this.add(saveLogButton, c);
    }    
    private JTextPane logPane = new JTextPane();
    private JButton clearLogButton = new JButton("Clear");
    
    private JButton saveLogButton = new JButton("Save");
}
