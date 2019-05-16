import java.util.ArrayList;

  public class Course 
{
    private String courseName;
    private ArrayList list = new ArrayList();
    
    public Course(String courseName)
  {
      this.courseName = courseName;
  }
    
    public void addStudent(String student)
  {
      list.add(student);
  }
    
    public String[] getStudents()
  {
      String[] students = new String[list.size()];
      for( int i=0; i<=list.size()-1; i++)
          students[i] = (String)list.get(i);
      return students;
  }  
    
    public int getNumberOfStudents()
  {
      return list.size();
  }
    
    public String getCourseName()
  {
      return courseName;
  }
    
    public void dropStudent(String student)
  {
      list.remove(student);
  }
}
