import java.awt.Color;
import javax.swing.JFrame; 
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

  public class MyFrame extends JFrame
{
    private FirstPanel aFirstPanel = new FirstPanel();  
    private SecondPanel aSecondPanel = new SecondPanel();
    private FirstPanel tFirstPanel = new FirstPanel();
    private SecondPanel tSecondPanel = new SecondPanel();
    private ImageIcon icon = new ImageIcon("D:\\Java Projects Folder\\Accepted\\17-9\\grapes.gif");
    private JLabel label = new JLabel("Grapes",icon,SwingConstants.CENTER);
      
    public MyFrame()
  {
      this.setLayout(new GridLayout(2,1));
      
      this.add(label);
      
      JPanel panel1 = new JPanel();
      panel1.add(aFirstPanel);
      panel1.add(aSecondPanel);
      panel1.setBorder(new TitledBorder("Horizontal Alignment"));
      aSecondPanel.horizontalBox.setSelectedIndex(1);
      aSecondPanel.verticalBox.setSelectedIndex(1);
      
      JPanel panel2 = new JPanel();
      panel2.add(tFirstPanel);
      panel2.add(tSecondPanel);
      panel2.setBorder(new TitledBorder("Text Position"));
      tSecondPanel.horizontalBox.setSelectedIndex(2);
      tSecondPanel.verticalBox.setSelectedIndex(1);
      
      JPanel consolePanel = new JPanel(new GridLayout(1,2));
      consolePanel.add(panel1);
      consolePanel.add(panel2);
      
      Border lineBorder = new LineBorder(Color.BLACK,1);
      consolePanel.setBorder(lineBorder);
      
      this.add(consolePanel);
      
      MyListener listener = new MyListener();
      aSecondPanel.horizontalBox.addActionListener(listener);
      aSecondPanel.verticalBox.addActionListener(listener);
      tSecondPanel.horizontalBox.addActionListener(listener);
      tSecondPanel.verticalBox.addActionListener(listener);
  }    
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==aSecondPanel.horizontalBox) 
          {
             String temp = (String)aSecondPanel.horizontalBox.getSelectedItem();
             if(temp=="LEFT") label.setHorizontalAlignment(SwingConstants.LEFT);
             if(temp=="CENTER") label.setHorizontalAlignment(SwingConstants.CENTER);
             if(temp=="RIGHT") label.setHorizontalAlignment(SwingConstants.RIGHT);
          }
        
        if(e.getSource()==aSecondPanel.verticalBox) 
          {
             String temp = (String)aSecondPanel.verticalBox.getSelectedItem();
             if(temp=="TOP") label.setVerticalAlignment(SwingConstants.TOP);
             if(temp=="CENTER") label.setVerticalAlignment(SwingConstants.CENTER);
             if(temp=="BOTTOM") label.setVerticalAlignment(SwingConstants.BOTTOM);
          }
        
        if(e.getSource()==tSecondPanel.horizontalBox) 
          {
             String temp = (String)tSecondPanel.horizontalBox.getSelectedItem();
             if(temp=="LEFT") label.setHorizontalTextPosition(SwingConstants.LEFT);
             if(temp=="CENTER") label.setHorizontalTextPosition(SwingConstants.CENTER);
             if(temp=="RIGHT") label.setHorizontalTextPosition(SwingConstants.RIGHT);
          }
        
        if(e.getSource()==tSecondPanel.verticalBox) 
          {
             String temp = (String)tSecondPanel.verticalBox.getSelectedItem();
             if(temp=="TOP") label.setVerticalTextPosition(SwingConstants.TOP);
             if(temp=="CENTER") label.setVerticalTextPosition(SwingConstants.CENTER);
             if(temp=="BOTTOM") label.setVerticalTextPosition(SwingConstants.BOTTOM);
          }
    }  
  }
}
