import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.Locale;
//import java.util.*;

  public class MyFrame extends JFrame
{
    private JButton button = new JButton("Convert");
    private JTextField usdField = new JTextField(20);
    private JTextField cdRateField = new JTextField(10);
    private JTextField gmRateField = new JTextField(10);
    private JTextField bpRateField = new JTextField(10);
    private JTextField cdAmountField = new JTextField(10);
    private JTextField gmAmountField = new JTextField(10);
    private JTextField bpAmountField = new JTextField(10);
    
    public MyFrame()
  {
      JPanel panel1 = new JPanel();
      JLabel usdLabel = new JLabel("US Dollors");
      panel1.add(usdLabel);
      panel1.add(usdField);
      panel1.add(button);
      panel1.setBorder(new TitledBorder("Enter Dollar Amount"));
      
      JPanel panel2 = new JPanel(new GridLayout(4,3));
      JLabel cdLabel = new JLabel("Canadin Dollors");
      JLabel gmLabel = new JLabel("German Marks");
      JLabel bpLabel = new JLabel("British Pounds");
      JLabel rateLabel = new JLabel("Exchange Rate");
      JLabel amountLabel = new JLabel("Converted Amount");
      panel2.add(new JLabel());
      panel2.add(rateLabel);
      panel2.add(amountLabel);
      panel2.add(cdLabel);
      panel2.add(cdRateField);
      panel2.add(cdAmountField);
      panel2.add(gmLabel);
      panel2.add(gmRateField);
      panel2.add(gmAmountField);
      panel2.add(bpLabel);
      panel2.add(bpRateField);
      panel2.add(bpAmountField);
      panel2.setBorder(new TitledBorder("Display Exchange"));
      
      this.add(panel1,BorderLayout.NORTH);
      this.add(panel2,BorderLayout.CENTER);
      
      MyListener listener = new MyListener();
      button.addActionListener(listener);
  }  
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(usdField.getText()!=null && cdRateField.getText()!=null && gmRateField.getText()!=null && bpRateField.getText()!=null)
          {
             double usdAmount = Double.parseDouble(usdField.getText());
             double cdRate = Double.parseDouble(cdRateField.getText());
             double gmRate = Double.parseDouble(gmRateField.getText());
             double bpRate = Double.parseDouble(bpRateField.getText());
             
             NumberFormat currencyFormat;
             currencyFormat = NumberFormat.getCurrencyInstance(Locale.CANADA);
             cdAmountField.setText(currencyFormat.format(usdAmount*cdRate));
             currencyFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);
             gmAmountField.setText(currencyFormat.format(usdAmount*gmRate));
             currencyFormat = NumberFormat.getCurrencyInstance(Locale.UK);
             bpAmountField.setText(currencyFormat.format(usdAmount*bpRate));
          }
    }  
  }
}
