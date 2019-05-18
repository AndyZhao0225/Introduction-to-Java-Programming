import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a binary number: ");
      String bin =  input.nextLine();
      System.out.println(binaryToHex(bin));
  }   
    
    public static String binaryToHex(String binaryValue)
  {
      StringBuilder strB = new StringBuilder(binaryValue);
      
      int excess = strB.length() % 4;
      if( excess != 0 )
        {
           for( int i=1; i<=4-excess; i++)
               strB.insert(0,"0");              
        }
      
      StringBuilder result = new StringBuilder();
      
      StringBuilder record = new StringBuilder();
      int count = -1;        
      for( int i=0; i<=strB.length()-1; i++)
         {
            char ch = strB.charAt(i);
            if( ch!='0' && ch!='1') return "Invalid input!";
            count++;
            record.append(ch);
            if( count == 3 ) 
              {
                 result.append(transform4Digits(record.toString()));
                 record.delete(0,4);
                 count=-1;
              }
         }
      return  result.toString();
  }
    
    public static char transform4Digits(String str)
  {
      switch(str)
       {
          case "0000": return '0';
          case "0001": return '1';
          case "0010": return '2';
          case "0011": return '3';
          case "0100": return '4';
          case "0101": return '5';
          case "0110": return '6';
          case "0111": return '7';
          case "1000": return '8';
          case "1001": return '9';
          case "1010": return 'A';
          case "1011": return 'B';
          case "1100": return 'C';
          case "1101": return 'D';
          case "1110": return 'E';
          case "1111": return 'F';
          default: return '0';
       }
  }
}
