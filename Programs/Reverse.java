// importing java scanner class
import java.util.Scanner;
// name of the program or class
class Reverse {
// main method of the program
   public static void main(String args[]) {
   // creating two empty strings
      String original, reverse = "";
   // setting up the scanner to get the user input
      Scanner input = new Scanner(System.in);
   // asking user to enter a string
      System.out.println("Enter string");
   // storing the user input in the empty string original
      original = input.nextLine();
   // for loop to reverse the string
      for ( int i = original.length() - 1 ; i >= 0 ; i-- )
      // storing the new reverse string char to empty string reverse
         reverse = reverse + original.charAt(i);
   //printing the new string on the screen
      System.out.println("Reversed string: "+reverse);
   }
}