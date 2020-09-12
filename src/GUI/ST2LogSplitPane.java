package GUI;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.Color;

public class ST2LogSplitPane extends JSplitPane {
    public ST2LogSplitPane() {
        super(JSplitPane.VERTICAL_SPLIT);
        topFrame = new JPanel();
        topFrame.setBackground(new Color(0.0f, 0.33f, 0.0f));
        this.setTopComponent(topFrame);
        bottomFrame = new JPanel();
        bottomFrame.setBackground(new Color(0.0f, 0.15f, 0.5f));
        this.setBottomComponent(bottomFrame);
        //this.setDividerLocation(this.getSize().height * 4 / 5);
    }
        private JPanel topFrame;
        private JPanel bottomFrame;
}
