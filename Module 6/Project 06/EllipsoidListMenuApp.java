import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Creates class EllipsoidListMenuApp.
 */
public class EllipsoidListMenuApp {      
   /**
    * Main method.
    * @param args - Standard commandline arguments
    * @throws FileNotFoundException - exception if file is not found
    */
   public static void main(String[] args) throws FileNotFoundException {
      String elistName = "*** no list name assigned ***";
      String eLabel = "";
      String eCode = "";
      String eFileName = "";
      String eLabelIn = "";
      double eA = 0;
      double eB = 0;
      double eC = 0;
      double eAIn = 0;
      double eBIn = 0;
      double eCIn = 0;
      ArrayList<Ellipsoid> myList = new ArrayList<Ellipsoid>();
      EllipsoidList myEList = new EllipsoidList(elistName, myList);
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Ellipsoid List System Menu\n"
         + "R - Read File and Create Ellipsoid List\n"
         + "P - Print Ellipsoid List\n"
         + "S - Print Summary\n"
         + "A - Add Ellipsoid\n"
         + "D - Delete Ellipsoid\n"
         + "F - Find Ellipsoid\n"
         + "E - Edit Ellipsoid\n"
         + "Q - Quit");
            
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         eCode = scan.nextLine();
         eCode = eCode.trim();
            
         if (eCode.length() == 0) {
            continue;
         }
            
         char eCodeChar = eCode.charAt(0);
         switch (eCodeChar) {
            case 'R':
            case 'r':
               System.out.print("\tFile name: ");
               eFileName = scan.nextLine();
               
               myEList = myEList.readFile(eFileName);
               
               System.out.println("\tFile read in and Ellipsoid "
                  + "List created\n");
               break;
               
            case 'P':
            case 'p':
               System.out.println(myEList);
               break;
               
            case 'S':
            case 's':
               System.out.print("\n" + myEList.summaryInfo() + "\n");
               break;
               
            case 'A':
            case 'a':
               System.out.print("\tLabel: ");
               eLabel = scan.nextLine();
               System.out.print("\ta: ");
               eA = Double.parseDouble(scan.nextLine());
               System.out.print("\tb: ");
               eB = Double.parseDouble(scan.nextLine());
               System.out.print("\tc: ");
               eC = Double.parseDouble(scan.nextLine());
                  
               myEList.addEllipsoid(eLabel, eA, eB, eC);
               System.out.println("\t*** Ellipsoid added ***\n");
               break;
                  
            case 'D':
            case 'd':
               System.out.print("\tLabel: ");
               eLabelIn = scan.nextLine();
                  
               if (myEList.deleteEllipsoid(eLabelIn) == null) {
                  System.out.println("\t\"" + eLabelIn + "\" not found\n");
               }
               else {
                  System.out.println("\t\"" + eLabelIn + "\" deleted\n");
               }
               break;
                  
            case 'F':
            case 'f':
               System.out.print("\tLabel: ");
               eLabelIn = scan.nextLine();
                  
               if (myEList.findEllipsoid(eLabelIn) == null) {
                  System.out.println("\t\"" + eLabelIn + "\" not found\n");
               }
               else {
                  System.out.println(myEList.findEllipsoid(eLabelIn).toString()
                     + "\n");
               }
               break;
                  
            case 'E':
            case 'e':
               System.out.print("\tLabel: ");
               eLabelIn = scan.nextLine();
               System.out.print("\ta: ");
               eAIn = Double.parseDouble(scan.nextLine());
               System.out.print("\tb: ");
               eBIn = Double.parseDouble(scan.nextLine());
               System.out.print("\tc: ");
               eCIn = Double.parseDouble(scan.nextLine());
                     
               if (myEList.findEllipsoid(eLabelIn) == null) {
                  System.out.println("\t\"" + eLabelIn + "\" not found\n");
               }
               else {
                  myEList.editEllipsoid(eLabelIn, eAIn, eBIn, eCIn);
                  System.out.println("\t\"" + eLabelIn
                     + "\" successfully edited\n");
               }
               break;
                     
            case 'Q':
            case 'q':
               break;
                     
            default:
               System.out.println("\t*** invalid code ***\n");
               break;
         }
      }
      while (!eCode.equalsIgnoreCase("Q"));
   }
}