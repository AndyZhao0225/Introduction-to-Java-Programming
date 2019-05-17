  public class Course 
{
    private String courseName;
    private int capacity = 100;
    private String[] students = new String[capacity];
    private int numberOfStudents;    
    
    public Course( String courseName) 
  {
      this.courseName = courseName;
  }
  
    public void addStudent( String student) 
  {
      
      if( numberOfStudents>=capacity )
        {
           String[] temp = new String[2*capacity];
           for( int i=0; i<=capacity-1; i++) temp[i] = students[i]; 
           capacity = 2*capacity;
           students = temp;          
        }
      students[numberOfStudents] = student;
      numberOfStudents++;
  }
  
    public String[] getStudents() 
  {
      return students;
  }

    public int getNumberOfStudents() 
  {
      return numberOfStudents;
  }  

    public String getCourseName() 
  {
      return courseName;
  }  
  
    public void dropStudent( String student) 
  {
      for( int i=0; i<=numberOfStudents-1; i++)
         {
            if( student.equals(students[i]) )
              {
                 for( int j=i+1; j<=numberOfStudents-1; j++)
                     students[j-1] = students[j];
                 students[numberOfStudents] = null;   
                 numberOfStudents--;
              }
         }
  }
    
    public void clear()
  {
      capacity = 100;
      students = new String[capacity];
      numberOfStudents = 0;
  } 
}
