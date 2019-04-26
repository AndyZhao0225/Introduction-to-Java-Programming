import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

  public class ButtonDemo extends JFrame 
{
    protected MessagePanel messagePanel = new MessagePanel("Welcome to Java");
    private JButton jbtLeft = new JButton("<=");
    private JButton jbtRight = new JButton("=>");
    MyPanel panel = new MyPanel();

    public ButtonDemo() 
  {
      JPanel jpButtons = new JPanel();
      jpButtons.add(jbtLeft);
      jpButtons.add(jbtRight);

      jbtLeft.setMnemonic('L');
      jbtRight.setMnemonic('R');

      jbtLeft.setToolTipText("Move message to left");
      jbtRight.setToolTipText("Move message to right");
      
      this.setLayout(new BorderLayout());
      this.add(panel,BorderLayout.NORTH);
      this.add(messagePanel,BorderLayout.CENTER);
      this.add(jpButtons,BorderLayout.SOUTH);

      MyListener listener = new MyListener();
      jbtLeft.addActionListener(listener);  
      jbtRight.addActionListener(listener);
      panel.jrbRed.addActionListener(listener);
      panel.jrbYellow.addActionListener(listener);
      panel.jrbWhite.addActionListener(listener);
      panel.jrbGray.addActionListener(listener);
      panel.jrbGreen.addActionListener(listener);
      
      messagePanel.setBackground(Color.WHITE);
  }
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==jbtLeft) messagePanel.moveLeft();
        if(e.getSource()==jbtRight) messagePanel.moveRight();
        if(e.getSource()==panel.jrbRed) messagePanel.setBackground(Color.RED);
        if(e.getSource()==panel.jrbYellow) messagePanel.setBackground(Color.YELLOW);
        if(e.getSource()==panel.jrbWhite) messagePanel.setBackground(Color.WHITE);
        if(e.getSource()==panel.jrbGray) messagePanel.setBackground(Color.GRAY);
        if(e.getSource()==panel.jrbGreen) messagePanel.setBackground(Color.GREEN);
    }
  }
}
