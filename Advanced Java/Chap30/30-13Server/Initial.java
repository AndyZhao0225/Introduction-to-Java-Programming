import java.io.*;

  public class Initial implements Serializable
{
     private int portNum;
     private String name;
     private String text;
      
     public Initial(String userName, int newPortNum, String newText)
   {
       portNum = newPortNum;  
       name = userName;
       text = newText;
   }  
      
     public int getPortNum()
   { 
       return portNum;
   }
      
     public String getName()
   {
       return name;
   }
     
     public String getText()
   {
       return text;
   }
}