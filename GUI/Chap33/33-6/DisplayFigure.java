import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

  public class DisplayFigure extends JApplet 
{
    private JTabbedPane jtpFigures = new JTabbedPane();
    private FigurePanel squarePanel = new FigurePanel();
    private FigurePanel rectanglePanel = new FigurePanel();
    private FigurePanel circlePanel = new FigurePanel();
    private FigurePanel ovalPanel = new FigurePanel();
    private JRadioButton topButton = new JRadioButton("Top");
    private JRadioButton leftButton = new JRadioButton("Left");
    private JRadioButton rightButton = new JRadioButton("Right");
    private JRadioButton bottomButton = new JRadioButton("Bottom");

    public DisplayFigure() 
  {
      squarePanel.setType(FigurePanel.LINE);
      rectanglePanel.setType(FigurePanel.RECTANGLE);
      circlePanel.setType(FigurePanel.ROUND_RECTANGLE);
      ovalPanel.setType(FigurePanel.OVAL);

    add(jtpFigures, BorderLayout.CENTER);
    jtpFigures.add(squarePanel, "Line");
    jtpFigures.add(rectanglePanel, "Rectangle");
    jtpFigures.add(circlePanel, "Round Rectangle");
    jtpFigures.add(ovalPanel, "Oval");

    jtpFigures.setToolTipTextAt(0, "Square");
    jtpFigures.setToolTipTextAt(1, "Rectangle");
    jtpFigures.setToolTipTextAt(2, "Circle");
    jtpFigures.setToolTipTextAt(3, "Oval");
    
      ButtonGroup group = new ButtonGroup();
      group.add(topButton);
      group.add(leftButton);
      group.add(rightButton);
      group.add(bottomButton);
      
      JPanel panel = new JPanel(new GridLayout(1,4));
      panel.add(topButton);
      panel.add(leftButton);
      panel.add(rightButton);
      panel.add(bottomButton);
      panel.setBorder(new TitledBorder("Specify Tab Location"));
      
      this.add(panel,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      topButton.addActionListener(listener);
      leftButton.addActionListener(listener);
      rightButton.addActionListener(listener);
      bottomButton.addActionListener(listener);
  }

  /** Main method */
  public static void main(String[] args) {
    // Create a frame
    JFrame frame = new JFrame("DisplayFigure");

    // Create an instance of the applet
    DisplayFigure applet = new DisplayFigure();
    applet.init();

    // Add the applet instance to the frame
    frame.add(applet, java.awt.BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);

    // Display the frame
    frame.setSize(600,300);
    frame.setVisible(true);
  }

    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==topButton)
          {
             jtpFigures.setTabPlacement(JTabbedPane.TOP);
             jtpFigures.revalidate();
          }
        if(e.getSource()==leftButton) 
          {
             jtpFigures.setTabPlacement(JTabbedPane.LEFT);
             jtpFigures.revalidate();
          }
        if(e.getSource()==rightButton) 
          {
             jtpFigures.setTabPlacement(JTabbedPane.RIGHT);
             jtpFigures.revalidate();
          }
        if(e.getSource()==bottomButton) 
          {
             jtpFigures.setTabPlacement(JTabbedPane.BOTTOM);
             jtpFigures.revalidate();
          }
    } 
  } 
}
