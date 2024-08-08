/**
 * A program that defines specific Ellipsoid objects.
 * Module 4 Project 4
 * @author Addie Domanico - CPSC 1210 - A01
 * @version 02/10/2023
 */

import java.text.DecimalFormat;

/**
 * A program that creates an ellipsoid and takes user input.
 */

public class Ellipsoid {
   /**
    * Initiates the class Ellipsoid.
    */
   private String label = "";
   private double a = 0;
   private double b = 0;
   private double c = 0;

   /**
    * Public class for Ellipsoid.
    * @param labelIn - String label for Ellipsoid.
    * @param aIn - double aIn.
    * @param bIn - double bIn.
    * @param cIn - double cIn.
    */
   // constructor
   public Ellipsoid(String labelIn, double aIn, double bIn, double cIn) {
      setLabel(labelIn);
      setA(aIn);
      setB(bIn);
      setC(cIn);
   }

   /**
    * String method.
    * @return - label for String.
    */
    
   // accessors
   public String getLabel() {
      return label;
   }
   
   /**
    * Boolean for label.
    * @param labelIn - labelIn for String.
    * @return true - return if boolean is true.
    */
   public boolean setLabel(String labelIn) {
      if (labelIn == null) {
         return false;
      }
      else {
         label = labelIn.trim();
         return true;
      }
   }

   /**
    * Double getA method.
    * @return - returns double a.
    */
   public double getA() {
      return a;
   }
   
   /**
    * Boolean setter.
    * @param aIn - double aIn setter.
    * @return true - boolean returns true.
    */
   public boolean setA(double aIn) {
      if (aIn > 0) {
         a = aIn;
         return true;
      }
      else {
         return false;
      }
   }

   /**
    * Accessor for double getB.
    * @return - returns double b.
    */
   public double getB() {
      return b;
   }
   
   /**
    * Boolean for double bIn.
    * @param bIn - double bIn.
    * @return true - boolean returns true.
    */
   public boolean setB(double bIn) {
      if (bIn > 0) {
         b = bIn;
         return true;
      }
      else {
         return false;
      }
   }

   /**
    * Accessor for method.
    * @return - returns double c.
    */
   public double getC() {
      return c;
   }
   
   /**
    * Boolean for double cIn.
    * @param cIn - double for boolean.
    * @return - returns true.
    */
   public boolean setC(double cIn) {
      if (cIn > 0) {
         c = cIn;
         return true;
      }
      else {
         return false;
      }
   }


   // volume calculation
   /**
    * Volume calculation.
    * @return - returns calculation.
    */
   public double volume() {
      double volume = 4.0 / 3.0 * Math.PI * a * b * c;
      return volume;
   }


   // surface area calculation
   /**
    * Surface area calculation.
    * @return - returns surface area calculation.
    */
   public double surfaceArea() {
      return 4.0 * Math.PI * Math.pow((Math.pow(a * b, 1.6)
             + Math.pow(a * c, 1.6) + Math.pow(b * c, 1.6)) / 3.0, 1.0 / 1.6);
   }

   // toString method

   /**
    * Outputs labelIn for Ellipsoid description.
    * @return labelIn - returns labelIn.
    */
   public String toString() {
      DecimalFormat decimalFormat = new DecimalFormat("#,##0.0###");
      return "Ellipsoid" + " " + "\"" + getLabel() + "\"" + " with axes a = "
             + decimalFormat.format(a) + ", b = " + decimalFormat.format(b)
             + ", c = " + decimalFormat.format(c) + " units has: \n\tvolume = "
             + decimalFormat.format(volume())
             + " cubic units\n\tsurface area = "
             + decimalFormat.format(surfaceArea()) + " square units";
   }
}