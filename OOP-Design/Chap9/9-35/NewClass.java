import java.util.Scanner;

  public class NewClass
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a genome: ");
      
      StringBuilder[] gene = searchGene(input.nextLine()); 
      
      if( gene[0].toString().equals("Invalid input") ) System.out.println(gene[0].toString());
      else if( gene[0].toString().equals("") ) System.out.println("No gene is found");
      else 
        {
           for( int i=0; !gene[i].toString().equals(""); i++)
               System.out.println(gene[i].toString()); 
        }
  }
    
    public static StringBuilder[] searchGene(String genome) 
  {
      int l = genome.length();    
      StringBuilder[] gene = new StringBuilder[(l/6)+1];
      for( int i=0; i<=gene.length-1; i++) gene[i]  =  new StringBuilder("");
      int geneCount = 0;
      boolean start = false;
      StringBuilder strB = new StringBuilder("   ");
      
      for( int i=0; i<=l-1; i++)
         {
            char ch = genome.charAt(i);
            if( ch!='A' && ch!='C' && ch!='T' && ch!='G' )
              {
                 gene[0].append("Invalid input");
                 geneCount = 0;
                 break;
              } 
            
            if( !start ) 
              {
                 if( i<=l-7 )
                   {
                      strB.setCharAt(0,ch);
                      strB.setCharAt(1,genome.charAt(i+1));
                      strB.setCharAt(2,genome.charAt(i+2));
                      if( strB.toString().equals("ATG") )
                        {
                           start = true;
                           i += 2;
                           continue;
                        }
                   }
                 else break;
              }
            else
              {
                 if( i<=l-3 )
                   {
                      strB.setCharAt(0,ch);
                      strB.setCharAt(1,genome.charAt(i+1));
                      strB.setCharAt(2,genome.charAt(i+2));
                      if( strB.toString().equals("TAG") || strB.toString().equals("TAA") || strB.toString().equals("TGA") )
                        {
                           geneCount++; 
                           start = false;  
                           i += 2;
                           continue;
                        }
                      else gene[geneCount].append(ch); 
                   }
                 else break;
              }
         }
      if( start == true ) gene[geneCount] = new StringBuilder("");
      return gene;
  }
}