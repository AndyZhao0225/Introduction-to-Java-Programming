import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

  public class MyFrame extends JFrame
{
    private JButton jbtButton1 = new JButton("Button 1");
    private JButton jbtButton2 = new JButton("Button 2");
    private JButton jbtButton3 = new JButton("Button 3");
    private JButton jbtButton4 = new JButton("Button 4");
    private JButton jbtButton5 = new JButton("Button 5");
    private JButton jbtButton6 = new JButton("Button 6");
      
    public MyFrame()
  {
      setLayout(new FlowLayout());
      
      JPanel p1 = new JPanel(new FlowLayout());
      p1.add(jbtButton1);
      p1.add(jbtButton2);
      p1.add(jbtButton3);
      
      JPanel p2 = new JPanel(new FlowLayout());
      p2.add(jbtButton4);
      p2.add(jbtButton5);
      p2.add(jbtButton6);
      
      add(p1);
      add(p2);
      
      ButtonListener listener = new ButtonListener();
      jbtButton1.addActionListener(listener);
      jbtButton2.addActionListener(listener);
      jbtButton3.addActionListener(listener);
      jbtButton4.addActionListener(listener);
      jbtButton5.addActionListener(listener);
      jbtButton6.addActionListener(listener);
  }
    
    class ButtonListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jbtButton1) System.out.println("Process Button1");
        if(e.getSource()==jbtButton2) System.out.println("Process Button2");
        if(e.getSource()==jbtButton3) System.out.println("Process Button3");
        if(e.getSource()==jbtButton4) System.out.println("Process Button4");
        if(e.getSource()==jbtButton5) System.out.println("Process Button5");
        if(e.getSource()==jbtButton6) System.out.println("Process Button6");
    }  
  }
}
