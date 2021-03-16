package shapes;


public class Square extends Rectangle {

    // TODO: Create a class named Square, also inside of
    //  shapes, that extends Rectangle.
        // COMPLETED!!!

    // TODO: Square should define a constructor that
    //  accepts one argument, side, and calls the parent's
    //  constructor to set both the length and width to
    //  the value of side.

    // CONSTURCTOR // Calls parent constructor...
    public Square(double side) {
        super(side, side); // Rectable

        public double getArea() {
            return Math.pow(side, 2);
        }

        public double getPerimeter() {
            return super.length * 4;
        }

    }

}
