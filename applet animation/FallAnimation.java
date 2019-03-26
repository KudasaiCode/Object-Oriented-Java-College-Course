// Athor: Jeremy Del Valle
// Due: 3/27/2019
// FallAnimation.java
/*
* frame by frame animation
* of a Game of Thrones character
* falling from the tower.
*/

// Imports necessary packages
import java.awt.*;
import java.applet.*;
import java.util.*;
 
public class FallAnimation extends java.applet.Applet { // Begin Class
   
   Image img1; // from awt. Accepts image file formats through getImage()
   
   void drawWithDelay(Graphics g, Image img, int xpos, int ypos, int delay) { // Method that does the animation
      
      g.drawImage(img, xpos,ypos,550,450,this);
      
      try{
         Thread.sleep(delay); // Delays run in miliseconds
      }
      catch(InterruptedException e) {
      }
   }
   
   public void init() { // initiates the applet pannel
      setBackground(Color.blue);
   }
   
   public void start() { // Allow thread to begin
   }
   
   public void paint(Graphics g) {// method that recursively calls first method
      for (int i=2; i <=13; i++) {
         if (i < 10) { 
            img1 = getImage(getCodeBase(), "fall0"+i+".png");   
         } else {
            img1 = getImage(getCodeBase(), "fall"+i+".png");
         }
         drawWithDelay(g,img1,-20,0,250);
      }
   }
} // end class

