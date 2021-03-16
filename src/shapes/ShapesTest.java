package shapes;

// TODO: Test your code by creating a new class, ShapesTest
//  (also inside of shapes) with a main method.
//  Inside the main method,

public class ShapesTest {
    public static void main(String[] args) {

//  TODO: create a variable of the type Rectangle named
//   box1 and assign it a new instance of the Rectangle
//   class with a width of 4 and a length of 5

        Rectangle box1 = new Rectangle(5, 4);

//  TODO: verify that the getPerimeter and getArea methods
//   return 18 and 20, respectively.

        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

//  TODO: create a variable of the type Rectangle named box2
//   and assign it a new instance of the Square class that
//   has a side value of 5.
//                  POLYMORPHISM               //
        Rectangle box2 = new Square(5);

// TODO: verify that the getPerimeter and getArea methods
//  return 20 and 25, respectively.

        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

//  TODO: In the Square class, override the getArea and
//   getPerimeter methods with the following definitions
//   for a square.

        public double getArea() {
            return Math.pow(super.length, 2);
        }

        public double getPerimeter() {
            System.out.println() {
                len
            }




    }

}
