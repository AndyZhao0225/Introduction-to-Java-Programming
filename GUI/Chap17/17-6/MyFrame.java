import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

  public class MyFrame extends JFrame
{
    MyFirstPanel panel1 = new MyFirstPanel(); 
    MySecondPanel panel2 = new MySecondPanel();
      
    public MyFrame()
  {
      this.setLayout(new BorderLayout());
      
      this.add(panel1,BorderLayout.WEST);
      this.add(panel2,BorderLayout.CENTER);
      
      MyListener listener = new MyListener();
      panel2.mileField.addActionListener(listener);
      panel2.kilometerField.addActionListener(listener);
  }    
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        String tempTxt;
        if(e.getSource()==panel2.mileField)
          {
             tempTxt = "" + 1.609344*Double.parseDouble(panel2.mileField.getText());
             panel2.kilometerField.setText(tempTxt);
          }
        if(e.getSource()==panel2.kilometerField)
          {
             tempTxt = "" + 0.6213712*Double.parseDouble(panel2.kilometerField.getText());
             panel2.mileField.setText(tempTxt);
          }
    }
  }
}
