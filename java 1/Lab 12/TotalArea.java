public class TotalArea {
 /** Main method */
   public static void main(String[] args) {
   // Declare circleArray
      CircleWithPrivateDataFields[] circleArray;
   
   // Create circleArray
      circleArray = createCircleArray();
   
   // Print circleArray and total areas of the circles
      printCircleArray(circleArray);
   }

 /** Create an array of Circle objects */
   public static CircleWithPrivateDataFields[] createCircleArray() {
      CircleWithPrivateDataFields[] circleArray =
         new CircleWithPrivateDataFields[5];
   
      for (int i = 0; i < circleArray.length; i++) {
         circleArray[i] =
            new CircleWithPrivateDataFields(Math.random() * 100);
      }
   // Return Circle array
      return circleArray;
   }

 /** Print an array of circles and their total area */
   public static void printCircleArray(
   CircleWithPrivateDataFields[] circleArray) {
      System.out.printf("%-30s%-15s\n", "Radius", "Area");
      for (int i = 0; i < circleArray.length; i++) {
         System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),
            circleArray[i].getArea());
      }
   
      System.out.println("覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧�-");
   
   // Compute and display the result
      System.out.printf("%-30s%-15f\n", "The total area of circles is",
         sum(circleArray) );
   }
   public static void minMax(CircleWithPrivateDataFields[] circleArray)
   
   {   
      double minRadius;
      double maxRadius;
      double temp;
      for (int i = 0; i < circleArray.length; i++)
      {
         temp = circleArray[0].getRadius();
         if(i==0)
         {
            minRadius = temp;
            maxRadius = temp;
         }
         else
         {
            if(temp > maxRadius)
               maxRadius = temp;
            if(temp < minRadius)
               minRadius = temp;
         }
      }
   
      System.out.println("The smallest circle has radius = " + minRadius);
   
      System.out.println("The largest circle has radius = " + maxRadius);
   
   }
       
   
    /** Add circle areas */
   public static double sum(CircleWithPrivateDataFields[] circleArray) {
   // Initialize sum
      double sum = 0;
   
   // Add areas to sum
      for (int i = 0; i < circleArray.length; i++)
         sum += circleArray[i].getArea();
   
      return sum;
   }
}