public class Automovil {
   private int velocity, 
               passengers;
   private boolean ignition;
   
   // Declaring variables
   Automovil() {
      velocity = 0;
      passengers = 4;
      ignition = false;
   }
   Automovil(int v,int p, boolean i) {
      velocity = v;
      passengers = p;
      ignition = i;
   }
  
  // Methods
   void ignite() { // Changes state of ignition
      if (ignition) {
         ignition = false;
      } else {
         ignition = true;
      }
   }
      
   void accelerate() { // Raises objects velocity by 5
      velocity += 5;
   }
   void accelerate(int i) {// Raises velocity by paremter
      velocity += i;
   }
   
   void setVelocity(int v) {// Manualy set the velocity
      velocity = v;
   }
   int getVelocity() {// returns velocity
      return velocity;
   }
  
   void setPassengers(int p) {// Manually set passengers
      passengers = p;
   }
   int getPassengers() {// returns passengers
      return  passengers;
   }
  
   public String toString() {// Default method. Ouputs stats
      return ("Velocity = "+ velocity +
              "\nPassengers = "+ passengers +
              "\nIgnition = "+ ignition + "\n\n");
   }
}

// Class containing main method
class Drive {
   public static void main (String [] args) {
      //Creating objects of the class
      Automovil car1 = new Automovil();
      Automovil car2 = new Automovil();
      
      System.out.print("First Car: \n"+ car1 +
                       "Second Car: \n"+ car2 + "\n\n");
      // Ignite method to turn on the cars
      car1.ignite();
      car2.ignite();
      System.out.println("## Igniting the cars ##");
      System.out.print("First Car: \n"+ car1 +
                       "Second Car: \n"+ car2 + "\n\n");
      // Both accelerate methods
      car1.accelerate();
      car2.accelerate(10);
      System.out.println("## Accelerating cars ##");
      System.out.print("First Car: \n"+ car1 +
                       "Second Car: \n"+ car2 + "\n");
                       
      // Setting velocity and passengers manually
      System.out.print("Changin the velocity and passengers. . . \n");
      car1.setVelocity(78);
      car2.setPassengers(2);
      System.out.println("getVelocity() and getPassengers()");
      System.out.println("First car's velocity = "+ car1.getVelocity());
      System.out.println("Second car's passengers = "+ car2.getPassengers());
   }
}