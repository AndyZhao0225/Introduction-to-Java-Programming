import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

  public class MyFrame extends JFrame
{
    private CardLayout cardLayout = new CardLayout();  
    private JPanel mainPanel = new JPanel(cardLayout);
    private JComboBox box = new JComboBox(new Object[]{"Integer Operation","Rational Operation"});
      
    public MyFrame()
  {
      this.add(box,BorderLayout.NORTH);
      this.add(mainPanel,BorderLayout.CENTER);
      
      JPanel integerPanel = new IntegerPanel();
      JPanel rationalPanel = new RationalPanel();
      mainPanel.add(integerPanel,"IntegerPanel");
      mainPanel.add(rationalPanel,"RationalPanel");
      
      Listener listener = new Listener();
      box.addActionListener(listener);
  }
    
    private class Listener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(box.getSelectedItem().equals("Integer Operation")) cardLayout.show(mainPanel,"IntegerPanel");
        else if(box.getSelectedItem().equals("Rational Operation")) cardLayout.show(mainPanel,"RationalPanel");
    }  
  }
}
