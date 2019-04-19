import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

  public class SierpinskiTriangle extends JApplet 
{
    private JButton increaseButton = new JButton(">");
    private JButton decreaseButton = new JButton("<");
    private int inputOrder = 0; 
    private JTextField jtfOrder = new JTextField("0", 5); // Order
    private SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel(); // To display the pattern
  
    public SierpinskiTriangle() 
  {
      JPanel panel = new JPanel();
      panel.add(decreaseButton);
      panel.add(increaseButton);
    
      add(trianglePanel);
      add(panel, BorderLayout.SOUTH);
    
      MyListener listener = new MyListener();
      decreaseButton.addActionListener(listener);
      increaseButton.addActionListener(listener);
  }
  
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==decreaseButton) 
          {
             if(inputOrder!=0) inputOrder--;
             else inputOrder = 0;
          }
        if(e.getSource()==increaseButton) inputOrder++;
        trianglePanel.setOrder(inputOrder);
    }
  }
    
    static class SierpinskiTrianglePanel extends JPanel 
  {
      private int order = 0;
    
      public void setOrder(int order) 
    {
        this.order = order;
        repaint();
    }
    
      protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
      
        Point p1 = new Point(getWidth() / 2, 10);
        Point p2 = new Point(10, getHeight() - 10);
        Point p3 = new Point(getWidth() - 10, getHeight() - 10);
      
        displayTriangles(g, order, p1, p2, p3);
    }
    
      private static void displayTriangles(Graphics g, int order, Point p1, Point p2, Point p3) 
    {
        if(order>=0) 
          {
             g.drawLine(p1.x, p1.y, p2.x, p2.y);
             g.drawLine(p1.x, p1.y, p3.x, p3.y);
             g.drawLine(p2.x, p2.y, p3.x, p3.y);
        
             Point p12 = midpoint(p1, p2);
             Point p23 = midpoint(p2, p3);
             Point p31 = midpoint(p3, p1);

             displayTriangles(g,order-1,p1,p12,p31);
             displayTriangles(g,order-1,p12,p2,p23);
             displayTriangles(g,order-1,p31,p23,p3);
          }
    }
    
      private static Point midpoint(Point p1, Point p2) 
    {
        return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
    }
  }

    public static void main(String[] args) 
  {
      JFrame frame = new JFrame("SierpinskiTriangle");
      SierpinskiTriangle applet = new SierpinskiTriangle();
      frame.add(applet);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(400, 400);
      frame.setVisible(true);
  }
}
