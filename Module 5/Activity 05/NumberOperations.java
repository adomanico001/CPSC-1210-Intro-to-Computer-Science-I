/**
 * This program outputs a series of odd numbers as well as
 * powers of 2 according to user input.
 *
 * Module 5 - Activity 5
 * @author Addie Domanico - CPSC 1210 - AO1
 * @version 02/16/2023
 */

/**
 * Initiates class NumberOperations.
 */
public class NumberOperations {
   private int number;
   
   /**
    * Constructor.
    * @param numberIn - int NumberIn
    */
   public NumberOperations(int numberIn) {
      this.number = numberIn;
   }
   /**
    * Accessor.
    * @return - Returns nummber.
    */
   public int getValue() {
      return number;
   }

   /**
    * String oddsUnder.
    * @return - returns all odd numbers under input number 
    */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   /**
    * String powersTwoUnder - displays powers of 2 under input number.
    * @return - returns the output
    */
   public String powersTwoUnder() {
      int powers = 1;
      String output = "";
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   /**
    * The numbers compare according to greater value.
    * @param compareNumber - compares numbers accordingly
    * @return - return output accordingly
    */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   /**
    * String output.
    * @return - returns number
    */
   public String toString() {
      return number + " ";
   }
}