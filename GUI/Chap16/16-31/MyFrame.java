import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

  public class MyFrame extends JFrame
{
    private JButton jbtAdd = new JButton("+1");
    private JButton jbtMinus = new JButton("-1");
    private int edgeNumbers = 3;
    private RegularPolygonPanel regularPolygonPanel = new RegularPolygonPanel();
    
    public MyFrame()
  {
      this.setLayout(new BorderLayout());
      
      JPanel panel = new JPanel();
      panel.add(jbtAdd);
      panel.add(jbtMinus);
      
      MyListener listener = new MyListener();
      jbtAdd.addActionListener(listener);
      jbtMinus.addActionListener(listener);

      this.add(regularPolygonPanel,BorderLayout.CENTER);
      this.add(panel,BorderLayout.SOUTH);
  }    
   
      private class MyListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
      {
          if(e.getSource()==jbtAdd) edgeNumbers++;     
          if(e.getSource()==jbtMinus) 
            {
               edgeNumbers--;
               if(edgeNumbers<3) edgeNumbers = 3;
            }

          regularPolygonPanel.setEdgeNumbers(edgeNumbers);
          regularPolygonPanel.repaint();
      }   
    }
}
