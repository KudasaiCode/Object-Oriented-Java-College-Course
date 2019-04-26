


import java.util.*;

class Counter {
   int minimum, 
       maximum, 
       actValue;
   boolean cycleComplete;
   
   Counter(int min, int max) {
      minimum = min;
      maximum = max;
      actValue = minimum;
      cycleComplete = false;
   }
   
   void reset() {
      actValue = minimum;
   }
   
   void increment() {
      actValue++;
      if (actValue > maximum) {
         actValue = minimum;
         cycleComplete = true;
      }
   }
   
   int getActValue() {
      return actValue;
   }
   
   void setActValue(int value) {
      actValue = value;
   }
   
   boolean getCycleComplete() {
      return cycleComplete;
   }
   
   void resetCycle() {
      cycleComplete = false;
   }
   
   public String toString() {
      String result = "";
      if (actValue < 10) {
         result = "0" + actValue;
      } else {
         result = "" + actValue;
      }  
      return result;
   }
}

class CounterAmPm extends Counter {
   CounterAmPm() {
      super(0,1);
   }
   
   public String toString() {
      String am0pm;
      if (actValue == 0) {
         am0pm = "am";
      } else {
         am0pm = "pm";
      }
      return(am0pm);
   }
}

class CounterHours extends Counter {
   
   int prevValue;
   
   CounterHours() {
      super (1,12);
   }
   
   void increment() {
      actValue++;
      if (actValue == 12) {
         cycleComplete = true;
      } else if (actValue == 13) {
         actValue = 1;
      }
   }
}

class Watchito {
   Counter seconds = new Counter(0,59);
   Counter minutes = new Counter(0,59);
   Counter hours = new CounterHours();
   CounterAmPm ampm = new CounterAmPm();
   
   void increment() {
      seconds.increment();
      
      if (seconds.getCycleComplete()) {
         seconds.resetCycle();
         minutes.increment();
         
         if (minutes.getCycleComplete()) {
            minutes.resetCycle();
            hours.increment();
            
            if (hours.getCycleComplete()) {
               ampm.increment();
            }// endif
         }// endif
      }//endif
   }
   
   public String toString() {
      return (hours +":"+ minutes +":"+ 
              seconds + ampm);
   }
}

public class Watch {
   public static void main(String[] args) {
      long i;
      Watchito myWatch = new Watchito();
      
      for (i = 0; i<1000000; i++) {
         System.out.println("" + myWatch);
         myWatch.increment();
      }
   }
}