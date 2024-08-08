import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Tester {
   /*
   * Creating an Scanner class object which is used to get the inputs entered
   * by the user
   */
   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args) throws FileNotFoundException {
      char choice;
      EllipsoidList el=null;
      String listName="";
      ArrayList<Ellipsoid> arl=new ArrayList<Ellipsoid>();
      while (true) {
         choice = menu();
         switch (choice) {
            case 'R':
            case 'r':
               System.out.print("File Name: ");
               String file = sc.nextLine();
               Scanner readFile = new Scanner(new File(file));
               listName=readFile.nextLine();
                
                
               while (readFile.hasNextLine()) {
                  String lable = readFile.nextLine();
                  double a = Double.parseDouble(readFile.nextLine());
                  double b = Double.parseDouble(readFile.nextLine());
                  double c = Double.parseDouble(readFile.nextLine());
               
                  Ellipsoid e = new Ellipsoid(lable,a,b,c);
                  arl.add(e);
                  
               }
               readFile.close();
               el=new EllipsoidList(listName, arl);
               System.out.println("File read in and Ellipsoid List Created");
              
               continue;
            case 'P':
            case 'p':
            
               ArrayList<Ellipsoid> list = el.import getList();
               System.out.println(el.getName());
               for(int i=0;i<list.size();i++)
               {
                  System.out.println(list.get(i));
               }
               continue;
            case 'S':
            case 's':
               System.out.println(el.summaryInfo());
               continue;
            case 'A':
            case 'a':
              
               System.out.print("\tLabel: ");
               String label=sc.nextLine();
            
               System.out.print("\ta: ");
               double a=sc.nextDouble();
               System.out.print("\tb: ");
               double b=sc.nextDouble();
               System.out.print("\tc: ");
               double c=sc.nextDouble();
               Ellipsoid e=new Ellipsoid(label, a, b, c);
               arl.add(e);
               el=new EllipsoidList(listName,arl);
               System.out.println("*** Ellipsoid added ***");
               sc.nextLine();
               continue;
            case 'D':
            case 'd':
               System.out.print("\tLabel: ");
               label=sc.nextLine();
               int index=isEllipsoidExists(label,el.getList());
               if(index==-1)
               {
                  System.out.println(label+" not found");
               }
               else
               {
                  el.getList().remove(index);
                  System.out.println(label+" deleted");
               }
               continue;
            case 'F':
            case 'f':
               System.out.print("\tLabel: ");
               label=sc.nextLine();
               index=isEllipsoidExists(label,el.getList());
               if(index==-1)
               {
                  System.out.println(label+" not found");
               }
               else
               {
                  System.out.println(el.getList().get(index));
               }
               continue;
            case 'E':
            case 'e':
               System.out.print("\tLabel: ");
               label=sc.nextLine();
               System.out.print("\ta: ");
               a=sc.nextDouble();
               System.out.print("\tb: ");
               b=sc.nextDouble();
               System.out.print("\tc: ");
               c=sc.nextDouble();
               index=isEllipsoidExists(label,el.getList());
               if(index==-1)
               {
                  System.out.println(label+" not found");
               }
               else
               {
                  el.getList().get(index).setA(a);
                  el.getList().get(index).setB(b);
                  el.getList().get(index).setC(c);
                  System.out.println("\""+label+"\" successfully edited");
               }
               sc.nextLine();
               continue;
            case 'Q':
            case 'q':
               break;
            default: {
               System.out.println("** Invalid Choice **");
               continue;
            }
         }
         break;
      }
   }
   private static int isEllipsoidExists(String label,
           ArrayList<Ellipsoid> list) {
      for(int i=0;i<list.size();i++)
      {
         if(list.get(i).getLabel().equalsIgnoreCase(label))
         {
            return i;
         }
      }
      return -1;
   }
   private static char menu() {
      System.out.println("\nEllipsoid List System Menu");
      System.out.println("R - Read File and Create Ellipsoid List");
      System.out.println("P - Print Ellipsoid List");
      System.out.println("S - Print Summary");
      System.out.println("A - Add Ellipsoid");
      System.out.println("D - Delete Ellipsoid");
      System.out.println("F - Find Ellipsoid");
      System.out.println("E - Edit Ellipsoid");
      System.out.println("Q - Quit");
      System.out.print("Enter Code [R,P,S,A,D,F,E,or Q]: ");
      char choice = sc.nextLine().charAt(0);
      return choice;
   }
}