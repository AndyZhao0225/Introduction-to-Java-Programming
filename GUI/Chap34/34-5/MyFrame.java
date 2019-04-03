import javax.swing.*;
import java.awt.event.*;

  public class MyFrame extends JFrame
{
    private JMenu messageDialogMenu = new JMenu("Message Dialog");  
    private JMenu confirmationDialogMenu = new JMenu("Confirmation Dialog");
    private JMenu inputDialogMenu = new JMenu("Input Dialog");
    private JMenu optionDialogMenu = new JMenu("Option Dialog");
    private JMenuItem errorMessageItem = new JMenuItem("Error Message");
    private JMenuItem informationMessageItem = new JMenuItem("Information Message");
    private JMenuItem questionMessageItem = new JMenuItem("Question Message");
    private JMenuItem warningMessageItem = new JMenuItem("Warning Message");
    private JMenuItem plainMessageItem = new JMenuItem("Plain Message");
    private JMenuItem customIconItem = new JMenuItem("Custom Icon");
    private JMenuItem yesNoOptionItem = new JMenuItem("YES_NO_OPTION");
    private JMenuItem yesNoCancelOptionItem = new JMenuItem("YES_NO_CANCEL_OPTION");
    private JMenuItem okCancelOptionItem = new JMenuItem("OK_CANCEL_OPTION");
    private JMenuItem textFieldInputItem = new JMenuItem("Text Field Input");
    private JMenuItem comboboxInputItem = new JMenuItem("Combobox Input");
    private JMenuItem listInputItem = new JMenuItem("List Input");
    private JMenuItem customOptionItem = new JMenuItem("Custom Input");
      
    public MyFrame()
  {
      JMenuBar bar = new JMenuBar();
      this.setJMenuBar(bar);
      bar.add(messageDialogMenu);
      bar.add(confirmationDialogMenu);
      bar.add(inputDialogMenu);
      bar.add(optionDialogMenu);
      
      messageDialogMenu.add(errorMessageItem);
      messageDialogMenu.add(informationMessageItem);
      messageDialogMenu.add(questionMessageItem);
      messageDialogMenu.add(warningMessageItem);
      messageDialogMenu.add(plainMessageItem);
      messageDialogMenu.add(customIconItem);
      confirmationDialogMenu.add(yesNoOptionItem);
      confirmationDialogMenu.add(yesNoCancelOptionItem);
      confirmationDialogMenu.add(okCancelOptionItem);
      inputDialogMenu.add(textFieldInputItem);
      inputDialogMenu.add(comboboxInputItem);
      inputDialogMenu.add(listInputItem);
      optionDialogMenu.add(customOptionItem);
      
      ActionListener listener = new MyListener();
      errorMessageItem.addActionListener(listener);
      informationMessageItem.addActionListener(listener);
      questionMessageItem.addActionListener(listener);
      warningMessageItem.addActionListener(listener);
      plainMessageItem.addActionListener(listener);
      customIconItem.addActionListener(listener);
      yesNoOptionItem.addActionListener(listener);
      yesNoCancelOptionItem.addActionListener(listener);
      okCancelOptionItem.addActionListener(listener);
      textFieldInputItem.addActionListener(listener);
      comboboxInputItem.addActionListener(listener);
      listInputItem.addActionListener(listener);
      customOptionItem.addActionListener(listener);
  } 
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==errorMessageItem) JOptionPane.showMessageDialog(rootPane,"This is an error","Error",JOptionPane.ERROR_MESSAGE);
        if(e.getSource()==informationMessageItem) JOptionPane.showMessageDialog(rootPane,"This is an information","Information",JOptionPane.INFORMATION_MESSAGE);
        if(e.getSource()==questionMessageItem) JOptionPane.showMessageDialog(rootPane,"This is a question","Question",JOptionPane.QUESTION_MESSAGE);
        if(e.getSource()==warningMessageItem) JOptionPane.showMessageDialog(rootPane,"This is a warning","Warning",JOptionPane.WARNING_MESSAGE);
        if(e.getSource()==plainMessageItem) JOptionPane.showMessageDialog(rootPane,"This is a plain","Plain",JOptionPane.PLAIN_MESSAGE);
        if(e.getSource()==customIconItem)
          {
             ImageIcon icon = new ImageIcon("D:\\Java Projects Folder\\Accepted\\34-5\\chinaIcon.gif");
             JOptionPane.showMessageDialog(rootPane,"Custom Icon","CustomIcon",JOptionPane.PLAIN_MESSAGE,icon);
          }
        if(e.getSource()==yesNoOptionItem) JOptionPane.showConfirmDialog(rootPane,"Confirm?","YES_NO_OPTION",JOptionPane.YES_NO_OPTION);
        if(e.getSource()==yesNoCancelOptionItem) JOptionPane.showConfirmDialog(rootPane,"Confirm?","YES_NO_OPTION",JOptionPane.YES_NO_CANCEL_OPTION);
        if(e.getSource()==okCancelOptionItem) JOptionPane.showConfirmDialog(rootPane,"Confirm?","YES_NO_OPTION",JOptionPane.OK_CANCEL_OPTION);
        if(e.getSource()==textFieldInputItem) JOptionPane.showInputDialog(rootPane,"Enter text");
        if(e.getSource()==comboboxInputItem)
          {
             Integer[] numbers ={1,2,3,4,5,6,7,8,9}; 
             JOptionPane.showInputDialog(rootPane,"Select an option","Input",JOptionPane.DEFAULT_OPTION,null,numbers,null);
          }
        if(e.getSource()==listInputItem)
          {
             Integer[] numbers ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; 
             JOptionPane.showInputDialog(rootPane,"Select an option","Input",JOptionPane.DEFAULT_OPTION,null,numbers,null);
          }
        if(e.getSource()==customOptionItem)
          {
             Object[] buttons = {"Button1","Button2","Button3"};
             JOptionPane.showOptionDialog(rootPane,"Select an option","Option Dialog",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,buttons,null);
          }
    }  
  }
}
