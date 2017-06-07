import java.util.Scanner;
public class EliminateDuplicates
{
   public static void main(String[] args)
   {
      int restart;
      do
      {
         System.out.println("Enter ten numbers: ");
         Scanner input = new Scanner(System.in);
         int[] numbers = new int[10];
         for (int i = 0; i < 10; i++)
         {
            numbers[i] = input.nextInt();
         }
         System.out.println("Distinct elements Array: ");
         eliminateDuplicates(numbers);
         System.out.print ("\nTo rerun press (1), To stop press (2)");
         restart = input.nextInt();
      } while (restart == 1);
   }
   public static void eliminateDuplicates(int[] numbers)
   {
      int temp;
      int flag = 0;
      int flag2 = 1;
      int y = 0;
      for (int i = 0; i < 10; i++)
      {
         temp = numbers[i];
         for (int j = 0; j < flag; j++)
         {
            if (numbers[j] == temp)
            {
               flag2 = 2;
               break;
            } 
            else
               flag2 = 1;
         }
         if (flag2 == 1)
         {
            flag = flag + 1;
            numbers[y] = temp;
            System.out.print(temp + " ");
            y = y + 1;
         }
      }
   }
}