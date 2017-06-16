import java.util.Scanner;
public class SumArrayColumns
{
   public static void main(String[] args)
   {
      int restart;
      do
      {
         System.out.print("Enter a 3 X 4 matrix: ");
         Scanner input = new Scanner(System.in);
         double[][] matrix = new double[3][4];
         for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
               matrix[i][j] = input.nextDouble();
         for (int i = 0; i < matrix[0].length; i++)
         {
            System.out.println("Sum of the elements at column" + i +" is " + sumColumn(matrix, i));
         }
         System.out.print ("\nTo rerun press (1), To stop press (2): ");
         restart = input.nextInt();
      } while (restart == 1);
   }
   public static double sumColumn(double[][] m, int columnIndex)
   {
      double total = 0;
      for (int i = 0; i < m.length; i++)
      {
         total += m[i][columnIndex];
      }
      return total;
   }
   public static void displayMatrix(double[][] matrix)
   {
      for (int row = 0; row < matrix.length; row++)
      {
         for (int column = 0; column < matrix[row].length; column++)
         {
            System.out.printf("%5.0f ", matrix[row][column]);
         }
         System.out.printf("\n");
      }
   }
}