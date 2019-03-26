import java.awt.*;
import java.applet.*;
import java.util.*;
 
public class FallAnimation extends java.applet.Applet {
   
   Image img1;
   
   void drawWithDelay(Graphics g, Image img, int xpos, int ypos, int delay) {
      
      g.drawImage(img, xpos,ypos,600,450,this);
      
      try{
         Thread.sleep(delay);
      }
      catch(InterruptedException e) {
      }
   }
   
   public void init() {
      setBackground(Color.blue);
   }
   
   public void start() {
   }
   public void paint(Graphics g) {
      for (int i=1; i <=13; i++) {
         if (i < 10) {
            img1 = getImage(getCodeBase(), "fall0"+i+".png");   
         } else {
            img1 = getImage(getCodeBase(), "fall"+i+".png");
         }
         drawWithDelay(g,img1,0,0,400);
      }
   }
}

