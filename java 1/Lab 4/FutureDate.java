// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        4

import java.util.*;
public class FutureDate
{

   public static void main(String[] args) 
   {
      Scanner s = new Scanner(System.in);
      int today, elapsedDays;
      int daysToAdd, dayToFind;
   
      System.out.print("Enter today's day:");
      today = s.nextInt();
   
      System.out.print("Enter the number of days elapsed since today:");
      elapsedDays = s.nextInt();
   
      daysToAdd = elapsedDays % 7;
      dayToFind = today + daysToAdd;
   
      if(today == 0) {
         System.out.print("Today is Sunday");
      } 
      else if(today == 1) {
         System.out.print("Today is Monday");
      } 
      else if(today == 2) {
         System.out.print("Today is Tuesday");
      } 
      else if(today == 3) {
         System.out.print("Today is Wednesday");
      } 
      else if(today == 4) {
         System.out.print("Today is Thursday");
      } 
      else if(today == 5) {
         System.out.print("Today is Friday");
      } 
      else if(today == 6) {
         System.out.print("Today is Saturday");
      }
   
      if(dayToFind == 0) {
         System.out.print(" and the future day is Sunday.");
      } 
      else if(dayToFind == 1) {
         System.out.print(" and the future day is Monday.");
      } 
      else if(dayToFind == 2) {
         System.out.print(" and the future day is Tuesday.");
      } 
      else if(dayToFind == 3) {
         System.out.print(" and the future day is Wednesday.");
      } 
      else if(dayToFind == 4) {
         System.out.print(" and the future day is Thursday.");
      } 
      else if(dayToFind == 5) {
         System.out.print(" and the future day is Friday.");
      } 
      else if(dayToFind == 6) {
         System.out.print(" and the future day is Saturday.");
      }
   }
}