/**
 * A program that outputs event information based on user's date, time,
 * price, discount, section, row, seat, and event description input.
 *
 * Module 3 Project 3
 * @author Addie Domanico - CPSC1210 - AO1
 * @version 02/01/2023
 */
 
import java.util.Scanner;
   /**
    * Imports scanner.
    */
       
import java.text.DecimalFormat;
   /**
    * Imports DecimalFormat class for formatting numbers.
    */
   

public class Event {
      /**
       * Print event information, including actual cost, from user input.
       * @param args - Standard command line arguments.
       */
       
   public static void main(String[] args) {
         /**
          * Outputs the event information.
          */
      
      //Declaring the variables
      String date, time, section, row, seat, event, code;
      double eventPrice, eventDiscount, cost;
      int prizeNumber;
      
      //Using the scanner class for user input
      Scanner userInput = new Scanner(System.in);
      
      //DecimalFormat class formats numbers
      DecimalFormat df = new DecimalFormat("$#,##0.00");
          
      System.out.print("Enter your event code: ");
      code = userInput.nextLine().trim(); //Trims the extra spaces
      
      //Outputs error if code is less than 26 characters    
      if (code.length() < 26) {
         System.out.println("\nInvalid Event Code. \nEvent code"
            + " must have at least 26 characters.");
      }
      
      else {
      //Uses an index to take subparts of the string according to variable
         date = code.substring(0, 8);
         time = code.substring(8, 12);
         eventPrice = Double.parseDouble(code.substring(12, 15) + "."
            + (code.substring(15, 17)));
         eventDiscount = Double.parseDouble(code.substring(17, 19));
         section = code.substring(19, 21);
         row = code.substring(21, 23);
         seat = code.substring(23, 25);
         event = code.substring(25, code.length());
      
      //Calculates the cost after the discount is applied
         cost = eventPrice - (eventPrice * (eventDiscount / 100));
      
      //Calculates a random number between 1 to 9999
         prizeNumber = (int) (Math.random() * 10000 + 1);
      
      //Prints data information according to input
         System.out.print("\nEvent: " + event);
         System.out.print("   Date: " + date.substring(0, 2) + "/" 
            + date.substring(2, 4) + "/" + date.substring(4, 8));
         System.out.println("   Time: " + time.substring(0, 2) + ":"
            + time.substring(2, 4));
         System.out.print("Section: " + section);
         System.out.print("   Row: " + row);
         System.out.println("   Seat: " + seat);
      
      //Uses df to format the price
         System.out.print("Price: " + df.format(eventPrice)); 
      
      //Uses df to format the discount and final total cost
         df.applyPattern("0'%'");
         System.out.print("   Discount: " + df.format(eventDiscount));
         df.applyPattern("$#,##0.00");
         System.out.println("   Cost: " + df.format(cost));
      
      //Uses df to format the prize number
         df.applyPattern("0000");
         System.out.println("Prize Number: " + prizeNumber);
      }
   }
}