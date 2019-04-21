import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

  public class MyFrame extends JFrame
{
    private JLabel label = new JLabel("Check the boxes if your birthday is in these sets");
    private JButton button = new JButton("Guess Birthday");
    private JTextField field = new JTextField(8);  
    final int[][] SET1 = {{1,3,5,7},{9,11,13,15},{17,19,21,23},{25,27,29,31}};
    final int[][] SET2 = {{2,3,6,7},{10,11,14,15},{18,19,22,23},{26,27,30,31}};
    final int[][] SET3 = {{4,5,6,7},{12,13,14,15},{20,21,22,23},{28,29,30,31}};
    final int[][] SET4 = {{8,9,10,11},{12,13,14,15},{24,25,26,27},{28,29,30,31}};
    final int[][] SET5 = {{16,17,18,19},{20,21,22,23},{24,25,26,27},{28,29,30,31}};   
    MyPanel p1 = new MyPanel(SET1);
    MyPanel p2 = new MyPanel(SET2);
    MyPanel p3 = new MyPanel(SET3);
    MyPanel p4 = new MyPanel(SET4);
    MyPanel p5 = new MyPanel(SET5);
     
    public MyFrame()
  {
      JPanel panel1 = new JPanel();
      panel1.add(label);
      
      JPanel panel2 = new JPanel();
      panel2.setLayout(new GridLayout(1,5));
      panel2.add(p1);
      panel2.add(p2);
      panel2.add(p3);
      panel2.add(p4);
      panel2.add(p5);
      
      JPanel panel3 = new JPanel();
      panel3.add(button);
      panel3.add(field);
      
      this.add(panel1,BorderLayout.NORTH);
      this.add(panel2,BorderLayout.CENTER);
      this.add(panel3,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      button.addActionListener(listener);
  }    
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        int answer = 0;
        if(p1.isChecked()) answer += 1;
        if(p2.isChecked()) answer += 2;
        if(p3.isChecked()) answer += 4;
        if(p4.isChecked()) answer += 8;
        if(p5.isChecked()) answer += 16;
        field.setText(answer+"");    
    }
  }
}
