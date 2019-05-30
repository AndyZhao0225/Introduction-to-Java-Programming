import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame
{
   private ClockAnimation clock1 = new ClockAnimation();  
   private ClockAnimation clock2 = new ClockAnimation();
   private ClockAnimation clock3 = new ClockAnimation();
   private JButton resumeButton = new JButton("Resume All");
   private JButton suspendButton = new JButton("Suspend All");
      
   public MyFrame()
   {
      JPanel panel1 = new JPanel(new GridLayout(1,3));
      panel1.add(clock1);
      panel1.add(clock2);
      panel1.add(clock3);
      
      JPanel panel2 = new JPanel();
      panel2.add(resumeButton);
      panel2.add(suspendButton);
      
      this.add(panel1,BorderLayout.CENTER);
      this.add(panel2,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      resumeButton.addActionListener(listener);
      suspendButton.addActionListener(listener);
   }    
   
   
   private class MyListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if(e.getSource()==resumeButton) 
           {
              clock1.timeResume();
              clock2.timeResume();
              clock3.timeResume();
           }
         if(e.getSource()==suspendButton) 
           {
              clock1.timeSuspend();
              clock2.timeSuspend();
              clock3.timeSuspend();
           }
      }
   }
}
