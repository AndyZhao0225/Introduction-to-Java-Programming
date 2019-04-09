public class TestBinaryTree {
  public static void main(String[] args) {
    // Create a BinaryTree
    Integer[] numbers = {60,55,100,45,57,59,67,107,101};
    BinaryTree<Integer> tree = new BinaryTree<Integer>(numbers);
    
    Integer[] numbers2 = {10,6,4,8};
    BinaryTree<Integer> tree2 = new BinaryTree<Integer>(numbers2);
    
//    tree.insert("George");
//    tree.insert("Michael");
//    tree.insert("Tom");
//    tree.insert("Adam");
//    tree.insert("Jones");
//    tree.insert("Peter");
//    tree.insert("Daniel");

    // Traverse tree
    System.out.print("Inorder (sorted): \n");
    tree2.inorder();
    System.out.print("\nPostorder: \n");
    tree.postorder();
    System.out.print("\nPreorder: \n");
    tree2.preorder();
    System.out.print("\nBreadthFirstTraversal(): \n");
    tree.breadthFirstTraversal();
    
    System.out.print("\nThe number of nodes is " + tree.getSize() + "\n");
    System.out.print("\nThe height of the tree is " + tree.height() + "\n");
    System.out.print("\nThe number of non-leaves is " + tree.getNumberOfNonLeaves() + "\n");
    System.out.print("\nThe number of leaves is " + tree.getNumberOfLeaves() + "\n");
//    System.out.print("\nThe number of non-leaves is " + tree2.getNumberOfNonLeaves() + "\n");
    System.out.print("\nThe number of leaves is " + tree2.getNumberOfLeaves() + "\n");
    
    System.out.print("\nIs tree a complete binary tree? " + tree.isCompleteBinaryTree() + "\n");
    System.out.print("\nIs tree a complete binary tree2? " + tree2.isCompleteBinaryTree() + "\n");

//    // Search for an element
//    System.out.print("\nIs Peter in the tree? " + 
//      tree.search("Peter"));

    // Get a path from the root to Peter
//    System.out.print("\nA path from the root to Peter is: ");
//    java.util.ArrayList<BinaryTree.TreeNode<String>>  path 
//      = tree.path("Peter");
//    for (int i = 0; path != null && i < path.size(); i++)
//      System.out.print(path.get(i).element + " ");
//
//    Integer[] numbers = {2, 4, 3, 1, 8, 5, 6, 7};
//    BinaryTree<Integer> intTree = new BinaryTree<Integer>(numbers);
//    System.out.print("\nInorder (sorted): ");
//    intTree.inorder();
  }
}
