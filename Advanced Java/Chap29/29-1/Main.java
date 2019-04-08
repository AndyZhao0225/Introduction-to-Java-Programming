import javax.swing.JFrame;

  public class Main 
{      
    public static MyFrame frame; 
    
    public static void main(String[] args) 
  {
      frame = new MyFrame();
      frame.setTitle("29-1");
      frame.setSize(600,200);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
      Runnable printA = new PrintChar('a', 100);
      Runnable printB = new PrintChar('b', 100);
      Runnable print100 = new PrintNum(100);

      Thread thread1 = new Thread(printA);
      Thread thread2 = new Thread(printB);
      Thread thread3 = new Thread(print100);

      thread1.start();
      thread2.start();
      thread3.start();
  }  
    
    static class PrintChar implements Runnable 
  {
      private char charToPrint; 
      private int times; 

      public PrintChar( char c, int t) 
    {
        charToPrint = c;
        times = t;
    }

      public void run() 
    {
        for( int i=0; i<times; i++) 
            frame.appendAreaText(charToPrint + "");
    }
  }    
    
    static class PrintNum implements Runnable
  {
      private int lastNum;

      public PrintNum( int n) 
    {
        lastNum = n;
    }

      public void run() 
    {
        for( int i=1; i<=lastNum; i++) 
            frame.appendAreaText(" " + i);
    }
  }
}

