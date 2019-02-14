//Author: Jeremy Del vALLE
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
      
      //Takes entire sentece as input and stores it in variable
      System.out.print("Enter a sentence: ");
      stringWithSpace = teclado.nextLine();
      
      //Takes one word as input and stores it in variable
      System.out.print("\nEnter one word: ");
      stringNoSpace = teclado.next();
       
      //Takes integer as input
      System.out.print("\nEnter an integer: ");
      varInt = teclado.nextInt();
     
     //Takes true or false as input
      System.out.print("\nEnter true or false: ");
      varBool = teclado.nextBoolean();
     
     //Takes decimal value as input
      System.out.print("\nEnter a decimal value: ");
      varFloat = teclado.nextFloat(); 
    
     //Prints user inputs in reverse order
      System.out.print("\nThe float value is: " + varFloat +
                      "\nThe Boolean value is: " + varBool +
                      "\nThe integer value is: " + varInt + 
                      "\nThe worde: " + stringNoSpace +
                      "\nthe sentece: " + stringWithSpace);
                      
   }
}