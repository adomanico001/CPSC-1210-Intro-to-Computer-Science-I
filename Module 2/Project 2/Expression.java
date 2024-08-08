/**
 * A program that finds the result of a specified equation.
 * 
 * Module 2 Project 2
 * @author Addie Domanico - CPSC 1210 - AO1
 * @version 1/26/2023
 */
 
import java.util.Scanner;
   /**
    * Import scanner.
    */
    
public class Expression {
   /**
    * Print the result of the equation from user input.
    * @param args - Standard command line arguments.
    */
    
   public static void main(String[] args) {
      /**
       * Outputs a specified expression.
       */
       
      Scanner userInput = new Scanner(System.in);
      double numberOne = 0;
      double numberTwo = 0;
      
      //Desired equation to be computed:
      System.out.println("result = (10x + 32.6) (5y - 1.567) / xy");
      
      //Prompt the user for value x:
      System.out.print("\tx = ");
      numberOne = userInput.nextDouble();
      
      //Prompt the user for value y:
      System.out.print("\ty = ");
      numberTwo = userInput.nextDouble();
      
      //Print if divisor is equal to 0 and result is undefined
      if (numberOne * numberTwo == 0) {
         System.out.println("result is \"undefined\"");
      }
      
      //Print if values are computable
      else {
         double result = ((10 * numberOne) + 32.6) 
            * +((5 * numberTwo) - 1.567) / (numberOne * numberTwo);
         System.out.println("result = " + result);
      }
   }
}
