// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        2
import java.util.Scanner;
public class Practice_2_3
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      // variable declaration
      byte byte_value;
      short short_value;
      int int_value;
      long long_value;
      float float_value;
      double double_value;
      
      // input values section
      System.out.print ("Enter byte value: ");
      byte_value = scan.nextByte();
      System.out.print ("Enter short value: ");
      short_value = scan.nextShort();
      System.out.print ("Enter int value: ");
      int_value = scan.nextInt();
      System.out.print ("Enter long value: ");
      long_value = scan.nextLong();
      System.out.print ("Enter float value: ");
      float_value = scan.nextFloat();
      System.out.print ("Enter double value: ");
      double_value = scan.nextDouble();
      
      // outputs section
      System.out.println ("\n");
      System.out.println ("The byte value is:\t\t" + byte_value);
      System.out.println ("The short value is:\t\t" + short_value);
      System.out.println ("The int value is:\t\t" + int_value);
      System.out.println ("The long value is:\t\t" + long_value);
      System.out.println ("The float value is:\t\t" + float_value);
      System.out.println ("The double value is:\t\t" + double_value);
   }
}