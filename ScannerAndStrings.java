//Author: Jeremy Del Valle
//Date: 2/14/19
//ScannerAndStrings.java
//Takes different input types from user and prints them
// in reverse order. 

import java.util.Scanner;

public class ScannerAndStrings {
   public static void main(String [] args){
      //Creating object of the Scanner class
      Scanner teclado = new Scanner(System.in);
   
      //Creating variables
      String stringNoSpace, 
             stringWithSpace;    
      int varInt;
      boolean varBool;
      float varFloat;
      double varDouble;
      
      //Takes decimal value input and stores it in variable as type Double
      System.out.print("Enter a decimal value (double): ");
      varDouble = teclado.nextDouble();
      
      //Takes decimal value as input
      System.out.print("\nEnter a decimal value (float): ");
      varFloat = teclado.nextFloat(); 
  
      //Takes integer as input
      System.out.print("\nEnter an integer: ");
      varInt = teclado.nextInt();

      //Takes true or false as input
      System.out.print("\nEnter true or false: ");
      varBool = teclado.nextBoolean();    

      //Takes one word as input and stores it in variable
      System.out.print("\nEnter one word: ");
      stringNoSpace = teclado.next();
            
      //Takes entire sentece as input and stores it in variable      
      System.out.print("\nEnter a sentence: ");
      teclado.nextLine();
      stringWithSpace = teclado.nextLine();
      
      //Prints user inputs in reverse order
      System.out.print("\n\nThe sentence : " + stringWithSpace +
                      "\nThe word value : " + stringNoSpace +
                      "\nThe boolean value : " + varBool +
                      "\nThe integer value : " + varInt + 
                      "\nThe float value: " + varFloat +
                      "\nThe double value: " + varDouble);
                      
   }
}