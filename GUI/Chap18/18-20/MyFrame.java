import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;

  public class MyFrame extends JFrame
{
    private JButton playButton = new JButton("Play");
    private JButton loopButton = new JButton("Loop");
    private JButton stopButton = new JButton("Stop");
    private AudioClip audioClip = Applet.newAudioClip(getClass().getResource("china.mid"));
    
    public MyFrame()
  {
      JPanel panel = new JPanel();
      panel.add(playButton);
      panel.add(loopButton);
      panel.add(stopButton);
      
      this.add(panel,BorderLayout.CENTER);
      
      MyListener listener = new MyListener();
      playButton.addActionListener(listener);
      loopButton.addActionListener(listener);
      stopButton.addActionListener(listener);
  }      
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==playButton) audioClip.play();
        if(e.getSource()==loopButton) audioClip.loop(); 
        if(e.getSource()==stopButton) audioClip.stop();
    }  
  }
}
