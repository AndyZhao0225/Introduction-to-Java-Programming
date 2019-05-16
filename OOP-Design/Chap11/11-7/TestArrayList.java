  public class TestArrayList 
{
    public static void main(String[] args)
  {
      ArrayList cityList = new ArrayList();

      cityList.add("London");
      cityList.add("Denver");
      cityList.add("Paris");
      cityList.add("Miami");
      cityList.add("Seoul");
      cityList.add("Tokyo");
      cityList.add("Paris");
    
      System.out.println("List size? " + cityList.size()); 
      System.out.println("Is Miami in the list? " + cityList.contains("Miami")); 
      System.out.println("The location of the first Paris in the list? " + cityList.indexOf("Paris")); 
      System.out.println("The location of the last Paris in the list? " + cityList.lastIndexOf("Paris"));
      System.out.println("What is the object at the index of 3? " + cityList.get(3));
      for( int i=0; i<=cityList.size()-1; i++)
          System.out.println(cityList.get(i) + " ");
      System.out.println();
      
      cityList.add(2, "Xian");
      System.out.println("List size? " + cityList.size()); 
      System.out.println("What is the object at the index of 3? " + cityList.get(3));
      for( int i=0; i<=cityList.size()-1; i++)
          System.out.println(cityList.get(i) + " ");
      System.out.println();
      
      cityList.set(3,"Atlanta");
      System.out.println("What is the object at the index of 3? " + cityList.get(3));
      for( int i=0; i<=cityList.size()-1; i++)
          System.out.println(cityList.get(i) + " ");
      System.out.println();
      
      cityList.remove("Atlanta");
      cityList.remove(1);
      System.out.println("List size? " + cityList.size()); 
      System.out.println("What is the object at the index of 3? " + cityList.get(3));
      for( int i=0; i<=cityList.size()-1; i++)
          System.out.println(cityList.get(i) + " ");
      System.out.println();
      
      System.out.println("Is the list empty? " + cityList.isEmpty()); // Print false
      System.out.println();
      
      cityList.clear();
      System.out.println("Is the list empty? " + cityList.isEmpty()); 
      for( int i=0; i<=cityList.size()-1; i++)
          System.out.println(cityList.get(i) + " ");
  }
}

