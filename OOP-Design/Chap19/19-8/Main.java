import java.io.RandomAccessFile;
import java.io.IOException;

  public class Main 
{
    public static void main(String[] args) throws IOException
  {
      RandomAccessFile inout = new RandomAccessFile("19-8Counter.dat","rw");
      if(inout.length()==0) inout.writeInt(1);
      else
        {
           inout.seek(0);
           int counter = inout.readInt();
           counter++;
           inout.seek(0);
           inout.writeInt(counter);
        }
      inout.close();
  }    
}
