package shapes;

public class Rectangle {

    protected double length;
    protected double width;

    //  TODO: It should have protected properties for
    //   both length and width.


    // TODO: Rectangle should define a constructor that
    //  accepts two numbers for length and width, and
    //  sets those properties.

    // the Rectangle constructor
        public Rectangle(double length, double width ) {
            this.length = length;
            this.width = width;
        }


    // TODO: Create two methods on the Rectangle class,
    //  getArea and getPerimeter that return the respective
    //  values. The formulas for both follow:
        // perimeter = 2 x length + 2 x width
        // area = length x width

    public double getArea () {
       return length * width;

    }

    public double getPerimeter () {
        return (2 * length) + (2 * width);
    }
}
