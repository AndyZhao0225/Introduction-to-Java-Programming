import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

  public class MyPanel extends JPanel
{   
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
     
      int width = getWidth();
      int height = getHeight();
      
      g.drawLine(0,0,width,0);
      g.drawLine(0,0,0,height);
      g.drawLine(width,0,width,height);
      g.drawLine(0,height,width,height);
      
      Image image;
      int mark = (int)(Math.random()*3); 
      if( mark==0 ) image = new ImageIcon("D:\\Java Projects Folder\\Wrong\\15-21\\o.gif").getImage();
      else if( mark==1 ) image = new ImageIcon("D:\\Java Projects Folder\\Wrong\\15-21\\x.gif").getImage();
      else image = null;
           
      if( image!=null ) g.drawImage(image,0,0,width,height,this);
  }    
}
