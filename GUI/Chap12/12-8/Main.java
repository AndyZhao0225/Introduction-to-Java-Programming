import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;

  public class Main 
{
    public static void main(String[] args)
  {      
      LineBorder lineBorder = new LineBorder(Color.YELLOW);
      Font font = new Font("Times New Roman",Font.BOLD,20);
      
      JLabel label1 = new JLabel("black");
      label1.setBackground(Color.WHITE);
      label1.setForeground(Color.BLACK);
      label1.setBorder(lineBorder);
      label1.setFont(font);
      label1.setToolTipText("black");
      
      JLabel label2 = new JLabel("blue"); 
      label2.setBackground(Color.WHITE);
      label2.setForeground(Color.BLUE);
      label2.setBorder(lineBorder);
      label2.setFont(font);
      label2.setToolTipText("blue");
      
      JLabel label3 = new JLabel("cyan"); 
      label3.setBackground(Color.WHITE);
      label3.setForeground(Color.CYAN);
      label3.setBorder(lineBorder);
      label3.setFont(font);
      label3.setToolTipText("cyan");
      
      JLabel label4 = new JLabel("green"); 
      label4.setBackground(Color.WHITE);
      label4.setForeground(Color.GREEN);
      label4.setBorder(lineBorder);
      label4.setFont(font);
      label4.setToolTipText("green");
      
      JLabel label5 = new JLabel("magenta"); 
      label5.setBackground(Color.WHITE);
      label5.setForeground(Color.MAGENTA);
      label5.setBorder(lineBorder);
      label5.setFont(font);
      label5.setToolTipText("magenta");
      
      JLabel label6 = new JLabel("orange"); 
      label6.setBackground(Color.WHITE);
      label6.setForeground(Color.ORANGE);
      label6.setBorder(lineBorder);
      label6.setFont(font);
      label6.setToolTipText("orange");
      
      JFrame frame = new JFrame();
      frame.setLayout(new GridLayout(2,3));
      
      frame.add(label1);
      frame.add(label2);
      frame.add(label3);
      frame.add(label4);
      frame.add(label5);
      frame.add(label6);
      
      frame.setSize(300,200);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
  }    
}
