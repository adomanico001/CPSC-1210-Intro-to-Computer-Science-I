/**
 * A program that outputs axes for an Ellipsoid.
 * Module 4 Project 4
 * @author Addie Domanico - CPSC 1210 - A01
 * @version 02/10/2023
 */
 
/**
 * Imports Scanner.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
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
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String filename = keyboard.nextLine();
      keyboard.close();
      System.out.println();
      
      ArrayList<Ellipsoid> elist = new ArrayList<Ellipsoid>();
      Scanner infile = new Scanner(new File(filename));
      String name = infile.nextLine();
      
      while (infile.hasNext()) {
         String ename = infile.nextLine();
         double a = infile.nextDouble();
         double b = infile.nextDouble();
         double c = infile.nextDouble();
         
         if (infile.hasNext()) {
            infile.nextLine();
         }
         
         elist.add(new Ellipsoid(ename, a, b, c));
      }
      
      infile.close();
      
      EllipsoidList app = new EllipsoidList(name, elist);
      System.out.println(app.toString());
      System.out.println();
      System.out.println(app.summaryInfo());
   }
}