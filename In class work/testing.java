public class testing {
   // constructor
   testing() {
      System.out.print("I am testing");
   }
   // overloaded print methods
   static void print(int n) {
      System.out.println(n);
   }
   static void print(String s) {
      System.out.println(s);
   }
   
   // main method
   public static void main (String [] args) {
   
    testing test = new testing();
    String str = "\nhello world";
    print(str);
    test.print("hey");
    print(4);
    
    
   }
}

