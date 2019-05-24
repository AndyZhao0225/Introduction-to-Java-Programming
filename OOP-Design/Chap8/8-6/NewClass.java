import javax.swing.JOptionPane;

  public class NewClass 
{
    public static void main(String[] args)
  {   
      String yearString = JOptionPane.showInputDialog("Enter full year (e.g., 2001): ");
      int year = Integer.parseInt(yearString);
      String monthString = JOptionPane.showInputDialog("Enter month in number between 1 and 12: ");
      int month = Integer.parseInt(monthString);
      
      PrintCalendar printCalendar = new PrintCalendar(year,month);
      
      printCalendar.printMonth();
  }  
}
