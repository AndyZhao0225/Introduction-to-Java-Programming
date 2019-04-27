import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

  public class MultipleWindowsDemo extends JFrame 
{
    private JTextArea jta;
    private JButton jbtShowBarChart = new JButton("Show Bar Chart");
    private BarChart barChart = new BarChart();
    private JFrame barChartFrame = new JFrame();

    public MultipleWindowsDemo() 
  {
      JScrollPane scrollPane = new JScrollPane(jta = new JTextArea());
      scrollPane.setPreferredSize(new Dimension(300,200));
      jta.setWrapStyleWord(true);
      jta.setLineWrap(true);

      add(scrollPane,BorderLayout.CENTER);
      add(jbtShowBarChart,BorderLayout.SOUTH);

      jbtShowBarChart.addActionListener(new ActionListener() 
                                        {
                                           public void actionPerformed(ActionEvent e) 
                                         {      
                                             int[] count = countLetters();
                                             barChart.showBarChart(count);
                                             barChartFrame.setVisible(true);
                                         }});

      barChartFrame.add(barChart);
      barChartFrame.pack();
      barChartFrame.setTitle("Bar Chart");
  }

    private int[] countLetters() 
  {
      int[] count = new int[26];

      String text = jta.getText();

      for( int i=0; i<=text.length()-1; i++) 
         {
            char character = text.charAt(i);

            if((character>='A') && (character<='Z')) count[(int)character-65]++;  
            else if ((character>='a') && (character<='z')) count[(int)character-97]++;
         }

      return count; 
  }
}
