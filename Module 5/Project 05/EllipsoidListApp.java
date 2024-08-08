/**
 * A program that outputs axes for an Ellipsoid.
 * Module 4 Project 4
 * @author Addie Domanico - CPSC 1210 - A01
 * @version 02/10/2023
 */
 
/**
 * Imports Scanner.
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
   /**
    * Class for EllipsoidListApp.
    */ 
public class EllipsoidListApp {
   /**
    * Class for EllipsoidApp.
    * @param args - Standard command line arguments.
    * @throws FileNotFoundException - Throws except if the file is not found.
    */
   public static void main(String[] args) throws FileNotFoundException {
      /**
       * A scanner object is created to read filename.
       */
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      scan.close();
      System.out.println();
      
      ArrayList<Ellipsoid> myList = new ArrayList<Ellipsoid>();
      Scanner scanFile = new Scanner(new File(fileName));
      
      String name = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
      
         String ename = scanFile.nextLine();
         double a = scanFile.nextDouble();
         double b = scanFile.nextDouble();
         double c = scanFile.nextDouble();
         
         if (scanFile.hasNext()) {
            scanFile.nextLine();
            myList.add(new Ellipsoid(ename, a, b, c));
         }
      }
      
      scanFile.close();
      
      EllipsoidList myEllipsoidList = new EllipsoidList(name, myList);
      
      System.out.println(myEllipsoidList);
      
      System.out.println(myEllipsoidList.summaryInfo());
   }
}