package GUI;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class ST2MainToolBar extends JToolBar {
    public ST2MainToolBar(String s){
        super(s);
        this.setFloatable(false);
        this.setRollover(false);
        JButton button1 = new JButton("AB");
        this.add(button1);
        JButton button2 = new JButton("CD");
        this.add(button2);
        JButton button3 = new JButton("EF");
        this.add(button3);
        JButton button4 = new JButton("GH");
        this.add(button4);
        JButton button5 = new JButton("IJ");
        this.add(button5);        
    }
}
