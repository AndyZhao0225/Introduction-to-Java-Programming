  public class IntegerPanel extends CalculationPanel
{
    public IntegerPanel()
  {
      super("Integer Calculation");
  }  
      
    protected void add()
  {
      int num1 = Integer.parseInt(num1Field.getText());
      int num2 = Integer.parseInt(num2Field.getText());
      int result = num1 + num2;
      resultField.setText(result + "");
  }
    
    protected void subtract()
  {
      int num1 = Integer.parseInt(num1Field.getText());
      int num2 = Integer.parseInt(num2Field.getText());
      int result = num1 - num2;
      resultField.setText(result + "");
  }
    
    protected void multiply()
  {
      int num1 = Integer.parseInt(num1Field.getText());
      int num2 = Integer.parseInt(num2Field.getText());
      int result = num1*num2;
      resultField.setText(result + "");
  }
    
    protected void divide()
  {
      int num1 = Integer.parseInt(num1Field.getText());
      int num2 = Integer.parseInt(num2Field.getText());
      int result = num1/num2;
      resultField.setText(result + "");
  }
}
