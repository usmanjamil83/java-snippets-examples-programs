import java.util.Scanner;
public class CheckPassword
{
   public static void main(String[] args)
   {
      int restart;
      do
      {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a password: ");
         String s = input.nextLine();
         if (chkPswd(s))
            System.out.println("Valid Password");
         else
            System.out.println("Invalid Password");
         System.out.print ("\nEnter a new value? (1 for yes, any other number for no): ");
         restart = input.nextInt();
      } while (restart == 1);
   }
   public static boolean chkPswd(String password)
   {
      boolean chkPswd = true;
      if (password.length() < 8)
         chkPswd = false;
      else
      {
         int numberOfDigit = 0;
         for (int i = 0; i < password.length(); i++)
         {
            if (isDigit(password.charAt(i)) || isLetter(password.charAt(i)))
            {
               if (isDigit(password.charAt(i)))
                  numberOfDigit++;
            }
            else
            {
               chkPswd = false;
               break;
            }
         }
         if (numberOfDigit < 2)
            chkPswd = false;
      }
      return chkPswd;
   }
   public static boolean isLetter(char ch)
   {
      return ((ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A'));
   }
   public static boolean isDigit(char ch)
   {
      return (ch <= '9' && ch >= '0');
   }
}