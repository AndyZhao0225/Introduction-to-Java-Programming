import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.TitledBorder;

  public class ButtonDemo extends JFrame 
{
    protected MessagePanel messagePanel = new MessagePanel("Welcome to Java");
    private SouthPanel southPanel = new SouthPanel(); 
    private NorthPanel northPanel = new NorthPanel();

    public ButtonDemo() 
  {
      messagePanel.setBackground(Color.white);

      setLayout(new BorderLayout());
      this.add(northPanel,BorderLayout.NORTH);
      this.add(messagePanel,BorderLayout.CENTER);
      this.add(southPanel,BorderLayout.SOUTH);

      MyListener listener = new MyListener();
      southPanel.jbtLeft.addActionListener(listener);
      southPanel.jbtRight.addActionListener(listener);
      southPanel.message.addActionListener(listener);
      southPanel.interval.addActionListener(listener);
      northPanel.redButton.addActionListener(listener);
      northPanel.greenButton.addActionListener(listener);
      northPanel.blueButton.addActionListener(listener);
      northPanel.centered.addActionListener(listener);
      northPanel.bold.addActionListener(listener);
      northPanel.italic.addActionListener(listener);
      
      northPanel.setBorder(new TitledBorder("North Panel"));
      messagePanel.setBorder(new TitledBorder("Message Panel"));
      southPanel.setBorder(new TitledBorder("South Panel"));
  }
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==southPanel.jbtLeft) messagePanel.moveLeft();
        if(e.getSource()==southPanel.jbtRight) messagePanel.moveRight();
        if(e.getSource()==southPanel.message) messagePanel.setMessage(southPanel.message.getText());
        if(e.getSource()==southPanel.interval) messagePanel.setInterval((int)(southPanel.interval.getSelectedItem()));
        if(e.getSource()==northPanel.redButton) messagePanel.setForeground(Color.RED);
        if(e.getSource()==northPanel.greenButton) messagePanel.setForeground(Color.GREEN);
        if(e.getSource()==northPanel.blueButton) messagePanel.setForeground(Color.BLUE);
        if(e.getSource()==northPanel.centered) messagePanel.setCentered(northPanel.centered.isSelected());
        if(e.getSource()==northPanel.bold) 
          {
             if(northPanel.bold.isSelected()) messagePanel.setFontStyle(Font.BOLD);
             else messagePanel.setFontStyle(-1*Font.BOLD);
          }
        if(e.getSource()==northPanel.italic)
          {
             if(northPanel.italic.isSelected()) messagePanel.setFontStyle(Font.ITALIC);
             else messagePanel.setFontStyle(-1*Font.ITALIC);
          }

    }   
  }
}
