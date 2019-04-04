import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class ShowDiagonalLayout extends JFrame {
  private FlowLayout flowLayout = new FlowLayout();
  private GridLayout gridLayout = new GridLayout(2, 2);
  private DiagonalLayout diagonalLayout = new DiagonalLayout();

  private JButton jbt1 = new JButton("Button 1");
  private JButton jbt2 = new JButton("Button 2");
  private JButton jbt3 = new JButton("Button 3");
  private JButton jbt4 = new JButton("Button 4");

  private JRadioButton jrbFlowLayout =
    new JRadioButton("FlowLayout");
  private JRadioButton jrbGridLayout =
    new JRadioButton("GridLayout");
  private JRadioButton jrbDiagonalLayout =
    new JRadioButton("DiagonalLayout", true);

  private JPanel jPanel2 = new JPanel();
  private JTextField field = new JTextField(10/*diagonalLayout.getGap()*/);
  private JCheckBox box1 = new JCheckBox("Major Diagonal",true);
  private JCheckBox box2 = new JCheckBox("Last Component Stretched");

  public ShowDiagonalLayout() {

    jPanel2.setLayout(diagonalLayout);
    jPanel2.add(jbt1);
    jPanel2.add(jbt2);
    jPanel2.add(jbt3);
    jPanel2.add(jbt4);
    jPanel2.setBorder(new LineBorder(Color.black));

    JPanel jPanel1 = new JPanel();
    jPanel1.setBorder(new TitledBorder("Select a Layout Manager"));
    jPanel1.add(jrbFlowLayout);
    jPanel1.add(jrbGridLayout);
    jPanel1.add(jrbDiagonalLayout);

    ButtonGroup buttonGroup1 = new ButtonGroup();
    buttonGroup1.add(jrbFlowLayout);
    buttonGroup1.add(jrbGridLayout);
    buttonGroup1.add(jrbDiagonalLayout);

    add(jPanel1, BorderLayout.SOUTH);
    add(jPanel2, BorderLayout.CENTER);
    
    JPanel p3 = new JPanel();
    
    p3.add(new JLabel("Diagonal Gap"));
    p3.add(field);
    
    JPanel p4 = new JPanel(new GridLayout(3,1));
    p4.add(p3);
    p4.add(box1);
    p4.add(box2);
    
    jPanel1.add(p4,BorderLayout.EAST);

    jrbFlowLayout.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jPanel2.setLayout(flowLayout);
        jPanel2.validate();
        jPanel1.remove(p4);
        jPanel1.revalidate();
      }
    });
    jrbGridLayout.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jPanel2.setLayout(gridLayout);
        jPanel2.validate();
        jPanel1.remove(p4);
        jPanel1.revalidate();
      }
    });
    jrbDiagonalLayout.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jPanel2.setLayout(diagonalLayout);
        jPanel2.validate();
        jPanel1.add(p4);
        jPanel1.revalidate();
      }
    });
    
    MyListener listener = new MyListener();
    field.addActionListener(listener);
    box1.addActionListener(listener);
    box2.addActionListener(listener);
  }

  public static void main(String[] args) {
    ShowDiagonalLayout frame = new ShowDiagonalLayout();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("ShowDiagonalLayout");
    frame.setSize(600,400);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setVisible(true);
  }
  
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==field) 
          {
             int gap = Integer.parseInt(field.getText());
             diagonalLayout.setGap(gap);
             jPanel2.revalidate();
          }
        else if(e.getSource()==box1)
          {
             diagonalLayout.setMajorDiagonal(box1.isSelected());
             jPanel2.revalidate();
          }
        else if(e.getSource()==box2)
          {
             diagonalLayout.setLastFill(box2.isSelected());
             jPanel2.revalidate();
          }
    } 
  }
}
