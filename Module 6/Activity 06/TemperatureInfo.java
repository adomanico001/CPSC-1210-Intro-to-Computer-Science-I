/**
 * A program that interacts with temperature info.
 * Module 6 Activity 6
 * @author Addie Domanico - CPSC 1210 - AO1
 * @version - 02/23/2023
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Creates class TemperatureInfo.
 */
public class TemperatureInfo {
/**
 * Main method.
 * @param args - Standard command line arguments.
 */

   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
   
      ArrayList<Integer> tempsList = new ArrayList<>();
   
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
      
      Temperatures temps = new Temperatures(tempsList);
      
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, " 
            + "[H]igh temp, [P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
               
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
               
            case 'P':
               System.out.println(temps);
               break;
               
            case 'E':
               System.out.println("\tDone");
               break;
               
            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
      userInput.close();
   }
}
