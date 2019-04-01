import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

  public class MyFrame extends JFrame
{
    private JTextField rowsField = new JTextField(20);
    private JTextField columnsField = new JTextField(20);
    private JTextField hGapField = new JTextField(20);  
    private JTextField vGapField = new JTextField(20); 
    private Font font = new Font("SansSerif",Font.TRUETYPE_FONT,14);
    private JButton[] buttons = new JButton[15];
    private GridLayout gridLayout = new GridLayout();
    private JPanel panel = new JPanel(gridLayout);
    
    public MyFrame()
  {
      for( int i=0; i<=14; i++)
          buttons[i] = new JButton("Component "+i);
      panel.setBorder(new TitledBorder("A Container of GridLayout"));
      for( int i=0; i<=14; i++)
          panel.add(buttons[i]);
      
      JLabel rowsLabel = new JLabel("      Rows");
      rowsLabel.setFont(font);
      JLabel columnsLabel = new JLabel("Columns");
      columnsLabel.setFont(font);
      JLabel hGapLabel = new JLabel("HGap");
      hGapLabel.setFont(font);
      JLabel vGapLabel = new JLabel("VGap");
      vGapLabel.setFont(font);
      
      JPanel p1 = new JPanel();
      p1.add(rowsLabel,BorderLayout.WEST);
      p1.add(rowsField,BorderLayout.CENTER);
      
      JPanel p2 = new JPanel();
      p2.add(hGapLabel,BorderLayout.WEST);
      p2.add(hGapField,BorderLayout.CENTER);
      
      JPanel p3 = new JPanel();
      p3.add(columnsLabel,BorderLayout.WEST);
      p3.add(columnsField,BorderLayout.CENTER);
      
      JPanel p4 = new JPanel();
      p4.add(vGapLabel);
      p4.add(vGapField);
      
      JPanel controlPanel = new JPanel(new GridLayout(2,2));
      controlPanel.setBorder(new TitledBorder("GridLayout Properties"));
      controlPanel.add(p1);
      controlPanel.add(p2);
      controlPanel.add(p3);
      controlPanel.add(p4);
      
      this.add(panel,BorderLayout.CENTER);
      this.add(controlPanel,BorderLayout.SOUTH);
      
      MyActionListener listener = new MyActionListener();
      rowsField.addActionListener(listener);
      columnsField.addActionListener(listener);
      hGapField.addActionListener(listener);
      vGapField.addActionListener(listener);
  }    
    
    private class MyActionListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==rowsField)
          {
             gridLayout.setRows(Integer.parseInt(rowsField.getText()));
             panel.setLayout(gridLayout);
             panel.revalidate();
          }
        if(e.getSource()==columnsField)
          {
             gridLayout.setColumns(Integer.parseInt(columnsField.getText()));
             panel.setLayout(gridLayout);
             panel.revalidate();
          }
        if(e.getSource()==hGapField)
          {
             gridLayout.setHgap(Integer.parseInt(hGapField.getText()));
             panel.setLayout(gridLayout);
             panel.revalidate();
          }
        if(e.getSource()==vGapField)
          {
             gridLayout.setVgap(Integer.parseInt(vGapField.getText()));
             panel.setLayout(gridLayout);
             panel.revalidate();
          }
    }
  }
}
