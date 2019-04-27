import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

  public class MyFrame extends JFrame
{
    private String text = "As members of the Deans’ Council, we, the academic deans, "
                         + "are fully supportive of President Papp’s commitment to "
                         + "Kennesaw State University as a diverse and inclusive learning "
                         + "community, and the further steps toward this goal outlined in "
                         + "his January 2016 University Update.";
    private JTextArea area = new JTextArea(text);  
    private JRadioButton wrapWordsButton = new JRadioButton("Wrap Words");
    private JRadioButton wrapCharactersButton = new JRadioButton("Wrap Characters");
    private JCheckBox checkBox = new JCheckBox("Wrap"); 
      
    public MyFrame()
  {
      this.setLayout(new BorderLayout());
      
      JPanel panel = new JPanel();
      panel.add(checkBox);
      panel.add(wrapWordsButton);
      panel.add(wrapCharactersButton);
      panel.setBorder(new TitledBorder("Wrap Options"));
     
      ButtonGroup group = new ButtonGroup();
      group.add(wrapWordsButton);
      group.add(wrapCharactersButton);
      wrapWordsButton.setSelected(true);
      checkBox.setSelected(true);
      
      area.setFont(new Font("TimesRoman",Font.BOLD,18));
      area.setLineWrap(true);
      area.setWrapStyleWord(true);
      
      this.add(new JScrollPane(area),BorderLayout.CENTER);
      this.add(panel,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      wrapWordsButton.addActionListener(listener);
      wrapCharactersButton.addActionListener(listener);
      checkBox.addActionListener(listener);
  }    
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==checkBox) area.setLineWrap(checkBox.isSelected());
        
        if(e.getSource()==wrapWordsButton) 
           if(checkBox.isSelected()) area.setWrapStyleWord(true);
          
        if(e.getSource()==wrapCharactersButton) 
           if(checkBox.isSelected()) area.setWrapStyleWord(false);
    }  
  }
}
