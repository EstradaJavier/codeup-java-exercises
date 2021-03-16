package shapes;

import java.awt.*;

abstract class Quadrilareral implements Shape {

//    TODO: protected double fields for length and width. ***include data type***
//            -> a constructor that accepts two doubles for the length and width and
//               sets those fields.
//            -> methods for getting the length and width.
//            -> abstract methods for setting the length and width.

    protected double length;
    protected double width;

    // constructor
    public void Shape(double length, double width) {
        this.length = length;
        this.width =  width;
    }

    // method for length
    public static int sayHello(int length) {
        return int.format("Hello, %s!", length);
    }

    // method for width
    public static int sayHello(int width) {
        return int.format("Hello, %s!", width);
    }


    // getter and setter are two conventional
    // METHODS that are used for retrieving and
    // updating the value of a variable.

    // setters
    abstract void setLength(int length, int width);
    abstract void setWidth(int length, int width);

    //getters
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

}
