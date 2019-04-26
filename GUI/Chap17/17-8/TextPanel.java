import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

  public class TextPanel extends JPanel
{
    private Font font = new Font("TimesRoman",Font.BOLD,20);  
    private String fontName = "Adobe Arabic";
    private int fontSize = 40;
    private int fontStyle = 0;
    private JCheckBox centered = new JCheckBox("Centered");
    private JCheckBox bold = new JCheckBox("Bold");
    private JCheckBox italic = new JCheckBox("Italic");
      
    public TextPanel()
  {
      this.setLayout(new BorderLayout());
      
      JPanel panel = new JPanel();
      panel.add(centered);
      panel.add(bold);
      panel.add(italic);
      centered.setSelected(true);
      
      this.add(panel,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      centered.addActionListener(listener);
      bold.addActionListener(listener);
      italic.addActionListener(listener);
  }
    
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      font = new Font(fontName,fontStyle,fontSize);
      g.setFont(font);
      
      int xCoordinate = (int)(getWidth()*(0.2 + Math.random()*0.6));
      int yCoordinate = (int)(getHeight()*(0.2 + Math.random()*0.6));
      if(centered.isSelected())
        {
           FontMetrics fm = g.getFontMetrics();
           int stringWidth = fm.stringWidth("Java is cool");
           int stringAscent = fm.getAscent();
           xCoordinate = getWidth()/2 - stringWidth/2;
           yCoordinate = getHeight()/2 + stringAscent/2;
        }
      
      g.drawString("Java is cool",xCoordinate,yCoordinate);
  }    
    
    public void setFontName(String newFontName)
  {
      fontName = newFontName;
      repaint();
  }
    
    public void setFontSize(int newFontSize)
  {
      fontSize = newFontSize;
      repaint();
  }
    
    public void setFontStyle(int newFontStyle)
  {
      fontStyle += newFontStyle;
      repaint();
  }
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==centered) repaint();
        
        if(e.getSource()==bold) 
          {
             if(bold.isSelected()) setFontStyle(Font.BOLD);
             else setFontStyle(-1*Font.BOLD);
          }
        
        if(e.getSource()==italic)
          {
             if(italic.isSelected()) setFontStyle(Font.ITALIC);
             else setFontStyle(-1*Font.ITALIC);
          }
    }  
  }
}
