import javax.swing.JPanel;
import javax.swing.JSlider;
import java.awt.GridLayout;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;

  public class MySecondPanel extends JPanel
{
    JSlider redSlider = new JSlider();
    JSlider greenSlider = new JSlider();
    JSlider blueSlider = new JSlider();
      
    public MySecondPanel()
  {
      this.setLayout(new GridLayout(3,1));
      
      redSlider.setMaximum(255);
      redSlider.setValue(0);
      greenSlider.setMaximum(255);
      greenSlider.setValue(0);
      blueSlider.setMaximum(255);
      blueSlider.setValue(0);
      
      this.add(redSlider);
      this.add(greenSlider);
      this.add(blueSlider);
      
      Border lineBorder = new LineBorder(Color.BLACK,1);
      this.setBorder(lineBorder);
  }    
}
