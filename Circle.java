// Author: Jeremy Del Valle
// Due: March 20, 2019
// Circle.java
/**
* Class that calculates the 
* area and perimeter given the radius.
*/

import java.lang.Math; // For numerical operations

public class Circle {
   // Declaring variables
   private double area,
                 radius, 
                 perimeter;
   // Constructors      
   Circle() {
      radius = 5;
   }   
   Circle(double r) {
      radius = r;
   }
   
   // Methods
   void setRadius(double r) { // Manually set radius
      radius = r;
   }
   
   double getRadius() {// Returns radius
      return radius;
   }
   
   double getArea() {// returns Area
      return area = Math.PI * Math.pow(radius, 2);
   }
   
   double getPerimeter() {// returns Perimeter
      return perimeter = 2 * Math.PI * radius;
   }
   
   public String toString() {// Default method.
      return ("Radius: " +getRadius() + "\nArea: "+getArea()+ "\nPerimeter: "+getPerimeter());
   }

}

// Class that contains main method
class Main {
   public static void main (String [] args) {
      // Creating objects of the circle class
      Circle one = new Circle();
      Circle two = new Circle(10);
      
      // Displays toString() method
      System.out.println("Circle one: \n"+one + "\n");    
      System.out.println("Circle two: \n"+two);    
      
      // Manually change the radius
      one.setRadius(50.2);
      two.setRadius(60.2);
      
      // Displays new radius
      System.out.println("\nCircle one radius: "+one.getRadius());    
      System.out.println("Circle two radius : "+two.getRadius());  
  }
}