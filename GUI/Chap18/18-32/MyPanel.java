import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

  public class MyPanel extends JPanel
{
    private JTextField field = new JTextField(300);
    private Font font = new Font("TimesRoman",Font.BOLD,50);
    private int secondsLeft = 0;
    private Timer timer;
    private AudioClip audioClip;
    
    public MyPanel()
  {
      field.setHorizontalAlignment(JTextField.CENTER);
      field.setFont(font);
      
      add(field);
      
      MyListener listener = new MyListener();
      field.addActionListener(listener);
      timer = new Timer(1000,listener);
      
      try
        {
           URL urlForAudio = new URL("file:///D:\\Java Projects Folder\\Accepted\\18-32\\build\\classes\\china.mid");
           audioClip = Applet.newAudioClip(urlForAudio);
        }
      catch(Exception e)
        {
           System.out.println("The audio file can't be found!");
        }    
  }
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==field)
          {
             secondsLeft = Integer.parseInt(field.getText());
             timer.start();
          }
        if(e.getSource()==timer)
          {
             secondsLeft--;
             field.setText(secondsLeft + "");
             field.repaint();
             if( secondsLeft==0 ) 
               {
                  timer.stop();
                  if( audioClip!=null ) audioClip.play();;
               }
          }
    }  
  }
}
