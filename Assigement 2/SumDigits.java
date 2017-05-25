// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 2

import java.util.Scanner;
public class SumDigits
{
public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   int number, sum;
  
   System.out.print("Enter a number between 0 and 1000:");
   number = s.nextInt();
  
   sum = 0;
   sum += number % 10; //add the first digit to the sum
   number = number / 10; //removes  the first digit from the number
   sum += number % 10; //add the second digit to the sum
   number = number /10; //removes the second digit from the number
   sum += number % 10; //add the third digit to the sum
  
   System.out.print("The sum of the digits is " + sum + ".");
}
}