import javax.swing.JDialog;

  public class Main 
{
    public static void main(String[] args)
  {
      MyDialog dialog = new MyDialog();
      dialog.setTitle("34-6");
      dialog.setSize(300,150);
      dialog.setLocationRelativeTo(null);
      dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
      dialog.setVisible(true);
      dialog.pack();
  }    
}
