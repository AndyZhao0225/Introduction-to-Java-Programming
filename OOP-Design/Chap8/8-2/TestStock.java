  public class TestStock 
{
    public static void main(String[] args)
  {
      Stock stock1 = new Stock("Java","Sun Microsystems Inc");
      stock1.previousClosingPrice = 4.5;
      stock1.currentPrice = 4.35;
      System.out.println("Stock1:");
      System.out.println("symbol: "+stock1.symbol);
      System.out.println("name: "+stock1.name);
      System.out.println("previous closing price: "+stock1.previousClosingPrice);
      System.out.println("current price: "+stock1.currentPrice);
      System.out.printf("The changing rate: %.2f%%\n",stock1.getChangePercent()*100);
  }    
}

  class Stock
{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    
    Stock(String newSymbol, String newName)
  {
     symbol = newSymbol;
     name = newName;
  }
    
    double getChangePercent()
  {
     return ( currentPrice - previousClosingPrice ) / previousClosingPrice;  
  }
}
