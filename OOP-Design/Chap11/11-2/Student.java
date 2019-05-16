  public class Student extends Person
{
    public final int FRESHMAN = 1;
    public final int SOPHOMORE = 2;
    public final int JUNIOR = 3;
    public final int SENIOR = 4;
    protected int status;
    
    public Student()
  {
  
  } 
    
    public String toString()
  {
      return "Class: Student\n" + "Name: " + name;
  }
}
