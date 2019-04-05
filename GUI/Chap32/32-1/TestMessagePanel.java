import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class TestMessagePanel extends JFrame {
  public TestMessagePanel() {
    MessagePanelWithActionEvent messagePanel1 = new MessagePanelWithActionEvent("Wecome to Java");
    MessagePanelWithActionEvent messagePanel2 = new MessagePanelWithActionEvent("Java is fun");
    MessagePanelWithActionEvent messagePanel3 = new MessagePanelWithActionEvent("Java is cool");
    MessagePanelWithActionEvent messagePanel4 = new MessagePanelWithActionEvent("I love Java");
    messagePanel1.setFont(new Font("SansSerif", Font.ITALIC, 20));
    messagePanel2.setFont(new Font("Courie", Font.BOLD, 20));
    messagePanel3.setFont(new Font("Times", Font.ITALIC, 20));
    messagePanel4.setFont(new Font("Californian FB", Font.PLAIN, 20));
    messagePanel1.setBackground(Color.red);
    messagePanel2.setBackground(Color.cyan);
    messagePanel3.setBackground(Color.green);
    messagePanel4.setBackground(Color.white);
    messagePanel1.setCentered(true);

    setLayout(new GridLayout(2, 2));
    add(messagePanel1);
    add(messagePanel2);
    add(messagePanel3);
    add(messagePanel4);
    
    MyListener listener = new MyListener();
    messagePanel1.addActionListener(listener);
    messagePanel2.addActionListener(listener);
    messagePanel3.addActionListener(listener);
    messagePanel4.addActionListener(listener);
  }

  public static void main(String[] args) {
    TestMessagePanel frame = new TestMessagePanel();
    frame.setSize(800,400);
    frame.setTitle("TestMessagePanel");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
  
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        ((MessagePanelWithActionEvent)e.getSource()).setMessage(Calendar.getInstance().getTime().toString());
    }  
  }
}
