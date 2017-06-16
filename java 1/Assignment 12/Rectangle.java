public class Rectangle
{
   private double height;
   private double width;
   private String color;

   public Rectangle(double wid, double high){
      height = high;
      width = wid;
   } 
 
   public Rectangle(){
      height = 1;
      width = 1;
   }
 
   public void setHeight(double high){
      height = high;
   }
 
   public void setWidth(double wid){
      width = wid;
   }
 
   public double getArea(){
      return height*width;
   }
 
   public double getPerimeter(){
      return 2*(height + width);
   }
}