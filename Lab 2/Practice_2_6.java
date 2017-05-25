// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        2

import java.util.Scanner;
public class Practice_2_6
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      double v0, v1, time, acceleration;
     
      System.out.print("Enter the value of v0:");
      v0 = s.nextDouble();
     
      System.out.print("Enter the value of v1:");
      v1 = s.nextDouble();
     
      System.out.print("Enter the value of time:");
      time = s.nextDouble();
   
      acceleration = (v1 - v0) / time;
     
      System.out.print("The average acceleration is:" + acceleration);
   }
}