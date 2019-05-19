import java.awt.BorderLayout;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

  public class MyFrame extends JFrame
{
    private JButton allLocales = new JButton("All Locales");
    private JButton allTimeZones = new JButton("All Time Zones");
    private JTextArea area = new JTextArea();
    private Locale[] locales = Calendar.getAvailableLocales();
    private String[] timeZoneStrs = TimeZone.getAvailableIDs();
            
    public MyFrame()
  { 
      JPanel buttonsPanel = new JPanel();
      buttonsPanel.add(allLocales);
      buttonsPanel.add(allTimeZones);
      
      areaSet(locales,1);
      area.setEditable(false);
      
      this.add(new JScrollPane(area),BorderLayout.CENTER);
      this.add(buttonsPanel,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      allLocales.addActionListener(listener);
      allTimeZones.addActionListener(listener);
  }   
    
    public void areaSet(Object[] objects, int choice)
  {
      String text = "";
      if(choice==1)
        {
           for( int i=0; i<=objects.length-1; i++)
               text += ((Locale)objects[i]).getDisplayName() + " " + objects[i].toString() + "\n";
        }
      else
        {
           for( int i=0; i<=objects.length-1; i++)
               text += objects[i].toString() + "\n";
        }
      area.setText(text);
  }
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==allLocales) areaSet(locales,1);
        else areaSet(timeZoneStrs,2);
    }  
  }
}
