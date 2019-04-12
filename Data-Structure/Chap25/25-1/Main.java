  public class Main 
{
    public static void main(String[] args)
  {
      String[] array1 = {"Tom","George","Peter","Jean","Jane"};
      MyArrayList<String> list1 = new MyArrayList(array1);
      String[] array2 = {"Tom","George","Michael","Michelle","Daniel"};
      MyArrayList<String> list2 = new MyArrayList(array2);
      
      list1.addAll(list2);
      System.out.println(list1);
      list1.removeAll(list2);
      System.out.println(list1);
      list1.retainAll(list2);
      System.out.println(list1);
  }    
}
