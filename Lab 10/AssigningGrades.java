import java.util.Scanner;
public class AssigningGrades
{
   public static void main(String[] args)
   {
      int restart;
      do
      {
         System.out.print("Enter the number of students:");
         Scanner input = new Scanner(System.in);
         int n = input.nextInt();
         int[] score = new int[n];
         int best = 0;
         System.out.print("Enter " + n + " scores:");
         for (int i = 0; i < score.length; i++)
         {
            score[i] = input.nextInt();
            if (best < score[i])
            {
               best = score[i];
            }
         }
         char grade;
         for (int i = 0; i < score.length; i++)
         {
            if (score[i] >= best - 10)
               grade = 'A';
            else if (score[i] >= best - 20)
               grade = 'B';
            else if (score[i] >= best - 30)
               grade = 'C';
            else if (score[i] >= best - 40)
               grade = 'D';
            else
               grade = 'F';
            System.out.println("Student " + i +" score is " + score[i] +" and grade is " + grade);
         }
         System.out.print ("\nTo rerun press (1), To stop press (2)");
         restart = input.nextInt();
      } while (restart == 1);
   }
}