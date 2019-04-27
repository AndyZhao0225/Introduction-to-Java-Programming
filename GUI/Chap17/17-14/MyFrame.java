import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

  public class MyFrame extends JFrame
{
    private String[] listSelectionMode = {"SINGLE_SELECTION","SINGLE_INTERVAL_SELECTION","MULTIPLE_INTERVAL_SELECTION"};
    private JComboBox comboBox = new JComboBox(listSelectionMode); 
    private String[] countries = {"Canada","China","Denmark","France","Germany","India","Norway","United Kingdom",
                                  "United States of America"};
    private JList list = new JList(countries);
    private JLabel label = new JLabel("Empty");
    
    public MyFrame()
  {
      this.setLayout(new BorderLayout());
      
      JLabel comboBoxLabel = new JLabel("Choose Selection");
      JPanel panel = new JPanel();
      panel.add(comboBoxLabel);
      panel.add(comboBox);
      
      this.add(panel,BorderLayout.NORTH);
      this.add(new JScrollPane(list),BorderLayout.CENTER);
      this.add(label,BorderLayout.SOUTH);
      
      MyActionListener comboBoxListener = new MyActionListener();
      comboBox.addActionListener(comboBoxListener);
      
      MyListSelectionListener listListener = new MyListSelectionListener();
      list.addListSelectionListener(listListener);
      list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
  }    
    
    private class MyActionListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        String selection = (String)(comboBox.getSelectedItem());
        if(selection=="SINGLE_SELECTION") list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        if(selection=="SINGLE_INTERVAL_SELECTION") list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if(selection=="MULTIPLE_INTERVAL_SELECTION") list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }  
  }
    
    private class MyListSelectionListener implements ListSelectionListener
  {
      public void valueChanged(ListSelectionEvent e)
    {
        int[] indices = list.getSelectedIndices();
        String labelText = "";
        
        for( int i=0; i<=indices.length-1; i++)
            labelText += countries[(indices[i])] + " ";
     
        label.setText(labelText); 
    }  
  }
}
