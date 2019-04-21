import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.JApplet;

  public class ButtonDemo extends JApplet
{
    protected MessagePanel messagePanel = new MessagePanel("Welcome to Java");
    private JButton jbtLeft = new JButton("<=");
    private JButton jbtRight = new JButton("=>");

    public ButtonDemo() 
  {
      messagePanel.setBackground(Color.white);

      JPanel jpButtons = new JPanel();
      jpButtons.add(jbtLeft);
      jpButtons.add(jbtRight);

      jbtLeft.setMnemonic('L');
      jbtRight.setMnemonic('R');

      jbtLeft.setToolTipText("Move message to left");
      jbtRight.setToolTipText("Move message to right");

      setLayout(new BorderLayout());
      add(messagePanel, BorderLayout.CENTER);
      add(jpButtons, BorderLayout.SOUTH);

      jbtLeft.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.moveLeft();
      }
    });
    jbtRight.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.moveRight();
      }
    });
  }
}
