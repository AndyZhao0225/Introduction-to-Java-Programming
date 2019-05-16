import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;

  public class NewClass 
{
    public static void main(String[] args)
  {
      ArrayList list = new ArrayList();
      
      Loan loan = new Loan();
      Date date = new Date();
      String str = new String("Hello");
      JFrame frame = new JFrame();
      Circle4 circle = new Circle4();
      
      list.add(loan);
      list.add(date);
      list.add(str);
      list.add(frame);
      list.add(circle);
      
      for( int i=0; i<=list.size()-1; i++)
          System.out.println(list.get(i).toString()+"\n");
  }    
}
