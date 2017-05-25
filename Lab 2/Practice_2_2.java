// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        2

import java.util.Scanner;
public class Practice_2_2
{
   public static void main (String[] args)
   {
      double x,y;
      Scanner scan = new Scanner(System.in);
   
      System.out.print("Enter two floating point numbers: ");
      x = scan.nextDouble();
      y = scan.nextDouble();
   
      System.out.println("Their sum is = " + (x+y));
      System.out.println("Their difference is = " + (x-y));
      System.out.println("Their product is = " + (x*y));
   }
}