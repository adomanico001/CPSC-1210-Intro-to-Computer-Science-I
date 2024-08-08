/**
 *
 *
 *
 *
 */
 
 /**
  * Import DecimalFormat and ArrayList.
  */
import java.text.DecimalFormat;
import java.util.ArrayList;
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
   public EllipsoidList(String listNameIn, ArrayList<Ellipsoid> eListIn) {
      listName = listNameIn;
      eList = new ArrayList<Ellipsoid>();
      
      for (Ellipsoid e : eListIn) {
         eList.add(e);
      }
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
      return eList.size();
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
}