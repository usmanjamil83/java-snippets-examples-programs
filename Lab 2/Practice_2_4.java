// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        2

import java.util.Scanner;
public class Practice_2_4
{
   public static void main (String[] args)
   {
      double X;
      Scanner scan = new Scanner(System.in);
   
      System.out.print("Enter the value of X: ");
      X = scan.nextDouble();
      
      System.out.println("square's area = " + (X*X));
      System.out.println ("\n");
      System.out.println("square's perimeter = " + (X*4));
   }
}