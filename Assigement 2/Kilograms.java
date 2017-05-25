// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 2

import java.util.Scanner;
public class   Kilograms
{
public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   double pounds, kilograms;
  
   System.out.print("Enter the value of pounds:");
   pounds = s.nextDouble();
  
   kilograms = pounds * 0.454;
  
   System.out.print("The value in kilograms for " + pounds + " pounds is " + kilograms + ".");
}
}