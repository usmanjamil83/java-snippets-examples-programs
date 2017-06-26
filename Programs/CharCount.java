// importing java scanner class
import java.util.Scanner;
// name of the program or class
class CharCount {
// main method of the program
   public static void main(String args[]) {
   // creating an empty string
      String original, result = "";
   // setting up the scanner to get the user input
      Scanner input = new Scanner(System.in);
   // asking user to enter a string
      System.out.println("Enter string");
   // storing the user input in the empty string original
      original = input.nextLine();
   // creating a new object
      StringBuilder sb = new StringBuilder(original);
   // while loop to count the char
      while(sb.length() != 0) {
      // initial count of the char will be zreo
         int count = 0;
         char test = sb.charAt(0);
         while(sb.indexOf(test+"") != -1){
         // while char is the same delete the char and add 1 to the count
            sb.deleteCharAt(sb.indexOf(test+""));
            count++;
         }
         result=result+test+count;
      // printing it on the screen
      }System.out.println(result);
   }
}