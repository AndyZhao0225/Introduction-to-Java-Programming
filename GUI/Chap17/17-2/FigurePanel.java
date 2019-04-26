import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

  public class FigurePanel extends JPanel 
{
    public static final int LINE = 1;
    public static final int RECTANGLE = 2;
    public static final int ROUND_RECTANGLE = 3;
    public static final int OVAL = 4;
    private int type = 1;
    private boolean filled;

    public FigurePanel() 
  {
      Border lineBorder = new LineBorder(Color.BLACK,1);
      this.setBorder(lineBorder);
  }

    public FigurePanel(int type) 
  {
      this.type = type;
      
      Border lineBorder = new LineBorder(Color.BLACK,1);
      this.setBorder(lineBorder);
  }

    public FigurePanel(int type, boolean filled) 
  {
      this.type = type;
      this.filled = filled;
      
      Border lineBorder = new LineBorder(Color.BLACK,1);
      this.setBorder(lineBorder);
  }

    public void paintComponent(Graphics g) 
  {
      super.paintComponent(g);

      int width = getWidth();
      int height = getHeight();

      switch(type) 
       {              
          case LINE: 
                   { 
                      g.setColor(Color.GREEN);
                      g.drawLine(10,10,width - 10,height - 10);
                      g.drawLine(width - 10,10,10, height - 10);
                      break;
                   }

          case RECTANGLE: 
                  {
                     g.setColor(Color.BLUE);
                     if(filled) g.fillRect((int)(0.1*width),(int)(0.1*height),(int)(0.8*width),(int)(0.8*height));
                     else g.drawRect((int)(0.1*width),(int)(0.1*height),(int)(0.8*width),(int)(0.8*height));
                     break;
                  }
          
          case ROUND_RECTANGLE:
                  {
                     g.setColor(Color.RED);
                     if(filled) g.fillRoundRect((int)(0.1*width),(int)(0.1*height),(int)(0.8*width),(int)(0.8*height),20,20);
                     else g.drawRoundRect((int)(0.1*width),(int)(0.1*height),(int)(0.8*width),(int)(0.8*height),20,20);
                     break;
                  }
          case OVAL: 
                  {
                     g.setColor(Color.BLACK);
                     if(filled) g.fillOval((int)(0.1*width),(int)(0.1*height),(int)(0.8*width),(int)(0.8*height));
                     else g.drawOval((int)(0.1*width),(int)(0.1*height),(int)(0.8*width),(int)(0.8*height));
                  }
       }
  }

    public void setType(int type) 
  {
      this.type = type;
      repaint();
  }

    public int getType() 
  {
      return type;
  }

    public void setFilled(boolean filled) 
  {
      this.filled = filled;
      repaint();
  }

    public boolean isFilled() 
  {
      return filled;
  }
    
    public Dimension getPreferredSize() 
  {
      return new Dimension(500,440);
  }
}
