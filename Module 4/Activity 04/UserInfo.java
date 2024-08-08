/** 
 * A simple program that creates a class.
 *
 * Module 4 - Activity 4
 * @author Addie Domanico - CPSC 1210 - AO1
 * @version 02/08/2023
 */

public class UserInfo {
   /**
   * A class for User Information details.
   * @param firstNameIn - receives user input for first name.
   * @param lastNameIn - receives user input for last name.
   */
   
   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
   
   // constructor
   public UserInfo(String firstNameIn, String lastNameIn) {
      /**
      * Creates the constructor to receive input for first and last names.
      * @return output - returns the output.
      */
      
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   
   // methods
   public String toString() {
      /**
      * Outputs the information received from user.
      * @param locationIn - sets the location.
      */
      
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: " + status;
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
   
   public void setLocation(String locationIn) {
   /**
   * A method that sets the location from user input.
   */
      location = locationIn;
   }
   
   public boolean setAge(int ageIn) {
   /**
   * A method that sets the value of the age.
   */
   
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      
      return isSet;
   }
   
   public int getAge() {
   /**
   * A method that returns the age of the user input.
   */
      return age;
   }
   
   public String getLocation() {
   /**
   * A method that returns the location of the user.
   */
      return location;
   }
   
   public void logOff() {
   /**
   * Allows the user to log off.
   */
      status = OFFLINE;
   }
   
   public void logOn() {
   /**
   * Allows the user to log on.
   */
      status = ONLINE;
   }
}