import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.Date;

  public class Main 
{
    public static void main(String[] args) throws IOException
  {
      ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise19__5.dat"));
      int[] numbers = {1,2,3,4,5};
      output.writeObject(numbers);
      output.writeObject(new Date());
      output.writeDouble(5.5);
  }    
}
