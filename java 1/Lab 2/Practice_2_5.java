// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        2
import java.util.Scanner;
public class Practice_2_5
{
   public static void main(String[] args)
   { 
      int quarters, dimes, nickels, pennies, total, total_cents;
      Scanner scan = new Scanner (System.in);
   
      System.out.print("Enter the number of quarters in the jar: "); 
      quarters = scan.nextInt();
   
      System.out.print("Enter the number of dimes in the jar: ");
      dimes = scan.nextInt();
   
      System.out.print("Enter the number of nickels in the jar: ");
      nickels= scan.nextInt();
   
      System.out.print("Enter the number of pennies in the jar: ");
      pennies = scan.nextInt(); 
   
      total_cents = 25*quarters + dimes*10 + nickels*5 + pennies;
      total = total_cents/100;
      total_cents = total_cents %100;
   
      System.out.print("Total = " + total + " dollars and " + total_cents + " Cents ");
   }
}