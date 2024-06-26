public class TestLinkedList {
  /** Main method */
  public static void main(String[] args) {
    // Create a list for strings
    MyLinkedList<String> list = new MyLinkedList<String>();

    // Add elements to the list
    list.add("America"); // Add it to the list
    System.out.println("(1) " + list);

    list.add(0, "Canada"); // Add it to the beginning of the list
    System.out.println("(2) " + list);

    list.add("Russia"); // Add it to the end of the list
    System.out.println("(3) " + list);

    list.addLast("France"); // Add it to the end of the list
    System.out.println("(4) " + list);

    list.add(2, "Germany"); // Add it to the list at index 2
    System.out.println("(5) " + list);

    list.add(5, "Norway"); // Add it to the list at index 5
    System.out.println("(6) " + list);

    list.add(0, "Poland"); // Same as list.addFirst("Poland")
    System.out.println("(7) " + list);

    // Remove elements from the list
    list.remove(0); // Same as list.remove("Australia") in this case
    System.out.println("(8) " + list);

    list.remove(2); // Remove the element at index 2
    System.out.println("(9) " + list);

    list.remove(list.size() - 1); // Remove the last element
    System.out.println("(10) " + list);
    
    list.add("America"); // Same as list.addFirst("Poland")
    System.out.println("(11) " + list);
    
    list.addFirst("America"); // Same as list.addFirst("Poland")
    System.out.println("(12) " + list);
    
    list.addLast("Korea"); // Same as list.addFirst("Poland")
    System.out.println("(13) " + list);
    
    System.out.println(list.contains("Germany"));
    System.out.println(list.get(4));
    System.out.println(list.indexOf("America"));
    System.out.println(list.lastIndexOf("America"));
    System.out.println(list.set(0,"China"));
    System.out.println(list);
  }
}
