import java.text.*;
public class Fan
{
   private static int speed;
   private static boolean on;
   private static double radius;
   private static String color;

   public static final int SLOW = 1;
   public static final int MEDIUM = 2;
   public static final int FAST = 3;

   public Fan ()
   {
      on = false;
      speed = SLOW;
      radius = 5;
      color = "Yellow";
   }


   void setSpeed (int s)
   {
      speed = s;
   }


   void setOn (boolean open)
   {
      on = open;
   }


   void setRadius (double r)
   {
      radius = r;
   }


   void setColor (String c)
   {
      color = c;
   }


   int getSpeed ()
   {
      return speed;
   }


   boolean getOn ()
   {
      return on;
   }


   double getRadius ()
   {
      return radius;
   }


   String getColor ()
   {
      return color;
   }


   public String toString ()
   {
      DecimalFormat df = new DecimalFormat ("0");
      String fanText = "";
      if (getOn ())
      {
         fanText = "on";
         return "The Fan Speed is " + getSpeed () + ", color is " + getColor () + ", and radius is " + df.format (getRadius ()) + ".";
      }
      else
      {
         fanText = "off";
         return "The Fan Color is " + getColor () + ", radius is " + df.format (getRadius ()) + ", and fan is " + fanText + ".";
      }
   }
}