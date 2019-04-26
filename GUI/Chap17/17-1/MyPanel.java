import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
        
  public class MyPanel extends JPanel
{
    JRadioButton jrbRed = new JRadioButton("Red");
    JRadioButton jrbYellow = new JRadioButton("Yellow");
    JRadioButton jrbWhite = new JRadioButton("White");
    JRadioButton jrbGray = new JRadioButton("Gray");
    JRadioButton jrbGreen = new JRadioButton("Green"); 
    
    public MyPanel()
  {
      this.setLayout(new GridLayout(1,5));
      
      this.add(jrbRed);
      this.add(jrbYellow);
      this.add(jrbWhite);
      this.add(jrbGray);
      this.add(jrbGreen);
      
      jrbRed.setMnemonic('A');
      jrbYellow.setMnemonic('S');
      jrbWhite.setMnemonic('D');
      jrbGray.setMnemonic('F');
      jrbGreen.setMnemonic('G');
      
      ButtonGroup group = new ButtonGroup();
      group.add(jrbRed);
      group.add(jrbYellow);
      group.add(jrbWhite);
      group.add(jrbGray);
      group.add(jrbGreen);
      
      jrbWhite.setSelected(true);
      
      this.setBorder(new TitledBorder("Select Message Panel Background"));
  }
    
    public Dimension getPreferredSize() 
  {
      return new Dimension(600,80);
  }
}
