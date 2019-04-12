public class TestStackQueue {
  public static void main(String[] args) {
    // Create a queue
    GenericQueue<String> queue = new GenericQueue<String>();

    // Add elements to the queue
    queue.enqueue("Tom"); // Add it to the queue
    System.out.println("(1) " + queue);

    queue.enqueue("John"); // Add it to the queue
    System.out.println("(2) " + queue);

    queue.enqueue("George"); // Add it to the queue
    queue.enqueue("Michael"); // Add it to the queue
    System.out.println("(3) " + queue);

    // Remove elements from the queue
    System.out.println("(4) " + queue.dequeue());
    System.out.println("(5) " + queue.dequeue());
    System.out.println("(6) " + queue);
  }
}
