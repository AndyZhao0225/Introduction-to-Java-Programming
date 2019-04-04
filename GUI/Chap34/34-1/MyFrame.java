import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

  public class MyFrame extends JFrame
{
    private JButton button = new JButton("Calculate");
    private JLabel amountLabel = new JLabel("Investment Amount");
    private JLabel yearsLabel = new JLabel("Years");
    private JLabel interestRateLabel = new JLabel("Annual Inverest Rate");
    private JLabel valueLabel = new JLabel("Future Value");
    private JTextField amountField = new JTextField(20);
    private JTextField yearsField = new JTextField(20);
    private JTextField interestRateField = new JTextField(20);
    private JTextField valueField = new JTextField(20);
    private JMenuItem calculateItem = new JMenuItem("Calculate");
    private JMenuItem exitItem = new JMenuItem("Exit");
    private JMenuItem aboutItem = new JMenuItem("About");
      
    public MyFrame()
  {
      JMenuBar bar = new JMenuBar();
      JMenu operationMenu = new JMenu("Operation");
      operationMenu.add(calculateItem);
      operationMenu.addSeparator();;
      operationMenu.add(exitItem);
      bar.add(operationMenu);
      JMenu helpMenu = new JMenu("Help");
      helpMenu.add(aboutItem);
      bar.add(helpMenu);
      this.setJMenuBar(bar);
      
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(4,2));
      panel.add(amountLabel);
      panel.add(amountField);
      panel.add(yearsLabel);
      panel.add(yearsField);
      panel.add(interestRateLabel);
      panel.add(interestRateField);
      panel.add(valueLabel);
      panel.add(valueField);
      this.add(panel,BorderLayout.CENTER);
      this.add(button,BorderLayout.SOUTH);
      
      CalculateListener calculateListener = new CalculateListener();
      button.addActionListener(calculateListener);
      calculateItem.addActionListener(calculateListener);
      ExitListener exitListener = new ExitListener();
      exitItem.addActionListener(exitListener);
      valueField.setEditable(false);
      AboutListener aboutListener = new AboutListener();
      aboutItem.addActionListener(aboutListener);
   }    
    
    private class CalculateListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if((amountField.getText()!=null) && (yearsField.getText()!=null) && (interestRateField.getText()!=null))
          {
             int amount = Integer.parseInt(amountField.getText().trim());
             int years = Integer.parseInt(yearsField.getText().trim());
             double interestRate = Double.parseDouble(interestRateField.getText().trim())/100;
             double value = amount*Math.pow(1+interestRate/12,years*12);
             value = ((int)(value*100))*1.0/100;
             valueField.setText(String.valueOf(value));
          }
    }
  }  
    
    private class ExitListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
  }
    
    private class AboutListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(rootPane,"Help Information");
    }
  }
}
