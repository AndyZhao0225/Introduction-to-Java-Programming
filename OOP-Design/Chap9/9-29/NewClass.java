import javax.swing.JOptionPane;

  public class NewClass 
{
    public static void main(String[] args)
  {
      String s = JOptionPane.showInputDialog(null,"Enter a string","Input",JOptionPane.QUESTION_MESSAGE);
      String regex = JOptionPane.showInputDialog(null,"Enter a seperator string","Input",JOptionPane.QUESTION_MESSAGE);
      String[] result = split(s,regex);
      StringBuilder finalResult= new StringBuilder();
      for( int i=0; result[i]!=""; i++) finalResult.append(result[i]+", ");
      JOptionPane.showMessageDialog(null,finalResult.toString(),"Output",JOptionPane.INFORMATION_MESSAGE);
  }   
    
    public static String[] split(String s, String regex)
  {
      int l = s.length();
      String[] result = new String[l+1];
      for( int i=0; i<=l; i++) result[i] = "";
      boolean multipleSep = regex.length()==1? false: true;
      int m = 0;  
      for( int i=0; i<=l-1; i++)
         {
            boolean sepMatch = false;
            char ch = s.charAt(i);
            if(multipleSep)
              {
                 for( int j=0; j<=regex.length()-1; j++)
                    {
                       if( ch == regex.charAt(j) )
                         {
                            if( !result[m].equals("") ) m++;
                            result[m] += regex.charAt(j);
                            m++;
                            sepMatch = true;
                         }
                    } 
              }  
            else 
              {
                 if( ch == regex.charAt(0) )
                   {
                      if( !result[m].equals("") ) m++;
                      result[m] += regex.charAt(0);
                      m++;
                      sepMatch = true;
                   }  
              }
            if(sepMatch) continue;
            result[m] += ch;
         }
      return result;
  }
}
