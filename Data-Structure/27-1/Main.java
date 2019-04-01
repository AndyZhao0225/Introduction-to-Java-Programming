import java.io.*;
import java.util.*;

public class Main 
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a file name: ");
      String fNmAbsolutePath = input.nextLine();
      File file = new File(fNmAbsolutePath);
      try
        {
           Scanner inputFromFile = new Scanner(file);
           List<AbstractGraph.Edge> edges = new ArrayList<AbstractGraph.Edge>();
           int numOfVertices = inputFromFile.nextInt();
           inputFromFile.nextLine();
           while(inputFromFile.hasNextLine())
              {                 
                 String[] vertices = inputFromFile.nextLine().split("[\\s+]");
                 int vertex = Integer.parseInt(vertices[0]);
                 for( int j=1; j<=vertices.length-1; j++)
                    {
                       AbstractGraph.Edge edge = new AbstractGraph.Edge(vertex,Integer.parseInt(vertices[j]));
                       edges.add(edge);
                    }                      
              }
           UnweightedGraph g = new UnweightedGraph(edges,numOfVertices);
           System.out.println("The number of vertices is " + numOfVertices);
           g.printEdges();
           AbstractGraph.Tree tree = g.dfs(0);
           if(tree.getNumberOfVerticesFound()==numOfVertices) System.out.println("The graph is connected");
           else System.out.println("The graph is NOT connected"); 
        }
      catch(FileNotFoundException ex)
        {
           System.err.println("The file doesn't exist!");
        }
   }    
}
