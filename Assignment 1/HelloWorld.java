// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 1

import java.util.Scanner;
public class HelloWorld
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.print("Please enter your name: ");
      String name = s.nextLine();
      System.out.println("Hello " + name + "!");
   }
}