// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 4

import java.util.Scanner;
public class DayOfTheWeek
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      int year, month, dayOfMonth;
      int dayOfWeek, century, yearOfCentury;
   
      System.out.print("Enter year: (e.g., 2014):");
      year = s.nextInt();
   
      System.out.print("Enter month: 1-12:");
      month = s.nextInt();
   
      System.out.print("Enter the day of the month: 1-31:");
      dayOfMonth = s.nextInt();
   
   // testing if month is January or February
      if(month == 1) {
         month = 13;
      } 
      else if(month == 2) {
         month = 14;
      }
   
      century = year / 100;
      yearOfCentury = year % 100;
      dayOfWeek = (dayOfMonth + ((26 * (month + 1))/10) + yearOfCentury + yearOfCentury/4 + century/4 + century * 5) % 7;
   
      if(dayOfWeek == 0) {
         System.out.print("Day of the week is Saturday.");
      } 
      else if(dayOfWeek == 1) {
         System.out.print("Day of the week is Sunday.");
      } 
      else if(dayOfWeek == 2) {
         System.out.print("Day of the week is Monday.");
      } 
      else if(dayOfWeek == 3) {
         System.out.print("Day of the week is Tuesday.");
      } 
      else if(dayOfWeek == 4) {
         System.out.print("Day of the week is Wednesday.");
      } 
      else if(dayOfWeek == 5) {
         System.out.print("Day of the week is Thursday.");
      } 
      else if(dayOfWeek == 6) {
         System.out.print("Day of the week is Friday.");
      }
   }
}