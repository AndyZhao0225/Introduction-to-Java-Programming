import java.io.*;

public class TestGraph 
{
   public static void main(String[] args) throws Exception 
   {
      String[] vertices = {"Seattle", "San Francisco", "Los Angeles", "Denver", 
                           "Kansas City", "Chicago", "Boston", "New York",
                           "Atlanta", "Miami", "Dallas", "Houston"};

      int[][] edges = {
                       {0, 1}, {0, 3}, {0, 5},
                       {1, 0}, {1, 2}, {1, 3},
                       {2, 1}, {2, 3}, {2, 4}, {2, 10},
                       {3, 0}, {3, 1}, {3, 2}, {3, 4}, {3, 5},
                       {4, 2}, {4, 3}, {4, 5}, {4, 7}, {4, 8}, {4, 10},
                       {5, 0}, {5, 3}, {5, 4}, {5, 6}, {5, 7},
                       {6, 5}, {6, 7},
                       {7, 4}, {7, 5}, {7, 6}, {7, 8},
                       {8, 4}, {8, 7}, {8, 9}, {8, 10}, {8, 11},
                       {9, 8}, {9, 11},
                       {10, 2}, {10, 4}, {10, 8}, {10, 11},
                       {11, 8}, {11, 9}, {11, 10}
                      };

      Graph<String> graph1 = new UnweightedGraph<String>(edges, vertices);
      
      File file = new File("graph1.txt");
      PrintWriter output = new PrintWriter(file);     
      output.println(vertices.length);
      int currentVertex = 0;
      StringBuilder sb = new StringBuilder();
      sb.append(currentVertex + " ");
      for( int i=0; i<=edges.length-1; i++)
         { 
            if(edges[i][0]!=currentVertex)
              {
                 output.println(sb.toString());
                 sb = new StringBuilder();
                 currentVertex++;
                 sb.append(currentVertex + " ");
                 sb.append(edges[i][1] + " ");
              }
            else sb.append(edges[i][1] + " ");   
         }
      output.println(sb.toString());
      output.close();
   }
}
