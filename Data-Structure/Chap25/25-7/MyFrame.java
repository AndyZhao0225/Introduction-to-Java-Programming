import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import java.io.*;

  public class MyFrame extends JFrame
{
    private JButton verifyButton = new JButton("Verify");
    private JButton refreshButton = new JButton("Refresh");
    private JTextField field = new JTextField(20);
    private MyPanel p2 = new MyPanel();
   
    public MyFrame()
  {
      JPanel p1 = new JPanel();
      p1.add(refreshButton,BorderLayout.EAST);
      
      JPanel p3 = new JPanel();
      JLabel label = new JLabel("Enter an expression:");
      p3.add(label);
      p3.add(field);
      p3.add(verifyButton);
      
      add(p1,BorderLayout.NORTH);
      add(p2,BorderLayout.CENTER);
      add(p3,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      refreshButton.addActionListener(listener);
      verifyButton.addActionListener(listener);
  } 
  
    public ArrayList<Integer> findIntegers(String text)
  {
      ArrayList<Integer> list = new ArrayList<Integer>();
      char[][] numberRecord = {{'a','a'},{'a','a'},{'a','a'},{'a','a'}}; 
      boolean priorIsDigit = false;
      int numIndex = -1;
      for( int i=0; i<=text.length()-1; i++)
         {
            char ch = text.charAt(i);
            if(Character.isDigit(ch))
              {
                 if(priorIsDigit) 
                   {
                      numberRecord[numIndex][1] = ch;
                      priorIsDigit = false;
                   }
                 else 
                   {
                      numIndex++;
                      numberRecord[numIndex][0] = ch;
                   }
                 priorIsDigit = true; 
              } 
            else priorIsDigit = false;
         }
      
      for( int i=0; i<=3; i++)
         {
            int num = -1;
            if(numberRecord[i][1]=='a') num = numberRecord[i][0] - '0';
            else
              {
                 int tensDigit = numberRecord[i][0] - '0';
                 int unitDigit = numberRecord[i][1] - '0';
                 num = tensDigit*10 + unitDigit;          
              }
            list.add(num);
         }
      
      return list;
  }
    
    public boolean compareList(List<Integer> enterList, List<Integer> originalList)
  {
      
      ArrayList<Integer> list1 = new ArrayList<Integer>();
      for(Integer element: enterList)
          list1.add(element);
      ArrayList<Integer> list2 = new ArrayList<Integer>();
      for(Integer element: originalList)
          list2.add(element);
      
      MyComparator comparator = new MyComparator(); 
      list1.sort(comparator);
      list2.sort(comparator);
      for( int i=0; i<=3; i++)
          if(!list1.get(i).equals(list2.get(i))) return false;
         
      return true;
  }
    
    public int executeExpression(String text, ArrayList<Integer> numList)
  {
      Stack<Integer> numStack = new Stack<Integer>();
      Stack<Character> charStack = new Stack<Character>();
      Set<Character> set1 = new HashSet<Character>();
      set1.add('+');
      set1.add('-');
      Set<Character> set2 = new HashSet<Character>();
      set2.add('*');
      set2.add('/');
      
      int numIndex = 0;
      boolean priorDigit = false;
      for( int i=0; i<=text.length()-1; i++)
         {
            char ch = text.charAt(i);
            if(Character.isDigit(ch))
              {
                 if(priorDigit) continue;
                 else
                   {
                      int element = numList.get(numIndex);
                      numStack.push(element);
                      numIndex++;
                      priorDigit = true;
                   }
              }
            else
              {
                 priorDigit = false;
                 if(charStack.isEmpty() || ch=='(') charStack.push(ch);
                 else
                   {
                      if(ch==')')
                        { 
                            char operator = charStack.pop();
                            while(operator!='(')
                              {
                                 int num2 = numStack.pop();
                                 int num1 = numStack.pop();
                                 int newNum = 0;
                                 switch(operator)
                                     {
                                        case '+': newNum = num1 + num2; break;
                                        case '-': newNum = num1 - num2; break;
                                        case '*': newNum = num1 * num2; break;
                                        case '/': newNum = num1 / num2; break;
                                        default: ;
                                     }
                                 numStack.push(newNum);
                                 operator = charStack.pop();
                              }
                        }
                      else 
                        {
                           char operator = charStack.peek();
                           boolean s1 = set1.contains(operator) && set1.contains(ch); 
                           boolean s2 = set2.contains(operator) && set2.contains(ch);
                           boolean s3 = set2.contains(operator) && set1.contains(ch);
                           
                           if(s1||s2||s3)
                             {
                                int num2 = numStack.pop();
                                int num1 = numStack.pop();
                                int newNum = 0;
                                switch(operator)
                                    {
                                       case '+': newNum = num1 + num2; break;
                                       case '-': newNum = num1 - num2; break;
                                       case '*': newNum = num1 * num2; break;
                                       case '/': newNum = num1 / num2; break;
                                       default: ;
                                    }
                                numStack.push(newNum);
                                charStack.pop();
                             }
                           charStack.push(ch);
                        }
                   }    
              }
         }
      
      while(!charStack.isEmpty())
        {
           char operator = charStack.pop();
           int num2 = numStack.pop();
           int num1 = numStack.pop();
           int newNum = 0;
           switch(operator)
               {
                  case '+': newNum = num1 + num2; break;
                  case '-': newNum = num1 - num2; break;
                  case '*': newNum = num1 * num2; break;
                  case '/': newNum = num1 / num2; break;
                  default: ;
               }
           numStack.push(newNum);                     
        }
      
      return numStack.pop();
  }
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==refreshButton) p2.refresh();
        if(e.getSource()==verifyButton) 
          {
             String text = field.getText();
             ArrayList<Integer> enterList = findIntegers(text);
             ArrayList<Integer> originalList = p2.getList();
             if(!compareList(enterList,originalList)) JOptionPane.showMessageDialog(null,"Unmatched input numbers","Message",JOptionPane.INFORMATION_MESSAGE);
             else 
               {
                  int result = executeExpression(text,enterList);
                  if(result==24) JOptionPane.showMessageDialog(null,"Correct!","Message",JOptionPane.INFORMATION_MESSAGE);
                  else JOptionPane.showMessageDialog(null,"Incorrect","Message",JOptionPane.INFORMATION_MESSAGE);
               }
          }
    }
  }
    
    public class MyComparator implements Comparator<Integer>, Serializable
  {
      public int compare(Integer num1, Integer num2)
    {
        if(num1<num2) return -1;
        else if(num1<num2) return 1;
        else return 0;
    }
  }
}
