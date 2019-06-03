package Maps;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import javax.swing.*;


public class Map_Base extends JPanel{
      //ArrayList for store road
      public static ArrayList<ArrayList<Integer>> road=
            new ArrayList<ArrayList<Integer>>();
      public static ArrayList<Integer> value;
      int row;
      int col;
      
      
      ImageIcon rd = new ImageIcon("src/Image/길.png");
      Image rod=rd.getImage();
      ImageIcon bg = new ImageIcon("src/Image/baegyung.png");
      Image bag=bg.getImage();
      JLabel bb=new JLabel(bg);
      //Read external road data and save to array list
      static String nowPath = System.getProperty("user.dir")+"\\src\\Maps\\Map_1.txt";
      
   public Map_Base(){
      ReadRoad();
   }
      
   private void doDrawing(Graphics g) {
      //setBackground(Color.GREEN);   //background color to green
      //bb.setLocation(0,0);
      //bb.setSize(1280,720);
      //add(bb);
      
      Graphics2D g2d=(Graphics2D)g;
      FillRoad(g);
   }
   
   protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      doDrawing(g);
   }
   
   public void ReadRoad(){
      try {
      //   바이트씩 읽기
         InputStream fis=new FileInputStream(nowPath);
      //   한 글자씩 읽기
         InputStreamReader isr=new InputStreamReader(fis);
         BufferedReader br=new BufferedReader(isr);
         
         String line="";
         int num=0;
         while((line=br.readLine())!=null) {
            value=new ArrayList<Integer>();
            String[] dataArray=line.split(",");
            for(int i=0;i<dataArray.length;i++) {
               num=Integer.parseInt(dataArray[i]);
               value.add(num);
            }         
            road.add(value);
            //if(!value.isEmpty())col=value.size();
         }
         br.close();
      }catch(IOException e) {
         e.printStackTrace();
      }
   }
   
   public void FillRoad(Graphics g) {
      Graphics2D g2d=(Graphics2D)g;
      g2d.drawImage(bag, 0, 0, 1280, 720, this);
      //g2d.setColor(Color.yellow);
      //ImageIcon road=new ImageIcon("src/Image/길.png");
      //g2d.drawImage(road, this);
      row=road.size();
      col=value.size();
      //System.out.println("X"+col+" Y"+row);
      
      //First and second row and column are for default
      for(int j=2;j<row;j++) {
         for(int i=2;i<col;i++) {
            if(road.get(j).get(i)!=0) g2d.drawImage(rod,(i-2)*40,(j-2)*40,40,40, this);
         }
      }
      
      //g2d.setColor(Color.CYAN);
      //g2d.fillRect(40, 40, 40, 40);
   }
}