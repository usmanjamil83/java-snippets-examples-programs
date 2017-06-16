// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        1 Part 2

import java.util.Scanner;
public class Practice_1_5
{
   public static void main (String[] args)
   {
      int miles;
      double minutes, kph;
      double kilometer;
      double hour;
      Scanner scan = new Scanner (System.in);
      
      System.out.print ("Enter the number of miles: ");
      miles = scan.nextInt();
      
      System.out.print ("Enter the minutes: ");
      minutes = scan.nextDouble ();
      
      kilometer = miles*1.6;
      hour = minutes/60;
      kph = kilometer/hour;
      
      System.out.println ("Kilometer per Hour: " + kph);
   }
}