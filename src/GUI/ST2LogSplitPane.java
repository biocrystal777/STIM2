package GUI;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.Color;

public class ST2LogSplitPane extends JSplitPane {
    public ST2LogSplitPane() {
        super(JSplitPane.VERTICAL_SPLIT);        
        this.setTopComponent(topFrame);         
        setContinuousLayout(true);
        this.setBottomComponent(bottomFrame);        
        ST2ScreenDims sD = new ST2ScreenDims();
        this.setDividerLocation(sD.initWindowHeight * 4 / 5);
    }
        private JPanel topFrame = new ST2MapMainPanel();
        private JPanel bottomFrame = new ST2LogPane();
}
