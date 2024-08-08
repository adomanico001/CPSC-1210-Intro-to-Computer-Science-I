/**
* A program that prints user name, age, and location information.
* 
* Module 4 Activity 04
* @author Addie Domanico - CPSC 1210 - AO1
* @version 02/08/2023
*/

public class UserInfoDriver {
   /**
   * A program that prints user information.
   * @param args - Standard command line arguments.
   */
   public static void main(String[] args) {
      /**
      * Prints user name, age, location.
      */
      
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}