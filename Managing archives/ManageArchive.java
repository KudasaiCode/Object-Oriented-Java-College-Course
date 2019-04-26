

import java.io.*;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

 public class ManageArchive {
   public static void main (String [] args) {
      // Declaring variables
      Scanner keyboard = new Scanner(System.in);
      FileReader reader;
      Scanner fileInput;
      PrintWriter fileOutput;
      String strLine;
      int option = 1;
      
      while(option != 0) {
      try {
         reader = new FileReader("input.txt");
         fileInput = new Scanner(reader);
         
         while(fileInput.hasNext()) {
            strLine = fileInput.next();
            System.out.println(strLine);
         }  fileInput.close();
         
         fileOutput = new PrintWriter("output.txt");
         fileOutput.println("First line in the archive.");
         fileOutput.println("Second line in the archive.");
         fileOutput.close();
      } catch (IOException e) {
         System.out.println("I/O Error.");
      }
      
      System.out.println("\n1 to continue\n2 to exit");
      System.out.println("Option: ");
      option = keyboard.nextInt();
      }
      
   }
}