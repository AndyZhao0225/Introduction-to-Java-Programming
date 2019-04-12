import java.util.Comparator;

  public class IntegerComparator implements Comparator<Integer>
{
    public int compare(Integer a, Integer b) 
  {
      return a<b? -1: a>b? 1: 0;
  }
}
