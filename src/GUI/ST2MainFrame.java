package GUI;
import javax.swing.*;
import java.awt.*;
//import GUI.ST2ScreenDims;

/**
 * @author xxx
 * 
 */
public class ST2MainFrame extends JFrame {

public ST2MainFrame(){        
        ST2ScreenDims sD = new ST2ScreenDims();
        this.setSize(sD.initWindowWidth, sD.initWindowHeight);
        this.setLocation(sD.width/20, sD.height/20);
        this.setLayout(null);        
        this.setupGui();
        this.setVisible(true);
    }

private ST2MainMenuBar menuBar;
private ST2MainToolBar toolBar;
private ST2MainSplitPane mainSplitPane;

private void setupGui(){
    setLayout(new BorderLayout());
    setupMenuBar();
    setupToolBar();
    setupSplitPane();
}

private void setupMenuBar() {    
    menuBar = new ST2MainMenuBar();
    this.setJMenuBar(menuBar);
    menuBar.setVisible(true);
}

private void setupToolBar() {
    toolBar = new ST2MainToolBar("tools");    
    this.add(toolBar,BorderLayout.NORTH);
    toolBar.setVisible(true);   
}

private void setupSplitPane(){
    mainSplitPane = new ST2MainSplitPane();
    this.add(mainSplitPane,BorderLayout.CENTER);
}

}   
