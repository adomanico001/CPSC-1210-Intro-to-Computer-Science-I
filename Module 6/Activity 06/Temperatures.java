/**
 * A program that interacts with user input temperatures.
 * Module 6 Activity 6
 * @author Addie Domanico - CPSC 1210 - AO1
 * @version - 02/23/2023
 */

import java.util.ArrayList;

/**
 * Creates a class Temperatures.
 */
public class Temperatures {  
   /**
    * Constructor.
    */
   private ArrayList<Integer> temperatures;
    
    /**
     * Constructor.
     * @param temperaturesIn - ArrayList
     */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   
   /**
    * Accessor - getLowTemp.
    * @return - the lowest temperature
    */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      
      return low;
   }
   
   /**
    * Accessor - getHighTemp.
    * @return - the highest temperature
    */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      
      return high;
   }
   
   /**
    * Method for lowerMinimum.
    * @param lowIn - receives low temp integer
    * @return - finds the lower of the two temperatures
    */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
   /**
    * Method for higherMaximum.
    * @param highIn - receives high temp integer
    * @return - finds the highest of the two temperatures
    */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
   /**
    * Method for toString.
    * @return - temperatures in a String format
    */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}