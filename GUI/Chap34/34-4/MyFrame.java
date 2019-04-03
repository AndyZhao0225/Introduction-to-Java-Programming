import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JToolBar;
import java.awt.Image;

  public class MyFrame extends JFrame
{
    private MyAction cn = new MyAction("CN",new ImageIcon("D:\\Java Projects Folder\\Accepted\\34-4\\cn.gif"));
    private MyAction us = new MyAction("US",new ImageIcon("D:\\Java Projects Folder\\Accepted\\34-4\\us.gif"));
    private MyPanel panel = new MyPanel();
      
    public MyFrame()
  {
      JMenuBar bar = new JMenuBar();
      this.setJMenuBar(bar);
      JMenu flags = new JMenu("Flags");
      bar.add(flags);
      flags.add(cn);
      flags.add(us);
      
      JToolBar tBar = new JToolBar(JToolBar.VERTICAL);
      tBar.setBorder(BorderFactory.createLineBorder(Color.GRAY));
      tBar.add(cn);
      tBar.add(us);
      this.add(tBar,BorderLayout.EAST);
      
      this.add(panel,BorderLayout.CENTER);
  }
    
    private class MyAction extends AbstractAction
  {
      private String name;
      
      public MyAction(String name, ImageIcon icon)
    {
        super(name,icon);
        this.name = name;
    }  
     
      public void actionPerformed(ActionEvent e)
    {
        ImageIcon imageIcon = new ImageIcon();
        if(name.equals("CN")) imageIcon = new ImageIcon("D:\\Java Projects Folder\\Accepted\\34-4\\china.gif");
        if(name.equals("US")) imageIcon = new ImageIcon("D:\\Java Projects Folder\\Accepted\\34-4\\america.gif");
        Image image = imageIcon.getImage();
        panel.setImage(image);  
    }  
  }
}
