/**
 * A program that defines specific Ellipsoid objects.
 * Module 6 Project 6
 * @author Addie Domanico - CPSC 1210 - A01
 * @version 02/25/2023
 */
 
 /**
  * Import DecimalFormat, ArrayList, etc.
  */
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Creates a class ELlipsoidList.
 */
public class EllipsoidList {

   private String listName;
   private ArrayList<Ellipsoid> eList;
   
   /**
    * Create an EllipsoidList object.
    * @param listNameIn - String listName
    * @param eListIn - for ellipsoidList
    */
   public EllipsoidList(String listNameIn, 
      ArrayList<Ellipsoid> eListIn) {
      listName = listNameIn;
      eList = eListIn;
      //ellipsoidList = new ArrayList<Ellipsoid>();
      
      // for (Ellipsoid e : eListIn) {
         //eList.add(e);
      //}
   }
   /**
    * String method to access name.
    * @return - returns list.
    */
   public String getName() {
      return listName;
   }
   
   /**
    * Method for the number of ellipsoids.
    * @return - returns the size of an ellipsoid list.
    */
   public int numberOfEllipsoids() {
      if (eList.size() != 0) {
         return eList.size();
      }
      else {
         return  0;
      }
   }
   /**
    * Method for totalVolume.
    * @return - returns the total volume.
    */
   public double totalVolume() {
      double total = 0;
      for (Ellipsoid e : eList) {
         if (e != null) {
            total += (e.volume());
         }
      }  
      
      return total;
   }
   
   /**
    * Method for total surface area.
    * @return - returns the total surface area.
    */
   public double totalSurfaceArea() {
      double total = 0;
      
      for (Ellipsoid e : eList) {
         if (e != null) {
            total += (e.surfaceArea());
         }
      }
      return total;
   }
   
   /**
    * Method for average volume.
    * @return - total volumbe divided by number of ellipsoids.
    */
   public double averageVolume() {
      if (this.numberOfEllipsoids() == 0) {
         return 0;
      }
      
      else {
         return this.totalVolume() / this.numberOfEllipsoids();
      }
   }
   /**
    * Method for average of surface area.
    * @return - returns the total surface area divided by number of ellipsoids.
    */
   public double averageSurfaceArea() {
      if (this.numberOfEllipsoids() == 0) {
         return 0;
      }
      
      else {
         return this.totalSurfaceArea() / this.numberOfEllipsoids();
      }
   }
   
   /**
    * Method for string.
    * @return - returns the result of the string.
    */
   public String toString() {
      String result = getName() + "\n";
      int index = 0;
      
      while (index < eList.size()) {
         result += "\n" + eList.get(index) + "\n";
         index++;
      }
      
      return result;
   }
   
   /**
    * Method to access the summar information.
    * @return - returns results.
    */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.###");
      String result = "";
      result += "\n";
      result += "----- Summary for " + getName() + " -----";
      result += "\nNumber of Ellipsoid Objects: " + numberOfEllipsoids();
      result += "\nTotal Volume: " + df.format(totalVolume()) + " cubic units";
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea())
         + " square units";
      result += "\nAverage Volume: " + df.format(averageVolume())
         + " cubic units";
      result += "\nAverage Surface Area: " + df.format(averageSurfaceArea())
         + " square units";
      
      return result;
   }
   
   /**
    * Method to access ArrayList.
    * @return - returns the list of ellipsoids.
    */
   public ArrayList<Ellipsoid> getList() {
      return eList;
   }
    
    /**
     * readFile method.
     * @param eFileNameIn - input file name
     * @throws FileNotFoundException - if file is not found
     * @return - returns eL
     */
   public EllipsoidList readFile(String eFileNameIn) throws 
      FileNotFoundException {
      Scanner readFile = new Scanner(new File(eFileNameIn));
      ArrayList<Ellipsoid> myNewList = new ArrayList<Ellipsoid>();
      String eListName = "";
      
      listName = readFile.nextLine();
      
      while (readFile.hasNext()) {
         String label = readFile.nextLine();
         double a = Double.parseDouble(readFile.nextLine());
         double b = Double.parseDouble(readFile.nextLine());
         double c = Double.parseDouble(readFile.nextLine());
         
         Ellipsoid e = new Ellipsoid(label, a, b, c);
         myNewList.add(e);
      }
      
      EllipsoidList eL = new EllipsoidList(listName, myNewList);
      return eL;
   }
   
   /**
    * addEllipsoid method.
    * @param labelIn - string label
    * @param aIn - double a
    * @param bIn - double b
    * @param cIn - double c
    */
   public void addEllipsoid(String labelIn, double aIn, double bIn,
      double cIn) {
      Ellipsoid e = new Ellipsoid(labelIn, aIn, bIn, cIn);
      eList.add(e);
   }
    
    /**
     * findEllipsoid method.
     * @param labelIn - string label
     * @return - returns the result
     */
   public Ellipsoid findEllipsoid(String labelIn) {
      Ellipsoid result = null;
      
      for (int i = 0; i < eList.size(); i++) {
         if (eList.get(i).getLabel().equalsIgnoreCase(labelIn)) {
            result = eList.get(i);
            break;
         }
      }
      
      return result;
   }
   
    /**
     * deleteEllipsoid method.
     * @param eLabelIn - string label
     * @return - returns result
     */
   public Ellipsoid deleteEllipsoid(String eLabelIn) {
      Ellipsoid result = findEllipsoid(eLabelIn);
      
      if (result != null) {
         eList.remove(result);
      }
      return result;
   }
    /**
     * Method editEllipsoid.
     * @param eLIn - edit ellipsoid label
     * @param eAIn - edit double a
     * @param eBIn - edit double b
     * @param eCIn - edit double c
     * @return - return true and false
     */
   public boolean editEllipsoid(String eLIn, double eAIn, 
      double eBIn, double eCIn) {
      Ellipsoid result = null;
   
      for (int i = 0; i < eList.size(); i++) {
         if (eList.get(i).getLabel().equalsIgnoreCase(eLIn)) {
            result = eList.get(i);
            eList.get(i).setA(eAIn);
            eList.get(i).setB(eBIn);
            eList.get(i).setC(eCIn);
            return true;
         }
      }
      return false;
   }
}