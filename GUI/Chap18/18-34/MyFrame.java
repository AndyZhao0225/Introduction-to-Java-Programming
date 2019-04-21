import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

  public class MyFrame extends JFrame
{
    private JButton button = new JButton("Start Over");  
    private Cell[][] cells = new Cell[6][7];
    private int turn = 1;
    
    public MyFrame()
  {
      JPanel panel1 = new JPanel(new GridLayout(6,7));
      for( int i=0; i<=5; i++)
         {
            for( int j=0; j<=6; j++)
               {
                  cells[i][j] = new Cell();
                  panel1.add(cells[i][j]);
               } 
         }    
      for( int j=0; j<=6; j++)
          cells[5][j].setBased(true);
                       
      JPanel panel2 = new JPanel();
      panel2.add(button);
      
      this.add(panel1,BorderLayout.CENTER);
      this.add(panel2,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      button.addActionListener(listener);
  }
    
    public void updateBase()
  {
      for( int i=0; i<=4; i++)
         {
            for( int j=0; j<=6; j++)
               {
                  if(!cells[i][j].isOccupied() && cells[i+1][j].isOccupied())
                     cells[i][j].setBased(true);
               } 
         } 
  }
    
    public void checkWinner()
  {
      for( int i=5; i>=0; i--)
         {
            for( int j=0; j<=3; j++)
               {
                  if(cells[i][j].isOccupied() && cells[i][j+1].isOccupied() && cells[i][j+2].isOccupied() && cells[i][j+3].isOccupied())
                    {
                       if(cells[i][j].getColor()==cells[i][j+1].getColor() && cells[i][j+1].getColor()==cells[i][j+2].getColor() && cells[i][j+2].getColor()==cells[i][j+3].getColor()) 
                         {
                            freeze();
                            cells[i][j].setFlashing(true);
                            cells[i][j+1].setFlashing(true);
                            cells[i][j+2].setFlashing(true);
                            cells[i][j+3].setFlashing(true);         
                            return;
                         }
                    }
               }
         }
      
      for( int j=0; j<=6; j++)
         {
            for( int i=5; i>=3; i--)
               {
                  if(cells[i][j].isOccupied() && cells[i-1][j].isOccupied() && cells[i-2][j].isOccupied() && cells[i-3][j].isOccupied())
                    {
                       if(cells[i][j].getColor()==cells[i-1][j].getColor() && cells[i-1][j].getColor()==cells[i-2][j].getColor() && cells[i-2][j].getColor()==cells[i-3][j].getColor()) 
                         {
                            freeze();
                            cells[i][j].setFlashing(true);
                            cells[i-1][j].setFlashing(true);
                            cells[i-2][j].setFlashing(true);
                            cells[i-3][j].setFlashing(true);
                            return;
                         }
                    }
               }
         }
      
      for( int j=0; j<=3; j++)
         {
            for( int i=0; i<=2; i++)
               {
                  if(cells[i][j].isOccupied() && cells[i+1][j+1].isOccupied() && cells[i+2][j+2].isOccupied() && cells[i+3][j+3].isOccupied())
                    {
                       if(cells[i][j].getColor()==cells[i+1][j+1].getColor() && cells[i+1][j+1].getColor()==cells[i+2][j+2].getColor() && cells[i+2][j+2].getColor()==cells[i+3][j+3].getColor()) 
                         {
                            freeze();
                            cells[i][j].setFlashing(true);
                            cells[i+1][j+1].setFlashing(true);
                            cells[i+2][j+2].setFlashing(true);
                            cells[i+3][j+3].setFlashing(true);                            
                            return;
                         }
                    }
               }
         }
      
      for( int j=0; j<=3; j++)
         {
            for( int i=5; i>=3; i--)
               {
                  if(cells[i][j].isOccupied() && cells[i-1][j+1].isOccupied() && cells[i-2][j+2].isOccupied() && cells[i-3][j+3].isOccupied())
                    {
                       if(cells[i][j].getColor()==cells[i-1][j+1].getColor() && cells[i-1][j+1].getColor()==cells[i-2][j+2].getColor() && cells[i-2][j+2].getColor()==cells[i-3][j+3].getColor()) 
                         {
                            freeze();
                            cells[i][j].setFlashing(true);
                            cells[i-1][j+1].setFlashing(true);
                            cells[i-2][j+2].setFlashing(true);
                            cells[i-3][j+3].setFlashing(true);
                            return;
                         }
                    }
               }
         }
      
      boolean draw = true;
      for( int i=0; i<=5; i++)
         {
            for( int j=0; j<=6; j++)
               {
                  if(!cells[i][j].isOccupied()) 
                    {
                       draw = false;
                       break;
                    }
               }
            if(!draw) break;
         }
      if(draw) System.out.println("Draw");
  }
  
    public void freeze()
  {
      for( int i=0; i<=5; i++)
         {
            for( int j=0; j<=6; j++)
                cells[i][j].setFreezing(true);
         } 
  }
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        for( int i=0; i<=5; i++)
           {
              for( int j=0; j<=6; j++)
                 { 
                    cells[i][j].setFlashing(false);
                    cells[i][j].setOccupied(false);
                    cells[i][j].setBased(false);
                    cells[i][j].setFreezing(false);
                 }
           }
        for( int j=0; j<=6; j++)
            cells[5][j].setBased(true);
    }  
  }
    
    private class Cell extends JPanel
  {
      private Color color;  
      private boolean occupied = false;
      private boolean based = false;
      private boolean flashing = false;
      private Timer timer = new Timer(100,new FlashingListener()); 
      private boolean freezing = false;
      private int flashingTurn = 1;
      
      public Cell()
    {   
        MyCellListener listener = new MyCellListener();
        this.addMouseListener(listener);
    }
    
      public Color getColor()
    {
        return color;
    }
    
      public void setColor(Color newColor)
    {
        color = newColor;
        repaint();
    }
   
      public boolean isOccupied()
    {
        return occupied;
    }
    
      public void setOccupied(boolean occupy)
    {
        occupied = occupy;
        repaint();
    }
    
      public boolean isBased()
    {
        return based;
    }
       
      public void setBased(boolean newBased)
    {
        based = newBased;
    }
      
      public boolean isFlashing()
    {
        return flashing;
    }
      
      public void setFlashing(boolean newFlashing)
    {
        flashing = newFlashing;
        if(!flashing) timer.stop();
        else timer.start();
    }
      
      public boolean isFreezing()
    {
        return freezing;
    }
      
      public void setFreezing(boolean newFreezing)
    {
        freezing = newFreezing;
    }
      
      protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
      
        this.setBackground(new Color(0x00,0x64,0x00));
        int radius = (int)(0.7*(getWidth() + getHeight())/2/2);
        if(!flashing)
          {
             if(!occupied)
               {
                  color = Color.WHITE;
                  g.setColor(color);
               }
             else 
               {
                  color = turn==1? Color.RED: Color.BLUE;
                  turn *= -1;
                  g.setColor(color);
               }
        
             g.fillOval((int)(0.15*getWidth()),(int)(0.15*getHeight()),2*radius,2*radius); 
             if(color!=Color.WHITE) checkWinner();
          }
        else
          {
             Color flashingColor = flashingTurn==1? Color.WHITE: color;
             flashingTurn *= -1;
             g.setColor(flashingColor);
             g.fillOval((int)(0.15*getWidth()),(int)(0.15*getHeight()),2*radius,2*radius);
          }
    }
      
      private class MyCellListener extends MouseAdapter
    {
        public void mouseClicked(MouseEvent e)
      {
          if(!occupied && based && !freezing)
            {
               double distance = Math.sqrt((e.getX() - 0.5*getWidth())*(e.getX() - 0.5*getWidth()) + (e.getY() - 0.5*getHeight())*(e.getY() - 0.5*getHeight()));
               int radius = (int)(0.7*(getWidth() + getHeight())/2/2);
               if(distance<radius) 
                 {
                    setOccupied(true);
                    updateBase();
                 }
            }
      }
    }
      
      private class FlashingListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
      {
          repaint();
      }  
    }
  }
}
