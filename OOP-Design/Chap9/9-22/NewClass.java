import javax.swing.JOptionPane;

  public class NewClass 
{
    public static void main(String[] args)
  {
      String[][] province = new String[34][2];
      province[0][0] = "Beijing";      province[0][1] = "Beijing";
      province[1][0] = "Tianjin";      province[1][1] = "Tianjin";
      province[2][0] = "Heilongjiang"; province[2][1] = "Haerbin";
      province[3][0] = "Jilin";        province[3][1] = "Changchun";
      province[4][0] = "Liaoning";     province[4][1] = "Shenyang";
      province[5][0] = "Hebei";        province[5][1] = "Shijiazhuang";
      province[6][0] = "He'nan";       province[6][1] = "Zhengzhou";
      province[7][0] = "Neimenggu";    province[7][1] = "Huhehaote";
      province[8][0] = "Shandong";     province[8][1] = "Ji'nan";
      province[9][0] = "Shanxi";       province[9][1] = "Taiyuan";
      province[10][0] = "Shan3xi";     province[10][1] = "Xi'an";
      province[11][0] = "Gansu";       province[11][1] = "Lanzhou"; 
      province[12][0] = "Xinjiang";    province[12][1] = "Wulumuqi";
      province[13][0] = "Tibet";       province[13][1] = "Lasha";
      province[14][0] = "Guizhou";     province[14][1] = "Guiyang";
      province[15][0] = "Qinghai";     province[15][1] = "Xining";
      province[16][0] = "Sichuan";     province[16][1] = "Chengdu";
      province[17][0] = "Yunnan";      province[17][1] = "Kunming";
      province[18][0] = "Chongqing";   province[18][1] = "Chongqing";
      province[19][0] = "Hubei";       province[19][1] = "Wuhan";
      province[20][0] = "Hu'nan";      province[20][1] = "Changsha";
      province[21][0] = "Guangxi";     province[21][1] = "Nanning";
      province[22][0] = "Guangdong";   province[22][1] = "Guangzhou";
      province[23][0] = "Jiangxi";     province[23][1] = "Nanchang";
      province[24][0] = "Anhui";       province[24][1] = "Hefei";
      province[25][0] = "Jiangshu";    province[25][1] = "Nanjing";
      province[26][0] = "Zhejiang";    province[26][1] = "Hangzhou";
      province[27][0] = "Fujian";      province[27][1] = "Fuzhou";
      province[28][0] = "Hainan";      province[28][1] = "Haikou";
      province[29][0] = "Taiwan";      province[29][1] = "Taibei";
      province[30][0] = "Hongkong";    province[30][1] = "Hongkong";
      province[31][0] = "Macau";       province[31][1] = "Macau";
      province[32][0] = "Ningxia";     province[32][1] = "Yinchuan";
      province[33][0] = "Shanghai";    province[33][1] = "Shanghai";
      
      int correctCount = 0;
      for( int i=0; i<=9; i++)
         {
            String randomProv = randomProvince(province);
            String input = JOptionPane.showInputDialog(null,"What is the capital of "+randomProv,"Input",JOptionPane.QUESTION_MESSAGE);
            String answer = correctOrNot(input,province,randomProv)? "correct": "wrong";
            JOptionPane.showMessageDialog(null,"Your answer is "+answer,"Message",JOptionPane.INFORMATION_MESSAGE);
            if( answer.equals("correct") ) correctCount++;
         }
      JOptionPane.showMessageDialog(null,"Correct count: "+correctCount+"/10","Summary",JOptionPane.INFORMATION_MESSAGE);
  }    
    
    public static String randomProvince(String[][] province)
  {
      int random = (int)( Math.random() * province.length );
      return province[random][0];
  }
    
    public static boolean correctOrNot(String input, String[][] province, String randomProv)
  {
      for( int i=0; i<=province.length-1; i++)
          if( input.equals(province[i][1]) ) return province[i][0].equals(randomProv)? true: false;   
      return false;
  }
}
 