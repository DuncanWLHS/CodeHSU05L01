import java.text.DecimalFormat;

/**
 * @file Rectangle.java
 * @date 2/2/2023
 * @author Duncan Duffield
 *
 * @decription Creates a rectangle with a width and height or a square with a side length.
 * The user can calculate the perimeter and area of the rectangle and print information about the rectangle.
 */

public class Rectangle { //make public for CS A

    //instance variables
    private double width;
    private double height;
    private double area;
    private double perimeter;

    //default constructor (make public for CS A)
    public Rectangle(){
        width = 1.0;
        height = 1.0;
    }

    //overloaded constructor (with parameters)
    /**
     * Creates a Rectangle object with width and height, If the parameter are not greater than 0, they are set to 1.0.
     *
     * @param w width of rectangle
     * @param h height of rectangle
     */
    public Rectangle(double w, double h){
        if (w > 0) {
            width = w;
        }else{
            width = 1.0;
        }
        width = w;
        height = h;
    }

    public Rectangle(double width){
        this.width = width;
    }

    //accessors
    /**
     *
     * @return the width of the rectangle
     */
    public double getWidth() {
        return width;
    }
    /**
     *
     * @return the height of the rectangle.
     */
    public double getHeight() {
        return height;
    }

    //mutators

    /**
     * Allows the user to change the width of the rectangle.
     *
     * @param newWidth desired width
     */
    public void setWidth(double newWidth) {
        width = newWidth;
    }

    /**
     *  @description Modifies the height of the rectangle
     * @param newHeight self-explanatory
     */
    public void setHeight(double newHeight) {
        height = newHeight;
    }

    //other methods

    /**
     * @description Calculates area of rectangle
     * @return area of rectangle
     */
    public double calculateArea() {
        return height*width;
    }

    public double calculatePerimeter() {
        return ((width*2) + (height*2));
    }


    //toString method
    public String ToString() {
        DecimalFormat df = new DecimalFormat("#.##"); //displays a number with 2 decimal places
        return "The height of the rectangle is " + df.format(height) + " and the width is " + df.format(width) + ".";
    }
}