import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

  public class MyFrame extends JFrame
{
    private JButton jbtSort = new JButton("Sort");
    private JButton jbtShuffle = new JButton("Shuffle");
    private JButton jbtReverse = new JButton("Reverse");
    private JTextField field = new JTextField(10);
    private JLabel label = new JLabel("Enter a number: ");
    private JTextArea area = new JTextArea();
    private String messageOnTheArea = "";
    private LinkedList<Integer> linkedList = new LinkedList<Integer>();
    
    public MyFrame()
  {
      JPanel panel1 = new JPanel();
      panel1.add(label);
      panel1.add(field);
      
      JPanel panel2 = new JPanel();
      panel2.add(jbtSort);
      panel2.add(jbtShuffle);
      panel2.add(jbtReverse);
      
      area.setEditable(false);
      area.setText(messageOnTheArea);
      
      this.add(panel1,BorderLayout.NORTH);
      this.add(area,BorderLayout.CENTER);
      this.add(panel2,BorderLayout.SOUTH);
      
      ActionListener fieldListener = new FieldListener();
      field.addActionListener(fieldListener);
      ActionListener buttonListener = new ButtonListener();
      jbtSort.addActionListener(buttonListener);
      jbtShuffle.addActionListener(buttonListener);
      jbtReverse.addActionListener(buttonListener);
  }
  
    public static int[] shuffle( int [] array)
  {
      for( int i=0; i<=array.length-1; i++)
         {
            int j = (int)(Math.random()*array.length);
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
         }
      return array;
  }
    
    private class FieldListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        Integer inputValue = Integer.parseInt(field.getText());
        if(!linkedList.contains(inputValue))
          {
             messageOnTheArea += " " + inputValue;
             area.setText(messageOnTheArea);
             linkedList.add(inputValue);
          }
        field.setText("");
        return;
    }       
  }
  
    private class ButtonListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jbtSort)
          {
             int[] array = new int[linkedList.size()];
             for( int i=0; i<=array.length-1; i++)
                 array[i] = linkedList.get(i);
             Arrays.sort(array);
             linkedList.clear();
             for( int i=0; i<=array.length-1; i++)
                 linkedList.add(array[i]);
             messageOnTheArea = "";
             ListIterator<Integer> listIterator = linkedList.listIterator();
             while(listIterator.hasNext())
                   messageOnTheArea += listIterator.next() + " ";
             area.setText(messageOnTheArea);
          }
        
        if(e.getSource()==jbtShuffle)
          {
             int[] array = new int[linkedList.size()];
             for( int i=0; i<=array.length-1; i++)
                 array[i] = linkedList.get(i);
             shuffle(array);
             linkedList.clear();
             for( int i=0; i<=array.length-1; i++)
                 linkedList.add(array[i]);
             messageOnTheArea = "";
             ListIterator<Integer> listIterator = linkedList.listIterator();
             while(listIterator.hasNext())
                   messageOnTheArea += listIterator.next() + " ";
             area.setText(messageOnTheArea);
          }
        
        if(e.getSource()==jbtReverse) 
          {
             int[] array = new int[linkedList.size()];
             for( int i=0; i<=array.length-1; i++)
                 array[i] = linkedList.get(i);
             linkedList.clear();
             for( int i=array.length-1; i>=0; i--)
                 linkedList.add(array[i]);
             messageOnTheArea = "";
             ListIterator<Integer> listIterator = linkedList.listIterator();
             while(listIterator.hasNext())
                   messageOnTheArea += listIterator.next() + " ";
             area.setText(messageOnTheArea);
          }
    }     
  }
}
