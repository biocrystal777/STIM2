package GUI;
import javax.swing.*;
import java.awt.*;

/**
 * @author xxx
 * 
 */
public class ST2MainFrame extends JFrame {

public ST2MainFrame() {
        ScreenDims sD = new ScreenDims();
        this.setSize(sD.width * 19 / 20, sD.height * 19 / 20);
        this.setLocation(sD.width/20, sD.height/20);
        this.setLayout(null);
        this.setVisible(true);
    }

class ScreenDims {
    int width;
    int height;
    public ScreenDims() {
        GraphicsDevice gds[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();
        DisplayMode dm = gds[gds.length-1].getDisplayMode(); 
        width = dm.getWidth();
        height = dm.getHeight();
    }    
}
}
