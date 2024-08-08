/**
 * A program that exchanges letters in a String to encode a message.
 *
 * Module 3 Activity 3
 * @author Addie Domanico - CPSC 1210 - AO1
 * @version 02/01/2023
 */
 
import java.util.Scanner;
   /**
   * Import scanner.
   */
   
public class MessageConverter {
   /**
    * Print the encoded message created from user input.
    * @param args - Standard command line arguments.
    */
   
   public static void main(String[] args) {
      /**
       * Outputs the encoded message.
       */
       
      Scanner userInput = new Scanner(System.in);
      String message = "";
      int outputType;
      String result = "";
      
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      System.out.print("\nOutput types:"
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
      
      outputType = Integer.parseInt(userInput.nextLine());
      
      if (outputType == 0) { //as is
         result = message;
      }
      
      else if (outputType == 1) { //trimmed
         result = message.trim();
      }
      
      else if (outputType == 2) { //lowercase
         result = message.toLowerCase();
      }
      
      else if (outputType == 3) { //uppercase
         result = message.toUpperCase();
      }
      
      else if (outputType == 4) { //replaces vowels
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
      }
      
      else if (outputType == 5) { //without first and last characters
         result = message.substring(1, message.length() - 1);
      }
      
      else { //invalid input
         result = "Error: Invalid choice input.";
      }
      
      System.out.println("\n" + result);
   }
}