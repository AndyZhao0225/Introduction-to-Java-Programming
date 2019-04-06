import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.util.*;
import java.awt.event.*;

  public class MyFrame extends JFrame
{
    private JTextField dateField = new JTextField(20);
    private JTextField timeField = new JTextField(20);
    private final JComboBox localeBox = new JComboBox();
    private final JComboBox timeZoneBox = new JComboBox();
    private final JComboBox dateStyleBox = new JComboBox();
    private final JComboBox timeStyleBox = new JComboBox();
    private final String[] availableTimeZones = TimeZone.getAvailableIDs();
    private final Locale[] availableLocales = Locale.getAvailableLocales();
    private final String[] availableDateStyles = {"FULL","LONG","MEDIUM","SHORT"};
    private final String[] availableTimeStyles = {"FULL","LONG","MEDIUM","SHORT"};
    private Locale locale = Locale.getDefault(); 
    private TimeZone timeZone = TimeZone.getDefault();
    private int dateStyle = 0;
    private int timeStyle = 0;
    private DateFormat dateFormat = DateFormat.getDateInstance(dateStyle,locale);
    private DateFormat timeFormat = DateFormat.getDateInstance(dateStyle,locale);
    
    public MyFrame()
  {
      setAvailableLocales();
      setAvailableTimeZones();
      setAvailableDateStyles();
      setAvailableTimeStyles();
      
      JLabel dateLabel = new JLabel("Date");
      JLabel timeLabel = new JLabel("Time");
      JPanel panel1 = new JPanel();
      panel1.add(dateLabel);
      panel1.add(dateField);
      panel1.add(timeLabel);
      panel1.add(timeField);
      
      JLabel localeLabel = new JLabel("Locale");
      JLabel timeZoneLabel = new JLabel("Time Zone");
      JPanel panel2 = new JPanel();
      panel2.add(localeLabel);
      panel2.add(localeBox);
      panel2.add(timeZoneLabel);
      panel2.add(timeZoneBox);
      
      JLabel dateStyleLabel = new JLabel("Date Style");
      JLabel timeStylelabel = new JLabel("Time Style");    
      JPanel panel3 = new JPanel();
      panel3.add(dateStyleLabel);
      panel3.add(dateStyleBox);
      panel3.add(timeStylelabel);
      panel3.add(timeStyleBox);   
      
      this.setLayout(new GridLayout(3,1));
      this.add(panel1);
      this.add(panel2);
      this.add(panel3);
      
      MyListener listener = new MyListener();
      localeBox.addActionListener(listener);
      timeZoneBox.addActionListener(listener);
      dateStyleBox.addActionListener(listener);
      timeStyleBox.addActionListener(listener);
  }

    private void setAvailableTimeZones() 
  {
      Arrays.sort(availableTimeZones);
      for( int i=0; i<availableTimeZones.length; i++) 
          timeZoneBox.addItem(availableTimeZones[i]);
  }

    private void setAvailableLocales() 
  {
      for( int i=0; i<availableLocales.length; i++) 
          localeBox.addItem(availableLocales[i].getDisplayName() + " " + availableLocales[i].toString());
  }   
    
    private void setAvailableDateStyles() 
  {
      for( int i=0; i<availableDateStyles.length; i++) 
          dateStyleBox.addItem(availableDateStyles[i]);
  } 
    
    private void setAvailableTimeStyles() 
  {
      for( int i=0; i<availableTimeStyles.length; i++) 
          timeStyleBox.addItem(availableTimeStyles[i]);
  } 
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==localeBox) locale = availableLocales[localeBox.getSelectedIndex()];
        if(e.getSource()==timeZoneBox) timeZone = TimeZone.getTimeZone(availableTimeZones[timeZoneBox.getSelectedIndex()]);
        if(e.getSource()==dateStyleBox) dateStyle = dateStyleBox.getSelectedIndex();
        if(e.getSource()==timeStyleBox) timeStyle = timeStyleBox.getSelectedIndex();
        
        dateFormat = DateFormat.getDateInstance(dateStyle,locale);
        timeFormat = DateFormat.getTimeInstance(timeStyle,locale);
        dateFormat.setTimeZone(timeZone);
        timeFormat.setTimeZone(timeZone);

        dateField.setText(dateFormat.format(new Date()));
        timeField.setText(timeFormat.format(new Date()));
    }  
  }
}
