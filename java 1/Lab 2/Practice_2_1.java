// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        2

import java.util.Scanner;
public class Practice_2_1
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      int X, Y, Z;
      double average;
     
      System.out.print("Enter the value of X:");
      X = s.nextInt();
     
      System.out.print("Enter the value of Y:");
      Y = s.nextInt();
     
      System.out.print("Enter the value of Z:");
      Z = s.nextInt();
   
      average = (X + Y + Z) / 3.0 ;
     
      System.out.print("The average is :" + average);
   }
}