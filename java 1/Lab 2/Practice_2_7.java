// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        2

import java.util.Scanner;
public class Practice_2_7
{
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      double acceleration, speed, length;
     
      System.out.print("Enter speed:");
      speed = s.nextDouble();
     
      System.out.print("Enter acceleration:");
      acceleration = s.nextDouble();
     
      length = (Math.pow(speed, 2))/(2*acceleration);
     
      System.out.print("The minimum runway length for this airplane is " + length);
   }
}