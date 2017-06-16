// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        3

import java.util.*;
public class Practice_3_4
{
   static Scanner console = new Scanner(System.in);
   public static void main (String[] args)
   {
      double x, y;
      
      System.out.println("Enter x coordinate");
      x = console.nextDouble();
      System.out.println("Enter y coordinate");
      y = console.nextDouble();
            
      if((x == 0) && (y == 0))
         System.out.println("Point is on the origin");
      if((x > 0) && (y == 0))
         System.out.println("Point is on the x-axis");
      if((x == 0) && (y < 0))
         System.out.println("Point is on the y-axis");
      if((x < 0) && (y == 0))
         System.out.println("Point is on the x-axis");
      if((x == 0) && (y > 0))
         System.out.println("Point is on the y-axis"); 
      if((x > 0) && (y > 0))
         System.out.println("Point is in the quadrant I");
      if((x < 0) && (y > 0))
         System.out.println("Point is in the quadrant II");
      if((x < 0) && (y < 0))
         System.out.println("Point is in the quadrant III");
      if((x > 0) && (y < 0))
         System.out.println("Point is in the quadrant IV");
   }
}