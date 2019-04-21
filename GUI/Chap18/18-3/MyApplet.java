import javax.swing.JApplet;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

  public class MyApplet extends JApplet 
{
    private JPanel panel = new JPanel(new GridLayout(1,2));
    private MyFirstPanel panel1 = new MyFirstPanel();
    private MySecondPanel panel2 = new MySecondPanel();
    private JButton button = new JButton("Compute Payment");
    private JLabel label = new JLabel("Enter interest rate, year and loan amount");
    private double interestsRate = 0; 
    private int years = 0;
    private double loanAmount = 0;
     
    public MyApplet()
  {
      setLayout(new BorderLayout());
      
      panel.add(panel1);
      panel.add(panel2);
      
      JPanel tempPanel  = new JPanel(new BorderLayout());
      tempPanel.add(button,BorderLayout.EAST);
      
      add(label,BorderLayout.NORTH);
      add(panel,BorderLayout.CENTER);
      add(tempPanel,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      button.addActionListener(listener);
  }
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        interestsRate = panel2.getInterestsRate();
        years = panel2.getYears();
        loanAmount = panel2.getLoanAmount();
        panel2.setPayment(interestsRate,years,loanAmount);
    }  
  }
}
