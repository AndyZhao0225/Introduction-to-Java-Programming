import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

  public class MyPanel extends JPanel
{
    private Image image;
      
    public MyPanel()
  {
        
  }
      
    public MyPanel(Image image)
  {
      this.image = image;
  }
      
    public void setImage(Image image)
  {
      this.image = image;
      repaint();
  }
      
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      g.drawImage(image,0,0,getWidth(),getHeight(),this);
  }
}