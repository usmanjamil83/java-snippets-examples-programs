public class TestRectangle {
   public static void main(String[] args){
      Rectangle box1 = new Rectangle();
      Rectangle box2 = new Rectangle(4, 40);
      Rectangle box3 = new Rectangle(3.5, 35.9);
   
      System.out.println("The perimeter of the first box is: " + box1.getPerimeter() + "\n");
      System.out.println("The perimeter of the second box is: " + box2.getPerimeter() + "\n");
      System.out.println("The perimeter of the third box is: " + box3.getPerimeter() + "\n");
   
      System.out.println("The area of the first box is: " + box1.getArea() + "\n");
      System.out.println("The area of the second box is: " + box2.getArea() + "\n");
      System.out.println("The area of the third box is: " + box3.getArea() + "\n");
   }
}