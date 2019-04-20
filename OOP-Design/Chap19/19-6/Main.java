import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;

  public class Main 
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
  {
      Loan loan1 = new Loan(2.50,1,1000);
      Loan loan2 = new Loan(2.75,2,2000);
      Loan loan3 = new Loan(3.00,3,3000);
      Loan loan4 = new Loan(3.25,4,4000);
      Loan loan5 = new Loan(3.50,5,5000);
      
      File file = new File("Exercise19_6.dat");
      FileOutputStream output;
      if(file.exists()) output = new FileOutputStream(file,true);
      else output  = new FileOutputStream(file);
      BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(output);
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
      
      objectOutputStream.writeObject(loan1);
      objectOutputStream.writeObject(loan2);
      objectOutputStream.writeObject(loan3);
      objectOutputStream.writeObject(loan4);
      objectOutputStream.writeObject(loan5);
      
      objectOutputStream.close();
      bufferedOutputStream.close();
      output.close();;
  }    
}
