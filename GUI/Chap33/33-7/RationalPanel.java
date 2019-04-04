import java.util.*;

  public class RationalPanel extends CalculationPanel
{
    public RationalPanel()
  {
      super("Rational Calculation");
  }  
      
    protected void add()
  {
      Rational r1 = getNum1();
      Rational r2  = getNum2();
      Rational r3 = r1.add(r2);
      resultField.setText(r3.getNumer() + "/" + r3.getDenom());
  }
    
    protected void subtract()
  {
      Rational r1 = getNum1();
      Rational r2  = getNum2();
      Rational r3 = r1.subtract(r2);
      resultField.setText(r3.getNumer() + "/" + r3.getDenom());
  }
    
    protected void multiply()
  {
      Rational r1 = getNum1();
      Rational r2  = getNum2();
      Rational r3 = r1.multiply(r2);
      resultField.setText(r3.getNumer() + "/" + r3.getDenom());
  }
    
    protected void divide()
  {
      Rational r1 = getNum1();
      Rational r2  = getNum2();
      Rational r3 = r1.divide(r2);
      resultField.setText(r3.getNumer() + "/" + r3.getDenom());
  }
    
    public Rational getNum1() 
  {
      StringTokenizer num1 = new StringTokenizer(num1Field.getText().trim(),"/");
      int numer = Integer.parseInt(num1.nextToken());
      int denom = Integer.parseInt(num1.nextToken());
      return new Rational(numer,denom);
  }

    public Rational getNum2() 
  {
      StringTokenizer num2 = new StringTokenizer(num2Field.getText().trim(),"/");
      int numer = Integer.parseInt(num2.nextToken());
      int denom = Integer.parseInt(num2.nextToken());
      return new Rational(numer,denom);
  }
    
    public class Rational
  {
      private int numer;
      private int denom;
      
      public Rational(int newNumer, int newDenom)
    {
        numer = newNumer;
        denom = newDenom;
    } 
      
      public int getNumer()
    {
        return numer;
    }
    
      public int getDenom()
    {
        return denom;
    }
      
      public Rational add(Rational r)
    {
        int n1 = this.getNumer();
        int d1 = this.getDenom();
        int n2 = r.getNumer();
        int d2 = r.getDenom();
        int newN = n1*d2 + n2*d1;
        int newD = d1*d2;
        return new Rational(newN,newD);
    }
      
      public Rational subtract(Rational r)
    {
        int n1 = this.getNumer();
        int d1 = this.getDenom();
        int n2 = r.getNumer();
        int d2 = r.getDenom();
        int newN = n1*d2 - n2*d1;
        int newD = d1*d2;
        return new Rational(newN,newD);
    }
      
      public Rational multiply(Rational r)
    {
        int n1 = this.getNumer();
        int d1 = this.getDenom();
        int n2 = r.getNumer();
        int d2 = r.getDenom();
        int newN = n1*n2;
        int newD = d1*d2;
        return new Rational(newN,newD);
    }
      
      public Rational divide(Rational r)
    {
        int n1 = this.getNumer();
        int d1 = this.getDenom();
        int n2 = r.getNumer();
        int d2 = r.getDenom();
        int newN = n1*d2;
        int newD = d1*n2;
        return new Rational(newN,newD);
    }
  }
}
