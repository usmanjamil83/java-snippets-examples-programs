import java.util.Scanner;
public class MinMaxAvg
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int restart;
      do
      {
         System.out.println("Please input 3 integers: ");
         int x = keyboard.nextInt();
         int y = keyboard.nextInt();
         int z = keyboard.nextInt();
         System.out.println("You entered:" + " " + x + " " + y + " " + z);
         int max = max(x, y, z);
         System.out.println("Max value: " + max);
         int min = min(x, y, z);
         System.out.println("Min value: " + min);
         double average = average(x, y, z);
         System.out.println("Average value: " + average);
         System.out.print ("\nEnter a new value? (1 for yes, any other number for no): ");
         restart = keyboard.nextInt();
      } while (restart == 1);
   }
   public static int max (int x, int y, int z)
   {
      int max;
      if (x > y)
         if (x > z)
            max = x;
         else
            max = z;
      else
         if (y > z)
            max = y;
         else
            max = z;
      return max;
   }
   public static int min (int x, int y, int z)
   {
      int min;
      if (x < y)
         if (x < z)
            min = x;
         else
            min = z;
      else
         if (y < z)
            min = y;
         else
            min = z;  
      return min;
   }
   public static double average (int x, int y, int z)
   {
      double average;
      average = (x + y + z) / 3.0 ;
      return average;
   }
}