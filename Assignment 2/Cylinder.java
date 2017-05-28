// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 2

import java.util.Scanner;
public class  Cylinder
{
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      double radius, length, area, volume;
     
      System.out.print("Enter the radius of the cylinder:");
      radius = s.nextDouble();
     
      System.out.print("Enter the length of the cylinder:");
      length = s.nextDouble();
     
      area = radius * radius * Math.PI;
      volume = area * length;
     
      System.out.print("The area of the cylinder is  " + area + " and the volume of the cylinder is " + volume);
   }
}