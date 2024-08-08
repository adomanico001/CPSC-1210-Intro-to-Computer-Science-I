/**
 * A simple program that displays several different personal statistics.
 *
 * Module 2 Activity 2
 * @author Addie Domanico - CPSC 1210 - AO1
 * @version 1/25/2023
 */
 
import java.util.Scanner;
   /**
    * Import scanner.
    */
   
public class AgeStatistics {
  /**
   * Receives user input for name, age, and gender.
   * @param args - Standard command line arguments.
   */
    
   public static void main(String[] args) {
     /**
      * Outputs a max heart rate according to user's age and gender.
      */
    
      Scanner userInput = new Scanner(System.in);
      String name = " ";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      //Prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      //Prompt the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      //Prompt the user for their gender:
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      //Convert age:
      System.out.println("\tYour age in minutes is " + ageInYears * 525600 
         + " minutes.");
      System.out.println("\tYour age in centuries is " 
         + (double) ageInYears / 100 + " centuries.");
      
      //Display max heart rate:
      System.out.print("Your max heart rate is ");
      if (gender == 1) { //calculate female MHR
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
         
      else { //calculate male MHR
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
       
      System.out.println(maxHeartRate + " beats per minute.");
         
   }
}
