// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        3

import java.text.NumberFormat;
import java.util.Scanner;
public class Practice_3_3
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      Scanner scan = new Scanner (System.in);
   
      double fee = 1.99, three = 2.00, rate = .45, minute, due;
      int included = 3;
         
      System.out.println ("Enter the number of minutes: ");
      minute = scan.nextDouble();
   
      if (minute > included)
         due = (fee + three + ((minute - included) * rate));
      
      else
         due = fee + three;
   
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      System.out.println ("Amount due: " + fmt.format(due));
   }
}