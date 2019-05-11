import javax.swing.JFrame;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.Color;

  public class Main 
{
    public static void main(String[] args)
  {
      MessagePanel messagePanel1 = new MessagePanel("Java");
      messagePanel1.setFont(new Font("TimesRoman",Font.ITALIC,30));
      messagePanel1.setCentered(true);
      messagePanel1.setBackground(Color.WHITE);
      
      MessagePanel messagePanel2 = new MessagePanel("HTML");
      messagePanel2.setFont(new Font("TimesRoman",Font.ITALIC,30));
      messagePanel2.setCentered(true);
      messagePanel2.setBackground(Color.ORANGE);
      
      MessagePanel messagePanel3 = new MessagePanel("Tomcat");
      messagePanel3.setFont(new Font("TimesRoman",Font.ITALIC,30));
      messagePanel3.setCentered(true);
      messagePanel3.setBackground(Color.LIGHT_GRAY);
      
      MessagePanel messagePanel4 = new MessagePanel("PHP");
      messagePanel4.setFont(new Font("TimesRoman",Font.ITALIC,30));
      messagePanel4.setCentered(true);
      messagePanel4.setBackground(Color.RED);
      
      JPanel panel = new JPanel(new GridLayout(3,1));
      panel.add(messagePanel2);
      panel.add(messagePanel3);
      panel.add(messagePanel4);
      
      JFrame frame = new JFrame();
      frame.setTitle("15-26");
      frame.setSize(800,400);
      frame.setLocationRelativeTo(null);
      frame.setLayout(new GridLayout(1,2));
      frame.add(messagePanel1);
      frame.add(panel);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
  }    
}
