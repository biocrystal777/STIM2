package GUI;

import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class ST2ScreenDims {    
    final int width;
    final int height;
    final int initWindowHeight;
    final int initWindowWidth;
    public ST2ScreenDims() 
    {
        GraphicsDevice gds[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();
        DisplayMode dm = gds[gds.length-1].getDisplayMode();        
        width = dm.getWidth();
        height = dm.getHeight();
        initWindowWidth = width * 17 / 20;
        initWindowHeight = height * 17 / 20;
    }
}
