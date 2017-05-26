// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 4

import java.util.Scanner;
public class CompareCost
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      double weight1, price1, weight2, price2;
      double ratio1, ratio2;
   
      System.out.print("Enter weight and price for package 1:");
      weight1 = s.nextDouble();
      price1 = s.nextDouble();
      ratio1 = weight1/price1;
   
      System.out.print("Enter weight and price for package 2:");
      weight2 = s.nextDouble();
      price2 = s.nextDouble();
      ratio2 = weight2/price2;
   
      if(ratio1 < ratio2) {
         System.out.print("Package 2 has better price.");
      } 
      else if(ratio1 == ratio2) {
         System.out.print("Two packages have the same price.");
      } 
      else {
         System.out.print("Package 1 has better price.");
      }
   }
}