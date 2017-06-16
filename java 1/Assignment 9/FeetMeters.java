public class FeetMeters
{
   public static void main(String[] args)
   {
      System.out.printf("%-15s%-15s|    %-15s%-15s\n","Meter","Foot","Foot","Meter");
      System.out.println( String.format("%62s"," ").replace(' ', '-') );
      for (int m = 1, f = 20  ; m <=10; m++, f+=5)
      {
         System.out.printf("%-15.1f%-15.1f|    %-15.1f%-15.2f\n",(float)m,meterToFoot(m),(float)f, footToMeter(f));
      }
   }
   public static double meterToFoot(double meter)
   {
      return 0.305 * meter;
   }
   public static double footToMeter(double foot)
   {
      return 3.279 * foot;
   }
}