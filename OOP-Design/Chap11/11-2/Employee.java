  public class Employee extends Person 
{
    protected String office;
    protected int salary;
    protected MyDate retainedDate; 
    
    public Employee()
  {
      
  }
    
    public String toString()
  {
      return "Class: Employee\n" + "Name: " + name;
  }
}
