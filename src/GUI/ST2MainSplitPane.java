package GUI;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.Color;

public class ST2MainSplitPane extends JSplitPane {
    public ST2MainSplitPane() {        
        leftFrame.setBackground(new Color(0.5f, 0.15f, 0.0f));
        this.setLeftComponent(leftFrame);        
        this.setRightComponent(rightFrame);
        setContinuousLayout(true);
        this.setVisible(true);        
        ST2ScreenDims sD = new ST2ScreenDims();
       this.setDividerLocation(sD.initWindowWidth / 6);
    }

    private JPanel leftFrame = new JPanel();
    private ST2LogSplitPane rightFrame = new ST2LogSplitPane();    
}
