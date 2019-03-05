// Author: Jeremy Del Valle
// Due: March 8, 2019
// SinCos.java
/**
* Prints the sine and cosine of 
* degrees that are multiples of 5 up to 360
*/

import java.lang.Math;

public class SinCos {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int degree = 0;
      
      double sinNum, 
            cosNum, 
            radian;
      
      while (degree <= 360) {
         // Numerical Operations
         radian = Math.toRadians(degree);
         sinNum = Math.sin(radian);
         cosNum = Math.cos(radian);
         
         // Output of data
         System.out.format("sin(%3d) = %.3f and cos(%3d) = %.3f", degree, sinNum, degree, cosNum);
         System.out.println("");
         
         // Increment degree
         degree = degree + 5;
      }
   }
}