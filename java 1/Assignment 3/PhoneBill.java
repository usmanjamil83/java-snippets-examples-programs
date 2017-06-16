// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 3

import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
public class PhoneBill
{

   public static void main (String[] args)
   {
      int account;
      char service;
      double minutes=0, cost=0, minday=0, minnight=0, dayCost=0, nightCost=0;
   
      Scanner scan = new Scanner (System.in);
      
      System.out.println("Please enter your 4 digit account number: ");
      account = scan.nextInt();
      System.out.println("Please choose your service type as Regular(r) or Premium(p)");
      service = scan.next().charAt(0);
      switch (service)
      { 
         case 'r':
            System.out.println("Please input the number of minutes used: ");
            minutes = scan.nextInt();
            if (minutes <= 50) 
            { 
               cost = 10.00;
            }
            if (minutes >= 50)
            {
               cost = 10.00 + ((minutes-50)*.2);
            }   
            break;
         case 'p':
            System.out.println("Please input the number of minutes used between 6AM-6PM : ");
            minday = scan.nextInt();
            System.out.println("Please input the number of minuted used between 6PM-6AM : ");
            minnight = scan.nextInt();
            if (minday>75)
            {
               dayCost = (minday -75)*.1;
            }
            if (minnight>100)
            {
               nightCost = (minnight -100)*.05;
            }
            cost = 25 + (nightCost + dayCost);
            break;
      }
      System.out.println("\nYour account number is:\t\t " + account);
      System.out.println("The service type is\t\t " + service);
      if (service == 'r')
      {
         System.out.println("The number of minutes used were\t\t " + minutes);
      }
      else 
      {
         System.out.println("The number of day minutes used were " + minday + " and the number of night minutes used were " + minnight);
      }
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      System.out.println("\nThe cost of your phone bill is:\t\t " + fmt.format(cost));
   }
}