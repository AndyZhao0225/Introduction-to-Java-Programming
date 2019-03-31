import java.awt.BorderLayout;
import javax.swing.*;
import java.io.File;
import java.awt.event.*;
import java.net.*;
import java.applet.*;

  public class MyFrame extends JFrame
{
    private JButton playButton = new JButton("Play");
    private JButton loopButton = new JButton("Loop");
    private JButton stopButton = new JButton("Stop");
    private JButton chooseFileButton = new JButton("Choose an Audio File");
    private JFileChooser fileChooser = new JFileChooser(".");
    private AudioClip audioClip;
    
    public MyFrame()
  {
      JPanel panel = new JPanel();
      panel.add(playButton);
      panel.add(loopButton);
      panel.add(stopButton);
      
      this.add(chooseFileButton,BorderLayout.NORTH);
      this.add(panel,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      chooseFileButton.addActionListener(listener);
      playButton.addActionListener(listener);
      loopButton.addActionListener(listener);
      stopButton.addActionListener(listener);
  }      
       
    public void open()
  {
      if(fileChooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION) open(fileChooser.getSelectedFile());
  }
    
    public void open(File file)
  {
      try
        {
           audioClip = null;
           URL url = file.toURI().toURL();
           audioClip = Applet.newAudioClip(url);
        }
      catch(Exception e)
        {
           
        }
  }
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==chooseFileButton) open();
        
        if(e.getSource()==playButton) audioClip.play();
        if(e.getSource()==loopButton) audioClip.loop(); 
        if(e.getSource()==stopButton) audioClip.stop();
    }  
  }
}
