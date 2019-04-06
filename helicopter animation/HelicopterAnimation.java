// Author: Jeremy Del Valle
// Due: 4/6/19
// HelicopterAnimation.java
/**
* Animates two helicopters racing each other
**/

import java.awt.*;
import java.applet.*;
import java.util.*;

class Helicopter {// Class to create drawn objects
   int x, 
       y;
   
   Helicopter() {// Default constructor
      x = 0;
      y = 0;
   }
   
   Helicopter(int inX, int inY) {// Editable constructor
      x = inX;
      y = inY;
   }
    
   void drawHeli(Graphics g, int x, int y) {// Draws the body of the helicopter
      /**
      * g = Graphics object
      * x = horizontal location of object
      * y = vertical location of object
      **/
      g.setColor(Color.black);
      g.fillRoundRect( 9+x, 0+y, 22, 18, 2, 2); // Body 
      g.fillRoundRect( (-5)+x, 5+y, 29, 5, 2, 2);  // Tail      
   } // drawHeli()
   
   void drawRotor(Graphics g, int x, int y) { // Draws the rotors
      g.setColor(Color.gray);
      g.fillRect( 19+x, (-5)+y, 3, 6); // Top Rotor
      g.drawLine( 11+x, (-6)+y, 30+x, (-6)+y);   
      g.drawLine( 0+x, 12+y, 0+x, 3+y); // Tail Rotor
   } // drawRotor()
   
   void delayMiliSecs(int delay) {// delays execution in ms
      try {
         Thread.sleep(delay);
      } catch (InterruptedException e) {
      }
   }
}

public class HelicopterAnimation extends java.applet.Applet {
   
   Image img;
   
   public void init() {
      //Helicopter h = new Helicopter();
      //h.delayMiliSecs(1000);
   }
   
   public void start() {// begins the applet
      // no code goes here
   }
   
   public void paint(Graphics g) {
      // create objects of Helicopter class
      Helicopter heli1 = new Helicopter();
      Helicopter heli2 = new Helicopter();
      
      img = getImage(getCodeBase(), "bg.png"); // Provides the background image
       
      for(int i = 0; i <= 400; i++) { // Draws the helicopters
         g.drawImage(img, 0, 0, 400, 400, this);
         heli1.drawHeli(g, 10 + i, 85);
         heli1.drawRotor(g,  10 + i, 85);
         
         heli2.drawHeli(g, (10 + i*2), 134);
         heli2.drawRotor(g, (10 + i*2), 134);
         
         heli1.delayMiliSecs(25);
         heli2.delayMiliSecs(25);
                
      }
   }
}// End