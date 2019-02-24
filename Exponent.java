//Author: Jeremy Del Valle
//Due: 2/27/19
//Exponent.java
/*
Finds the exponent of the base and power provided 
by the user.
*/

// Imports
import static java.lang.Math.pow; // "pow(x, y) elevates x to the power of y
import javax.swing.*; // Allows the use of JOption panels to receive and display user inputs

public class Exponent {

   public static void main(String[] args) {
      // Declaring variables
      String strBase, 
             strPower;
             
      double base = 0, 
            power = 0, 
            result = 0;
            
      boolean retry = true;
      
      // Continues loop while it catches an exception
      while (retry) {
      
      // Prompts user to input the values to be used
         strBase = JOptionPane.showInputDialog("Enter the base:");
         strPower = JOptionPane.showInputDialog("Enter the power:");
      
      // Converts string types to double to allow numerical operations
         try {
            base = Double.parseDouble(strBase); 
            power = Double.parseDouble(strPower);
            
            result = pow(base, power);   // Uses Math.pow to elevate base ^ power  
            retry = false; // Breaks loop
            
         } catch (Exception e) {         
            JOptionPane.showMessageDialog(null, "String cannot be converted to int.\nTry again.", 
                                       "ERROR", 
                                       JOptionPane.PLAIN_MESSAGE);
            retry = true; // Continues loop
         }
      } // while loop ends
      
      JOptionPane.showMessageDialog(null, base + "^" + power + " = " + result, 
                                    "Operation Results", 
                                    JOptionPane.PLAIN_MESSAGE);
   }

}
