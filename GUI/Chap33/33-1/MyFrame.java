import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

  public class MyFrame extends JFrame
{
    private JTextField hGapField = new JTextField(40);  
    private JTextField vGapField = new JTextField(40);
    private String[] alighValue = {"LEFT","CENTER","RIGHT","LEADING","TRAILING"}; 
    private JComboBox combo = new JComboBox(alighValue);
    private Font font = new Font("SansSerif",Font.TRUETYPE_FONT,14);
    private JButton[] buttons = new JButton[15];
    private FlowLayout flowLayout = new FlowLayout();
    private JPanel panel = new JPanel(flowLayout);
    
    public MyFrame()
  {
      for( int i=0; i<=14; i++)
          buttons[i] = new JButton("Component "+i);
      panel.setBorder(new TitledBorder("A Container of FlowLayout"));
      for( int i=0; i<=14; i++)
          panel.add(buttons[i]);
      
      JPanel controlPanel = new JPanel();
      controlPanel.setBorder(new TitledBorder("FlowLayout Properties"));
      
      JLabel alignLabel = new JLabel("Alignment");
      alignLabel.setFont(font);
      JLabel hGapLabel = new JLabel("HGap");
      hGapLabel.setFont(font);
      JLabel vGapLabel = new JLabel("VGap");
      vGapLabel.setFont(font);
      
      JPanel p1 = new JPanel(new GridLayout(3,1));
      p1.add(alignLabel);
      p1.add(hGapLabel);
      p1.add(vGapLabel);
      JPanel p2 = new JPanel(new GridLayout(3,1));
      p2.add(combo);
      p2.add(hGapField);
      p2.add(vGapField);
      
      controlPanel.add(p1,BorderLayout.WEST);
      controlPanel.add(p2,BorderLayout.CENTER);
      
      this.add(panel,BorderLayout.CENTER);
      this.add(controlPanel,BorderLayout.SOUTH);
      
      MyActionListener listener = new MyActionListener();
      combo.addActionListener(listener);
      hGapField.addActionListener(listener);
      vGapField.addActionListener(listener);
  }    
    
    private class MyActionListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==combo)
          {
             flowLayout.setAlignment(combo.getSelectedIndex());
             panel.setLayout(flowLayout);
             panel.revalidate();
          }
        if(e.getSource()==hGapField)
          {
             flowLayout.setHgap(Integer.parseInt(hGapField.getText()));
             panel.setLayout(flowLayout);
             panel.revalidate();
          }
        if(e.getSource()==vGapField)
          {
             flowLayout.setVgap(Integer.parseInt(vGapField.getText()));
             panel.setLayout(flowLayout);
             panel.revalidate();
          }
    }
  }
}
