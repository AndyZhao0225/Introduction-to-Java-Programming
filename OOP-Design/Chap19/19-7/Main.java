import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.EOFException;

  public class Main 
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
  {
      Loan loan1 = new Loan(2.50,1,1000);
      Loan loan2 = new Loan(2.75,2,2000);
      Loan loan3 = new Loan(3.00,3,3000);
      Loan loan4 = new Loan(3.25,4,4000);
      Loan loan5 = new Loan(3.50,5,5000);
      Loan loan6 = new Loan(3.75,6,6000);
      
      File file = new File("Exercise19_7.dat");
      FileOutputStream output = new FileOutputStream(file);
      BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(output);
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
      
      objectOutputStream.writeObject(loan1);
      objectOutputStream.writeObject(loan2);
      objectOutputStream.writeObject(loan3);
      objectOutputStream.writeObject(loan4);
      objectOutputStream.writeObject(loan5);
      objectOutputStream.writeObject(loan6);
      
      objectOutputStream.close();
      bufferedOutputStream.close();
      output.close();;
      
      FileInputStream input = new FileInputStream(file);
      BufferedInputStream bufferedInputStream = new BufferedInputStream(input);
      ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
      double sum = 0;
      try
        {
           Loan loan;
           while((loan=(Loan)objectInputStream.readObject())!=null)
                 sum += loan.getLoanAmount();     
        }
      catch(EOFException ex)
        {
           
        }
      finally
        {
           System.out.println(sum);
           objectInputStream.close();
           bufferedInputStream.close();
           input.close();
        }
  }    
}
