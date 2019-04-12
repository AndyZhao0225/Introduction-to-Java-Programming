import java.io.DataOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

  public class Main 
{
    public static void main(String[] args) throws Exception
  {
      DataOutputStream output1 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("largedata1.dat")));
      for( int i=0; i<=5000000-1; i++)
          output1.writeInt((int)(Math.random()*1000000));
      output1.close();

      DataOutputStream output2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("largedata2.dat")));
      for( int i=0; i<=10000000-1; i++)
          output2.writeInt((int)(Math.random()*1000000));
      output2.close();
      
      DataOutputStream output3 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("largedata3.dat")));
      for( int i=0; i<=15000000-1; i++)
          output3.writeInt((int)(Math.random()*1000000));
      output3.close();
      
      DataOutputStream output4 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("largedata4.dat")));
      for( int i=0; i<=20000000-1; i++)
          output4.writeInt((int)(Math.random()*1000000));
      output4.close();
      
      DataOutputStream output5 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("largedata5.dat")));
      for( int i=0; i<=25000000-1; i++)
          output5.writeInt((int)(Math.random()*1000000));
      output5.close();
      
      DataOutputStream output6 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("largedata6.dat")));
      for( int i=0; i<=30000000-1; i++)
          output6.writeInt((int)(Math.random()*1000000));
      output6.close();
  }    
}
