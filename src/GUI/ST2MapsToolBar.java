package GUI;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class ST2MapsToolBar extends JToolBar {
    public ST2MapsToolBar(String s){
        super(s);
        this.setFloatable(false);
        this.setRollover(false);
        JButton button1 = new JButton("12");
        this.add(button1);
        JButton button2 = new JButton("34");
        this.add(button2);
        JButton button3 = new JButton("56");
        this.add(button3);
        JButton button4 = new JButton("78");
        this.add(button4);
        JButton button5 = new JButton("90");
        this.add(button5);
    }
}
