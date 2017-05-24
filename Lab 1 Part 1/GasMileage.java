//***************************************************************
//GasMilage.Java        Author:Lewis/Loftus
//Demonstrates the use of the scanner class to read numeric data.
//***************************************************************
import java.util.Scanner;
public class GasMileage
{

//------------------------------------------------------------------
//Calculate fuel efficiency based on the valuse ontered by the user.
//------------------------------------------------------------------
   public static void main (String[] args)
   {
      int miles;
      double gallons, mpg;
      Scanner scan = new Scanner (System.in);
      System.out.print ("Enter the number of miles: ");
      miles = scan.nextInt();
   
      System.out.print ("Enter the gallons of fuel used: ");
      gallons = scan.nextDouble ();
   
      mpg = miles / gallons;
      System.out.println ("Miles per Gallon: " + mpg);
   }
}
