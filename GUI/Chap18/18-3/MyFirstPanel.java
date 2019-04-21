import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;

  public class MyFirstPanel extends JPanel
{
    private JLabel interestsRateLabel = new JLabel("Interest Rate (e.g. 5.5 for 5.5%)");
    private JLabel yearsLabel = new JLabel("Years");
    private JLabel loanAmountLabel = new JLabel("Loan Amount");
    private JLabel monthlyPaymentLabel = new JLabel("Monthly Payment");
    private JLabel totalPaymentLabel = new JLabel("ToTal Payment");
      
    public MyFirstPanel()
  {
      setLayout(new GridLayout(5,1));
      
      add(interestsRateLabel);
      add(yearsLabel);
      add(loanAmountLabel);
      add(monthlyPaymentLabel);
      add(totalPaymentLabel);
  }    
}
