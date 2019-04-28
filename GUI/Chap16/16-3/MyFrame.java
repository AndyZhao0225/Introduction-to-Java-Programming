import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

  public class MyFrame extends JFrame
{
    private JButton jbtLeft = new JButton("Left");
    private JButton jbtRight = new JButton("Right");
    private JButton jbtUp = new JButton("Up");
    private JButton jbtDown = new JButton("Down");
    private MyPanel canvas = new MyPanel();
    
    public MyFrame()
  {
      JPanel panel = new JPanel();
      panel.add(jbtLeft);
      panel.add(jbtRight);
      panel.add(jbtUp);
      panel.add(jbtDown);
      
      this.add(canvas,BorderLayout.CENTER);
      this.add(panel,BorderLayout.SOUTH);
      
      ButtonListener listener = new ButtonListener();
      
      jbtLeft.addActionListener(listener);
      jbtRight.addActionListener(listener);
      jbtUp.addActionListener(listener);
      jbtDown.addActionListener(listener);
  }
    
    class ButtonListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jbtLeft) canvas.moveLeft();
        else if(e.getSource()==jbtRight) canvas.moveRight();
        else if(e.getSource()==jbtUp) canvas.moveUp();
        else if(e.getSource()==jbtDown) canvas.moveDown();
    }     
  }
}

