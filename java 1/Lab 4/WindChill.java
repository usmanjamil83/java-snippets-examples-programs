// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        4

import java.util.Scanner;
public class WindChill
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double temperature, windspeed, WindChill = 0;
      
      System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F:");
      temperature = input.nextDouble();
      
      System.out.print("Enter the wind speed (>=2) in miles per hour:");
      windspeed = input.nextDouble();
            
      if (temperature < -58 || temperature > 41) {
         System.out.println("The temperature input is incorrect.");
         WindChill = -1;
      }  
      if (windspeed < 2) {
         System.out.println("The wind speed input is incorrect.");
         WindChill = -1;
      }     
      if (WindChill == -1) {
         System.exit(0);
      }     
      WindChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windspeed, 0.16) + 0.4275 * temperature * Math.pow(windspeed, 0.16);
     
      System.out.print("The wind chill index is " + WindChill);
     
   }
}