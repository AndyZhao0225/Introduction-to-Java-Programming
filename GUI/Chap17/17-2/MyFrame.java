import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

  public class MyFrame extends JFrame
{
    MyPanel panel = new MyPanel();  
    FigurePanel figurePanel = new FigurePanel();  
    
    public MyFrame()
  {
      this.setLayout(new BorderLayout());
      
      this.add(figurePanel,BorderLayout.CENTER);
      this.add(panel,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      
      panel.lineButton.addActionListener(listener);
      panel.ovalButton.addActionListener(listener);
      panel.rectangleButton.addActionListener(listener);
      panel.roundRecButton.addActionListener(listener);
      panel.filledCheck.addActionListener(listener);
  }
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==panel.lineButton) figurePanel.setType(FigurePanel.LINE);
        if(e.getSource()==panel.rectangleButton) figurePanel.setType(FigurePanel.RECTANGLE);
        if(e.getSource()==panel.ovalButton) figurePanel.setType(FigurePanel.OVAL);
        if(e.getSource()==panel.roundRecButton) figurePanel.setType(FigurePanel.ROUND_RECTANGLE);
        if(e.getSource()==panel.filledCheck) figurePanel.setFilled(panel.filledCheck.isSelected());
    }  
  }
}
