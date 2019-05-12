import java.util.Date;

  public abstract class GeometricObject implements Comparable
{
    private String color = "white";
    private boolean filled;
    private Date dateCreated;
  
    protected GeometricObject() 
  {
      dateCreated = new java.util.Date();
  }

    protected GeometricObject(String Color, boolean filled) 
  {
      dateCreated = new Date();
      this.color = color;
      this.filled = filled;
  }

    public String getColor() 
  {
      return color;
  }

    public void setColor(String color) 
  {
      this.color = color;
  }

    public boolean isFilled() 
  {
      return filled;
  }

    public void setFilled(boolean filled) 
  {
      this.filled = filled;
  }
  
    public java.util.Date getDateCreated() 
  {
      return dateCreated;
  }
  
    public static GeometricObject max(GeometricObject o1,GeometricObject o2)
  {
      if(o1.compareTo(o2)>0) return o1;
      else if(o1.compareTo(o2)<0) return o2;
      else return null;
  }
    
    public String toString() 
  {
      return "created on " + dateCreated + "\ncolor: " + color + 
             " and filled: " + filled;
  }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
}

