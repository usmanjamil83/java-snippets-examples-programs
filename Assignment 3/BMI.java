// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 3

import java.util.Scanner;
public class BMI
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner(System.in);
      double BMI, pounds, inches, feets;
   
      System.out.print("enter weight in pounds ");
      pounds = scan.nextDouble();
      System.out.print("enter height in feets ");
      feets = scan.nextDouble();
      System.out.print("enter height in inches ");
      inches = scan.nextDouble();
   
      System.out.println("Weight = " + pounds + " pounds");
      System.out.println("Height = " + feets + " feets");
      System.out.println("Height = " + inches + " inches");
      
      BMI =( pounds * 703.)/(((feets * 12) + inches) * ((feets * 12) + inches));
         
      System.out.println ("Body Mass Index is " + BMI );
   
   }
}