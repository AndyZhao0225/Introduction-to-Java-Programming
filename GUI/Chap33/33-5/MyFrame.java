import javax.swing.*;

  public class MyFrame extends JFrame
{
    private JTextField field = new JTextField(20);
    private JButton button0 = new JButton("0");
    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");
    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton button9 = new JButton("9");
    private JButton buttonAdd = new JButton("+");
    private JButton buttonSubtract = new JButton("-");
    private JButton buttonMultiply = new JButton("*");
    private JButton buttonDivide = new JButton("/");
    private JButton buttonEqual = new JButton("=");
    private JButton buttonPoint = new JButton(".");
    private JButton buttonMC = new JButton("MC");
    private JButton buttonMR = new JButton("MR");
    private JButton buttonMS = new JButton("MS");
    private JButton buttonMAdd = new JButton("M+");
    private JButton buttonPositiveNegative = new JButton("+/-");
    private JButton buttonSqrt = new JButton("Sqrt");
    private JButton buttonModule = new JButton("%");
    private JButton buttonReciprocal  = new JButton("1/X");
    private JButton buttonBack  = new JButton("Back");
    private JButton buttonCE  = new JButton("CE");
    private JButton buttonC = new JButton("C");
    private final int BUTTON_WIDTH = 110;
    private final int BUTTON_HEIGHT = 80;
      
    public MyFrame()
  {
      JPanel panel = new JPanel();
      panel.setLayout(null);
      
      panel.add(field);
      panel.add(buttonMC);
      panel.add(buttonMR);
      panel.add(buttonMS);
      panel.add(buttonMAdd);
      panel.add(button1);
      panel.add(button2);
      panel.add(button3);
      panel.add(button4);
      panel.add(button5);
      panel.add(button6);
      panel.add(button7);
      panel.add(button8);
      panel.add(button9);
      panel.add(button0);
      panel.add(buttonAdd);
      panel.add(buttonSubtract);
      panel.add(buttonMultiply);
      panel.add(buttonDivide);
      panel.add(buttonSqrt);
      panel.add(buttonModule);
      panel.add(buttonReciprocal);
      panel.add(buttonEqual);
      panel.add(buttonPositiveNegative);
      panel.add(buttonPoint);
      panel.add(buttonBack);
      panel.add(buttonCE);
      panel.add(buttonC);
      
      field.setBounds(0,0,660,40);
      buttonMC.setBounds(0,40+BUTTON_HEIGHT,BUTTON_WIDTH,BUTTON_HEIGHT);
      buttonMR.setBounds(0,40+BUTTON_HEIGHT*2,BUTTON_WIDTH,BUTTON_HEIGHT);
      buttonMS.setBounds(0,40+BUTTON_HEIGHT*3,BUTTON_WIDTH,BUTTON_HEIGHT);
      buttonMAdd.setBounds(0,40+BUTTON_HEIGHT*4,BUTTON_WIDTH,BUTTON_HEIGHT);
      button7.setBounds(0+BUTTON_WIDTH,40+BUTTON_HEIGHT,BUTTON_WIDTH,BUTTON_HEIGHT);
      button4.setBounds(0+BUTTON_WIDTH,40+BUTTON_HEIGHT*2,BUTTON_WIDTH,BUTTON_HEIGHT);
      button1.setBounds(0+BUTTON_WIDTH,40+BUTTON_HEIGHT*3,BUTTON_WIDTH,BUTTON_HEIGHT);
      button0.setBounds(0+BUTTON_WIDTH,40+BUTTON_HEIGHT*4,BUTTON_WIDTH,BUTTON_HEIGHT);
      button8.setBounds(0+BUTTON_WIDTH*2,40+BUTTON_HEIGHT,BUTTON_WIDTH,BUTTON_HEIGHT);
      button5.setBounds(0+BUTTON_WIDTH*2,40+BUTTON_HEIGHT*2,BUTTON_WIDTH,BUTTON_HEIGHT);
      button2.setBounds(0+BUTTON_WIDTH*2,40+BUTTON_HEIGHT*3,BUTTON_WIDTH,BUTTON_HEIGHT);
      button9.setBounds(0+BUTTON_WIDTH*3,40+BUTTON_HEIGHT,BUTTON_WIDTH,BUTTON_HEIGHT);
      button6.setBounds(0+BUTTON_WIDTH*3,40+BUTTON_HEIGHT*2,BUTTON_WIDTH,BUTTON_HEIGHT);
      button3.setBounds(0+BUTTON_WIDTH*3,40+BUTTON_HEIGHT*3,BUTTON_WIDTH,BUTTON_HEIGHT);
      buttonDivide.setBounds(0+BUTTON_WIDTH*4,40+BUTTON_HEIGHT,BUTTON_WIDTH,BUTTON_HEIGHT);
      buttonMultiply.setBounds(0+BUTTON_WIDTH*4,40+BUTTON_HEIGHT*2,BUTTON_WIDTH,BUTTON_HEIGHT);
      buttonSubtract.setBounds(0+BUTTON_WIDTH*4,40+BUTTON_HEIGHT*3,BUTTON_WIDTH,BUTTON_HEIGHT);
      buttonAdd.setBounds(0+BUTTON_WIDTH*4,40+BUTTON_HEIGHT*4,BUTTON_WIDTH,BUTTON_HEIGHT);
      buttonSqrt.setBounds(0+BUTTON_WIDTH*5,40+BUTTON_HEIGHT,BUTTON_WIDTH,BUTTON_HEIGHT);
      buttonModule.setBounds(0+BUTTON_WIDTH*5,40+BUTTON_HEIGHT*2,BUTTON_WIDTH,BUTTON_HEIGHT);
      buttonReciprocal.setBounds(0+BUTTON_WIDTH*5,40+BUTTON_HEIGHT*3,BUTTON_WIDTH,BUTTON_HEIGHT);
      buttonEqual.setBounds(0+BUTTON_WIDTH*5,40+BUTTON_HEIGHT*4,BUTTON_WIDTH,BUTTON_HEIGHT);
      buttonPositiveNegative.setBounds(0+BUTTON_WIDTH*2,40+BUTTON_HEIGHT*4,BUTTON_WIDTH,BUTTON_HEIGHT);
      buttonPoint.setBounds(0+BUTTON_WIDTH*3,40+BUTTON_HEIGHT*4,BUTTON_WIDTH,BUTTON_HEIGHT);
      buttonBack.setBounds(0+BUTTON_WIDTH*3,40,BUTTON_WIDTH,BUTTON_HEIGHT);
      buttonCE.setBounds(0+BUTTON_WIDTH*4,40,BUTTON_WIDTH,BUTTON_HEIGHT);
      buttonC.setBounds(0+BUTTON_WIDTH*5,40,BUTTON_WIDTH,BUTTON_HEIGHT);
      
      add(panel);
  }    
}
