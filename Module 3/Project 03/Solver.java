/**
 * A program that solves a specified equation, as well as
 * determines the # of characters left and right of the decimal point.
 *
 * Module 3 Project 3
 * @author Addie Domanico - CPSC 1210 - AO1
 * @version 02/01/2023
 */

import java.util.Scanner;
   /**
    * Imports scanner.
    */
    
import java.text.DecimalFormat;
   /**
    * Imports DecimalFormat to format numbers.
    */

public class Solver {
   /**
    * A program that calculates a formatted result of user input.
    * @param args - Standard command line arguments.
    */
    
   public static void main(String[] args) {
      /**
       * Finds the number of characters left and right of decimal point.
       */
     
     //User input  
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter a value for x: ");
      double x = userInput.nextDouble();
      //Calculates the equation
      double result = (Math.sqrt(Math.abs(11 * Math.pow(x, 4)
         + 9 * Math.pow(x, 3) + 7 * Math.pow(x, 2) + 5 * x + 4)));
      result /= (2 * x + 4);
      
      String stringResult = String.valueOf(result);
      //Finds the position of the decimal point
      int position = stringResult.indexOf(".");
      int l = stringResult.length();
      String stringResult1 = stringResult.substring(0, position);
      String stringResult2 = stringResult.substring(position + 1, l);
      System.out.println("Result: " + stringResult);
      //Outputs the number of characters left of the decimal point
      System.out.println("# of characters to left of decimal point: "
         + stringResult1.length());
      //Outputs the number of characters right of the decimal point
      System.out.println("# of characters to right of decimal point: "
         + stringResult2.length());
      //Creates new format for number
      DecimalFormat df = new DecimalFormat("#,##0.0####");
      //Outputs the formatted result of user's number
      System.out.println("Formatted Result: " + df.format(result));
   }
}