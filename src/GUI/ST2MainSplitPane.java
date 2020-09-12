package GUI;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.Color;

public class ST2MainSplitPane extends JSplitPane {
    public ST2MainSplitPane() {
        leftFrame = new JPanel();
        leftFrame.setBackground(new Color(0.5f, 0.15f, 0.0f));
        this.setLeftComponent(leftFrame);
        rightFrame = new ST2LogSplitPane();
        this.setRightComponent(rightFrame);
        this.setVisible(true);        
        //this.setDividerLocation(* 5 / 6);
    }

    private JPanel leftFrame;
    private ST2LogSplitPane rightFrame;    
}
