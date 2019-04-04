import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

  public class MyFrame extends JFrame
{
    private JTextField hGapField = new JTextField(20);  
    private JTextField vGapField = new JTextField(20); 
    private Font font = new Font("SansSerif",Font.TRUETYPE_FONT,14);
    private JButton northButton = new JButton("North");
    private JButton westButton = new JButton("West");
    private JButton centerButton = new JButton("Center");
    private JButton eastButton = new JButton("East");
    private JButton southButton = new JButton("South");
    private BorderLayout borderLayout = new BorderLayout();
    private JPanel panel = new JPanel(borderLayout);
    
    public MyFrame()
  {
      panel.add(northButton,BorderLayout.NORTH);
      panel.add(westButton,BorderLayout.WEST);
      panel.add(centerButton,BorderLayout.CENTER);
      panel.add(eastButton,BorderLayout.EAST);
      panel.add(southButton,BorderLayout.SOUTH);
      panel.setBorder(new TitledBorder("A Container of BorderLayout"));
      
      JLabel hGapLabel = new JLabel("HGap");
      hGapLabel.setFont(font);
      JLabel vGapLabel = new JLabel("VGap");
      vGapLabel.setFont(font);
      
      JPanel p1 = new JPanel(new GridLayout(2,1));
      p1.add(hGapLabel);
      p1.add(vGapLabel);
      
      JPanel p2 = new JPanel(new GridLayout(2,1));
      p2.add(hGapField);
      p2.add(vGapField);
      
      JPanel controlPanel = new JPanel(new GridLayout(1,2));
      controlPanel.setBorder(new TitledBorder("BorderLayout Properties"));
      controlPanel.add(p1);
      controlPanel.add(p2);
      
      this.add(panel,BorderLayout.CENTER);
      this.add(controlPanel,BorderLayout.SOUTH);
      
      MyActionListener listener = new MyActionListener();
      hGapField.addActionListener(listener);
      vGapField.addActionListener(listener);
  }    
    
    private class MyActionListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==hGapField)
          {
             borderLayout.setHgap(Integer.parseInt(hGapField.getText()));
             panel.setLayout(borderLayout);
             panel.revalidate();
          }
        if(e.getSource()==vGapField)
          {
             borderLayout.setVgap(Integer.parseInt(vGapField.getText()));
             panel.setLayout(borderLayout);
             panel.revalidate();
          }
    }
  }
}
