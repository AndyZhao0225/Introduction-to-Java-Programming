import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.net.*;
import java.applet.*;

  public class MyFrame extends JFrame
{
    private JCheckBox checkBox = new JCheckBox("Alarm");   
    private JButton button = new JButton("Set alarm");
    private JLabel hourLabel = new JLabel("0",SwingConstants.CENTER);
    private JLabel minuteLabel = new JLabel("0",SwingConstants.CENTER);
    private JLabel secondLabel = new JLabel("0",SwingConstants.CENTER);
    private AlarmDialog alarmDialog = new AlarmDialog();
    private Alarm alarm;
    private Timer timer;
      
    public MyFrame()
  {
      hourLabel.setFont(new Font("TimesRoman",Font.BOLD,40));
      minuteLabel.setFont(new Font("TimesRoman",Font.BOLD,40));
      secondLabel.setFont(new Font("TimesRoman",Font.BOLD,40));
      JLabel hourTitleLabel = new JLabel("Hour",SwingConstants.CENTER);
      JLabel minuteTitleLabel = new JLabel("Minute",SwingConstants.CENTER);
      JLabel secondTitleLabel = new JLabel("Second",SwingConstants.CENTER);
      JPanel p1 = new JPanel(new BorderLayout());
      p1.add(hourTitleLabel,BorderLayout.NORTH);
      p1.add(hourLabel,BorderLayout.CENTER);
      JPanel p2 = new JPanel(new BorderLayout());
      p2.add(minuteTitleLabel,BorderLayout.NORTH);
      p2.add(minuteLabel,BorderLayout.CENTER);
      JPanel p3 = new JPanel(new BorderLayout());
      p3.add(secondTitleLabel,BorderLayout.NORTH);
      p3.add(secondLabel,BorderLayout.CENTER);
      
      JPanel panel1 = new JPanel(new GridLayout(1,3));
      panel1.add(p1);
      panel1.add(p2);
      panel1.add(p3); 
      
      Border lineBorder = new LineBorder(Color.BLACK,1);
      panel1.setBorder(lineBorder);
      
      JPanel panel2 = new JPanel();
      panel2.add(checkBox);
      panel2.add(button);
      
      this.add(panel1,BorderLayout.CENTER);
      this.add(panel2,BorderLayout.SOUTH);
      
      MyActionListener actionListener = new MyActionListener();
      button.addActionListener(actionListener);
      MyItemListener itemListener = new MyItemListener();
      checkBox.addItemListener(itemListener);
      timer = new Timer(1000,new TimerListener());
  }    
    
    private class MyActionListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        alarmDialog.setVisible(true);
        if(alarmDialog.getAlarm()!=null)
          {
             alarm = alarmDialog.getAlarm();
             hourLabel.setText(alarm.getHour()+"");
             minuteLabel.setText(alarm.getMinute()+"");
             secondLabel.setText(alarm.getSecond()+"");
          }
    }
  }
    
    private class MyItemListener implements ItemListener
  {
      public void itemStateChanged(ItemEvent e) 
    {
        if(checkBox.isSelected())
          {
             if(alarm!=null)
               {
                  if(alarm.getHour()!=0 || alarm.getMinute()!=0 || alarm.getSecond()!=0)
                    {
                       timer.start();
                    }
               }
          }
    }  
  }
    
    private class TimerListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        int second = alarm.getSecond() - 1;
        if(second<0) 
          {
             int minute = alarm.getMinute() - 1;
             if(minute<0)
               {
                  int hour = alarm.getHour() - 1;
                  if(hour<0) 
                    {
                       timer.stop();
                       URL url = getClass().getResource("beep.wav");
                       AudioClip audioClip = Applet.newAudioClip(url);
                       audioClip.play();
                       return;
                    }
                  hourLabel.setText(hour+"");
                  alarm.setHour(hour);
                  minute = 59;
               }
             minuteLabel.setText(minute+"");
             alarm.setMinute(minute);
             second = 59;
          }
        secondLabel.setText(second+"");
        alarm.setSecond(second);
    }  
  }
}