import java.util.Random; 
public class RandomNumbers
{ 
   public static void main (String[] args) 
   { 
      Random generator = new Random(); 
      int num1; 
      float num2;
   
      num1 = generator.nextInt(25) + 23 ; 
      System.out.println ("a)  A random integer number between 30 and 50 (inclusive). " + num1); 
      num1 = generator.nextInt(10) - 20; 
      System.out.println ("b)  A random integer number between 20 and -20 (inclusive). " + num1); 
      num1 = generator.nextInt(10) - 20; 
      System.out.println ("c)  A random integer number between -20 and -60 (inclusive). " + num1); 
      num2 = generator.nextFloat() + 10; 
      System.out.println ("d)  A random floating-point number between 0.0 and 15.9999 (inclusive). " + num2); 
      num2 = generator.nextFloat();
      
   } 
}