/**
 * A program that calculates area of square inches into a combination
 * of acres, square yards, square feet, and square inches.
 *
 * Module 2 Project 2
 * @author Addie Domanico - CPSC 1210 - A01
 * @ version 1/27/2023
 */
 
import java.util.Scanner;
   /**
    * Import scanner.
    */
    
public class SquareUnits {
   /**
    * Print the result of the calculation from user input.
    * @param args - Standard command line arguments.
    */
    
   public static void main(String[] args) {
      /**
       * Outputs a specified calculation.
       */
       
      Scanner userInput = new Scanner(System.in);
      int squareInches = 0;
      int acres = 6272640;
      int squareYards = 1296;
      int squareFeet = 144;
      
      //Prompt user for an area in square inches:
      System.out.print("Enter the area in square inches: ");
      squareInches = userInput.nextInt();
      
      //Print if square inches exceed one billion in value
      if (squareInches > 1000000000L) {
         System.out.println("Limit of 1,000,000,000 square inches exceeded!");
      }
      
      //Print if values are computable
      else {
         //Calculates area of square inches:
         acres = squareInches / 6272640;
         squareInches %= 6272640;
         squareYards = squareInches / 1296;
         squareInches %= 1296;
         squareFeet = squareInches / 144;
         squareInches %= 144;
         System.out.println("Number of Units:");
         System.out.println("\tAcres: " + acres);
         System.out.println("\tSquare Yards: " + squareYards);
         System.out.println("\tSquare Feet: " + squareFeet);
         System.out.println("\tSquare Inches: " + squareInches);
      }
   }
}