import javax.swing.JOptionPane;
import java.util.HashMap;

  public class Main 
{
    public static void main(String[] args)
  {
      HashMap<String,String> province = new HashMap<String,String>();
      province.put("Beijing","Beijing");
      province.put("Tianjin","Tianjin");
      province.put("Heilongjiang","Haerbin");
      province.put("Jilin","Changchun");
      province.put("Liaoning","Shenyang");
      province.put("Hebei","Shijiazhuang");
      province.put("He'nan","Zhengzhou");
      province.put("Neimenggu","Huhehaote");
      province.put("Shandong","Ji'nan");
      province.put("Shanxi","Taiyuan");
      province.put("Shan3xi","Xi'an");
      province.put("Gansu","Lanzhou");
      province.put("Xinjiang","Wulumuqi");
      province.put("Tibet","Lasha");
      province.put("Guizhou","Guiyang");
      province.put("Qinghai","Xining");
      province.put("Sichuan","Chengdu");
      province.put("Yunnan","Kunming");
      province.put("Chongqing","Chongqing");
      province.put("Hubei","Wuhan");
      province.put("Hu'nan","Changsha");
      province.put("Guangxi","Nanning");
      province.put("Guangdong","Guangzhou");
      province.put("Jiangxi","Nanchang");
      province.put("Anhui","Hefei");
      province.put("Jiangshu","Nanjing");
      province.put("Zhejiang","Hangzhou");
      province.put("Fujian","Fuzhou");
      province.put("Hainan","Haikou");
      province.put("Taiwan","Taibei");
      province.put("Hongkong","Hongkong");
      province.put("Macau","Macau");
      province.put("Ningxia","Yinchuan");
      province.put("Shanghai","Shanghai");
      
      String input = JOptionPane.showInputDialog(null,"Enter a province","Input",JOptionPane.QUESTION_MESSAGE);
      while(!province.containsKey(input))
           {
              JOptionPane.showMessageDialog(null,"Input isn't a province's name!","Message",JOptionPane.ERROR_MESSAGE);
              input = JOptionPane.showInputDialog(null,"Enter a province","Input",JOptionPane.QUESTION_MESSAGE);
           }
      String answer = province.get(input);
      JOptionPane.showMessageDialog(null,input + "'s capital is " +answer,"Message",JOptionPane.INFORMATION_MESSAGE);
  }    
}
 