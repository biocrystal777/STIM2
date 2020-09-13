package GUI;

import java.awt.Color;

//import java.awt.LayoutManager;

import javax.swing.JPanel;

public class ST2MapMainPanel extends JPanel {
    
    public ST2MapMainPanel() {        
        this.setBackground(new Color(0.0f, 0.33f, 0.0f));
        this.add(toolBar);
        // TODO Auto-generated constructor stub
    }
//
//    public ST2MapMainPanel(LayoutManager layout) {
//        super(layout);
//        // TODO Auto-generated constructor stub
//    }
//
//    public ST2MapMainPanel(boolean isDoubleBuffered) {
//        super(isDoubleBuffered);
//        // TODO Auto-generated constructor stub
//    }
//
//    public ST2MapMainPanel(LayoutManager layout, boolean isDoubleBuffered) {
//        super(layout, isDoubleBuffered);
//        // TODO Auto-generated constructor stub
//    }
//
    ST2MapsToolBar toolBar = new ST2MapsToolBar("Map Tools");
}
