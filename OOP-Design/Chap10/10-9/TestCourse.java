import java.util.Scanner;

  public class TestCourse 
{
    public static void main( String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a course name: "); 
      Course course1 = new Course(input.nextLine());
      
      System.out.print("\nHow many students you want to add to the course? ");
      int n = input.nextInt();
      input.nextLine();
      for( int i=0; i<=n-1; i++)
          course1.addStudent(input.nextLine());
      
      System.out.println("\n"+course1.getCourseName());
      System.out.println("Number of students: "+course1.getNumberOfStudents());
      String[] record = course1.getStudents(); 
      for( int i=0; i<=course1.getNumberOfStudents()-1; i++)
          System.out.println(record[i]);
      
      System.out.print("\nHow many students you want to drop from the course? ");
      n = input.nextInt();
      input.nextLine();
      for( int i=0; i<=n-1; i++)
          course1.dropStudent(input.nextLine());
      
      System.out.println("\n"+course1.getCourseName());
      System.out.println("Number of students: "+course1.getNumberOfStudents());
      record = course1.getStudents(); 
      for( int i=0; i<=course1.getNumberOfStudents()-1; i++)
          System.out.println(record[i]);
  }   
}
