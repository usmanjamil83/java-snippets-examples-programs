// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 4

import java.util.Scanner;
public class ISBN_Number
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      int d1, d2, d3, d4, d5, d6, d7, d8, d9;
      int d10;
   
      System.out.print("Enter the first 9 digits of an ISBN as integer:");
      d1 = s.nextInt();
      d2 = s.nextInt();
      d3 = s.nextInt();
      d4 = s.nextInt();
      d5 = s.nextInt();
      d6 = s.nextInt();
      d7 = s.nextInt();
      d8 = s.nextInt();
      d9 = s.nextInt();
   
      d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
   
      if(d10 == 10)
         System.out.println( d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "X");
      else
         System.out.println( d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + d10);
   }
}