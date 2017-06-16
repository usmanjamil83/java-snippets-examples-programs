// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 6

import java.util.Scanner;
public class PasswordTest
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      boolean length = false;
      boolean digit = false;
      boolean lowercase = false;
      boolean uppercase = false;
      char ch=0;
      String s1;

   //Prompt user to enter password
      System.out.print("Enter password: ");
      s1 = input.nextLine();

   //Check what ch is
      for (int i=0; i<s1.length(); i++){
         ch = s1.charAt(i);

         if (Character.isDigit(ch)){
            digit = true;
         }
         if (Character.isLowerCase(ch)){
            lowercase = true;
         }    
         if (Character.isUpperCase(ch)){
            uppercase = true;
         }             
      }
      if (s1.length()>=8){
          length = true;
       }

      if (digit==true && lowercase==true && uppercase==true && length==true)
         System.out.println("Verdict:        valid");

      else
         System.out.println("Verdict:        invalid");

   }
}