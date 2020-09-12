package GUI;
import javax.swing.JMenuBar;
import javax.swing.JMenu;


public class ST2MainMenuBar extends JMenuBar {
    public ST2MainMenuBar(){
    JMenu menu = new JMenu("File");   
    this.add(menu);
    menu = new JMenu("Edit");
    this.add(menu);
    menu = new JMenu("Simulation");
    this.add(menu);
    menu = new JMenu("Options");
    this.add(menu);
    menu = new JMenu("Help");  
   }
}
