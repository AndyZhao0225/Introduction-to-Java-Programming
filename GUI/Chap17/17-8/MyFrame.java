import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

  public class MyFrame extends JFrame
{
    private TextPanel textPanel = new TextPanel();  
    private SelectPanel selectPanel = new SelectPanel();
      
    public MyFrame()
  {
      this.setLayout(new BorderLayout());
      
      this.add(textPanel,BorderLayout.CENTER);
      this.add(selectPanel,BorderLayout.NORTH);
      
      MyListener listener = new MyListener();
      selectPanel.fontSizeBox.addActionListener(listener);
      selectPanel.fontNameBox.addActionListener(listener);
  }    
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==selectPanel.fontNameBox)
          {
             String newFontName = (String)(selectPanel.fontNameBox.getSelectedItem());
             textPanel.setFontName(newFontName);
          }
        
        if(e.getSource()==selectPanel.fontSizeBox) 
          {
             int newFontSize = (int)(selectPanel.fontSizeBox.getSelectedItem());
             textPanel.setFontSize(newFontSize);
          }
    }    
  }
}
