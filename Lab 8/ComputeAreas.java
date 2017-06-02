import java.util.Scanner;
public class ComputeAreas
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int restart;
      do
      {
         System.out.println("Please enter Square Side: ");
         double Side = keyboard.nextDouble();
         System.out.println("Please enter Rectangle Width: ");
         double Width = keyboard.nextDouble();
         System.out.println("Please enter Rectangle Length: ");
         double Length = keyboard.nextDouble();
         System.out.println("Please enter Circle Radius: ");
         double Radius  = keyboard.nextDouble();
         System.out.println("Please enter Triangle Base: ");
         double Base = keyboard.nextDouble();
         System.out.println("Please enter Triangle Height: ");
         double Height = keyboard.nextDouble();
         System.out.println();
         double squareArea = squareArea(Side);
         System.out.println("Square Side:" + Side);
         System.out.println("Square Area: " + squareArea);
         System.out.println();
         double RectangleArea = RectangleArea(Width, Length);
         System.out.println("Rectangle Width:" + Width);
         System.out.println("Rectangle Length :" + Length);
         System.out.println("Rectangle Area: " + RectangleArea);
         System.out.println();
         double CircleArea  = CircleArea (Radius);
         System.out.println("Circle Radius:" + Radius);
         System.out.println("Circle Area: " + CircleArea);
         System.out.println();
         double TriangleArea  = TriangleArea (Base, Height);
         System.out.println("Triangle Base:" + Base);
         System.out.println("Triangle Height:" + Height);
         System.out.println("Triangle Area: " + TriangleArea);
         System.out.print ("\nEnter a new value? (1 for yes, any other number for no): ");
         restart = keyboard.nextInt();
      } while (restart == 1);
   }
   public static double squareArea (double Side)
   {
      double squareArea = Side * Side;
      return squareArea;
   }
   public static double RectangleArea (double Width, double Length)
   {
      double RectangleArea = Width * Length;
      return RectangleArea;
   }
   public static double CircleArea (double Radius)
   {
      double CircleArea = Math.PI * Radius * Radius;
      return CircleArea;
   }
   public static double TriangleArea (double Base, double Height)
   {
      double TriangleArea = (Base * Height)*1/2;
      return TriangleArea;
   }

}