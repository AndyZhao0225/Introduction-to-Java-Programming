import java.io.*;
import java.util.Arrays;

  public class Main
{
    public static final int MAX_ARRAY_SIZE = 2500000;
    public static final int BUFFER_SIZE = 5000000;

    public static void main(String[] args) throws Exception 
  {
      long startTime;
      long endTime;
      
      startTime = System.currentTimeMillis();
      sort("D:\\Java Projects Folder\\Accepted\\24-14CreateLargeFile\\largedata1.dat","sortedfile1.dat");
      endTime = System.currentTimeMillis();
      long time1 = endTime - startTime;
      
      startTime = System.currentTimeMillis();
      sort("D:\\Java Projects Folder\\Accepted\\24-14CreateLargeFile\\largedata2.dat","sortedfile2.dat");
      endTime = System.currentTimeMillis();
      long time2 = endTime - startTime;
      
      startTime = System.currentTimeMillis();
      sort("D:\\Java Projects Folder\\Accepted\\24-14CreateLargeFile\\largedata3.dat","sortedfile3.dat");
      endTime = System.currentTimeMillis();
      long time3 = endTime - startTime;
      
      startTime = System.currentTimeMillis();
      sort("D:\\Java Projects Folder\\Accepted\\24-14CreateLargeFile\\largedata4.dat","sortedfile4.dat");
      endTime = System.currentTimeMillis();
      long time4 = endTime - startTime;
      
      startTime = System.currentTimeMillis();
      sort("D:\\Java Projects Folder\\Accepted\\24-14CreateLargeFile\\largedata5.dat","sortedfile5.dat");
      endTime = System.currentTimeMillis();
      long time5 = endTime - startTime;
      
      startTime = System.currentTimeMillis();
      sort("D:\\Java Projects Folder\\Accepted\\24-14CreateLargeFile\\largedata6.dat","sortedfile6.dat");
      endTime = System.currentTimeMillis();
      long time6 = endTime - startTime;
      

      System.out.println("File Size\t5000000\t\t10000000\t15000000\t20000000\t25000000\t30000000");
      System.out.print("Time\t");
      System.out.printf("%15d",time1);
      System.out.printf("%17d",time2);
      System.out.printf("%16d",time3);
      System.out.printf("%16d",time4);
      System.out.printf("%16d",time5);
      System.out.printf("%16d",time6);
      
      System.out.println();
  }
  
    public static void sort(String sourcefile, String targetfile) throws Exception 
  {
      int numberOfSegments = initializeSegments(MAX_ARRAY_SIZE,sourcefile,"f1.dat");
      merge(numberOfSegments,MAX_ARRAY_SIZE,"f1.dat","f2.dat","f3.dat",targetfile);
      (new File("f1.dat")).delete();
      (new File("f2.dat")).delete();
      (new File("f3.dat")).delete();
  }

    private static int initializeSegments(int segmentSize, String originalFile, String f1) throws Exception 
  {
      int[] list = new int[segmentSize];
      DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(originalFile)));
      DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f1)));

      int numberOfSegments = 0;
      while(input.available()>0) 
           {
              numberOfSegments++;
              int i = 0;
              for(; input.available()>0 && i<segmentSize; i++) 
                  list[i] = input.readInt();
              
              Arrays.sort(list,0,i);

              for( int j=0; j<i; j++) 
                  output.writeInt(list[j]);    
           }

      input.close();
      output.close();
      return numberOfSegments;
  }

    private static void merge(int numberOfSegments, int segmentSize, String f1, String f2, String f3, String targetfile) throws Exception 
  {
      if(numberOfSegments>1) 
        {
           mergeOneStep(numberOfSegments,segmentSize,f1,f2,f3);
           merge((numberOfSegments+1)/2, segmentSize*2,f3,f1,f2,targetfile);
        }
      else 
        { 
           File sortedFile = new File(targetfile);
           if(sortedFile.exists()) sortedFile.delete();
           new File(f1).renameTo(sortedFile);
        }
  }

    private static void mergeOneStep(int numberOfSegments, int segmentSize, String f1, String f2, String f3) throws Exception 
  {
      DataInputStream f1Input = new DataInputStream(new BufferedInputStream(new FileInputStream(f1),BUFFER_SIZE));
      DataOutputStream f2Output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f2),BUFFER_SIZE));

      copyHalfToF2(numberOfSegments,segmentSize,f1Input,f2Output);
      f2Output.close();

      DataInputStream f2Input = new DataInputStream(new BufferedInputStream(new FileInputStream(f2),BUFFER_SIZE));
      DataOutputStream f3Output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f3),BUFFER_SIZE));

      mergeSegments(numberOfSegments/2,segmentSize,f1Input,f2Input,f3Output);

      f1Input.close();
      f2Input.close();
      f3Output.close();
  }

    private static void copyHalfToF2(int numberOfSegments, int segmentSize, DataInputStream f1, DataOutputStream f2) throws Exception 
  {
      for( int i=0; i<(numberOfSegments/2)*segmentSize; i++) 
          f2.writeInt(f1.readInt());
  }

    private static void mergeSegments(int numberOfSegments, int segmentSize, DataInputStream f1, DataInputStream f2, DataOutputStream f3) throws Exception 
  {
      for( int i=0; i<numberOfSegments; i++) 
          mergeTwoSegments(segmentSize,f1,f2,f3);
  
      while(f1.available()>0) 
            f3.writeInt(f1.readInt());
  }

    private static void mergeTwoSegments(int segmentSize, DataInputStream f1, DataInputStream f2, DataOutputStream f3) throws Exception 
  {
      int intFromF1 = f1.readInt();
      int intFromF2 = f2.readInt();
      int f1Count = 1;
      int f2Count = 1;
  
      while(true) 
           {
              if(intFromF1<intFromF2) 
                {
                   f3.writeInt(intFromF1);
                   if(f1.available()==0 || f1Count++>=segmentSize) 
                     {
                        f3.writeInt(intFromF2);
                        break;
                     }
                   else intFromF1 = f1.readInt();
                }
              else
                {
                   f3.writeInt(intFromF2);
                   if(f2.available()==0 || f2Count++>=segmentSize) 
                     {
                        f3.writeInt(intFromF1);
                        break;
                     }
                   else intFromF2 = f2.readInt();
                }
           }
  
      while(f1.available()>0 && f1Count++<segmentSize) 
            f3.writeInt(f1.readInt());
    
      while(f2.available()>0 && f2Count++<segmentSize) 
            f3.writeInt(f2.readInt());
  }
}