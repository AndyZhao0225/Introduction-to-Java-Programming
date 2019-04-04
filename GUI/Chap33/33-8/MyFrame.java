import javax.swing.*;

  public class MyFrame extends JFrame
{    
    private FigurePanel panel1 = new FigurePanel(FigurePanel.OVAL);
    private FigurePanel panel2 = new FigurePanel(FigurePanel.ROUND_RECTANGLE);
    private FigurePanel panel3 = new FigurePanel(FigurePanel.RECTANGLE);
    private FigurePanel panel4 = new FigurePanel(FigurePanel.LINE);
    private JSplitPane pane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,false,panel1,panel2); 
    private JSplitPane pane2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,false,panel3,panel4);
    private JSplitPane pane3 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,false,pane1,pane2);
      
    public MyFrame()
  {
      this.add(pane3);
  }    
}
