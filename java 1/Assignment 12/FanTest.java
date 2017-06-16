public class FanTest {

   public static void main (String args [])
   {
      Fan fan = new Fan ();
      fan.setSpeed (fan.FAST);
      fan.setRadius (10);
      fan.setColor ("yellow");
      fan.setOn (true);
      System.out.println (fan.toString ());
   
      fan = new Fan ();
      fan.setSpeed (fan.MEDIUM);
      fan.setRadius (5);
      fan.setColor ("blue");
      fan.setOn (false);
      System.out.println (fan.toString ());
   }
}