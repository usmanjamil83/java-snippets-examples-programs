// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 2

import java.util.Scanner;
public class DrivingCost
{
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      double distance, milesPerGalon, pricePerGalon;
      double galonNeeded, cost;
     
      System.out.print("Enter the driving distance:");
      distance = s.nextDouble();
     
      System.out.print("Enter miles per gallon:");
      milesPerGalon = s.nextDouble();
     
      System.out.print("Enter price per gallon:");
      pricePerGalon = s.nextDouble();
     
      galonNeeded = distance / milesPerGalon;
      cost = galonNeeded * pricePerGalon;
     
      System.out.print("The cost of driving is $" + cost);
   }
}