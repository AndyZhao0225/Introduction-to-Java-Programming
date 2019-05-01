import java.awt.*;
import javax.swing.*;

  public class TestFigurePanel extends JFrame 
{
    public TestFigurePanel() 
  {
      setLayout(new GridLayout(2, 2, 5, 5));
      add(new FigurePanel(FigurePanel.ARC));
      add(new FigurePanel(FigurePanel.POLYGON));
      add(new FigurePanel(FigurePanel.ARC,true));
      add(new FigurePanel(FigurePanel.POLYGON,true));
  }

    public static void main(String[] args) 
  {
      TestFigurePanel frame = new TestFigurePanel();
      frame.setSize(400, 400);
      frame.setTitle("TestFigurePanel");
      frame.setLocationRelativeTo(null); // Center the frame
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
  }
}
