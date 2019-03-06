import java.lang.Math;

public class Circle {
   private double area,
                 radius, 
                 perimeter;
         
   Circle() {
      radius = 5;
   }   
   Circle(double r) {
      radius = r;
   }
   
   double area() {
      return area = Math.PI * Math.pow(radius, 2);
   }
   
   double perimeter() {
      return perimeter = 2 * Math.PI * radius;
   }
   
   public String toString() {
      if ((area == 0) || (perimeter == 0)) {
         area();
         perimeter();
      }
      return ("Area: "+area+ "\nPerimeter: "+perimeter);
   }

}

class Main {
   public static void main (String [] args) {
      Circle one = new Circle();
      Circle two = new Circle(10);
      
      System.out.print(one);                       
   }
}