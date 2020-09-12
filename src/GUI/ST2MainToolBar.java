package GUI;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class ST2MainToolBar extends JToolBar {
    public ST2MainToolBar(String s){
        super(s);
        this.setFloatable(false);
        this.setRollover(false);
        JButton button = new JButton("xX");
        this.add(button);
    }
}
