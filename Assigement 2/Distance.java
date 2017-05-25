// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 2

import java.util.Scanner;
public class  Distance
{
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      double x1, y1, x2, y2, distance;
     
      System.out.print("Enter x1 and y1:");
      x1 = s.nextDouble();
      y1 = s.nextDouble();
     
      System.out.print("Enter x2 and y2:");
      x2 = s.nextDouble();
      y2 = s.nextDouble();
     
      distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
     
      System.out.print("The distance between the two points is " + distance);
   }
}