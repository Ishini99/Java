package lesson12;

public class Circle extends Shape{
    private double radius;
    /** Construct a default circle */
    public Circle() {
    }
    /** Construct a circle with the specified radius**/
    public Circle(double radius) {
        this.radius = radius;
    }
    /** Construct a circle with the specified radius, color and filled value **/
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);       /** invoke a method in super class */
        setFilled(filled);     /** invoke a method in super class */
    }
    /** Return radius */
    public double getRadius() {
        return radius;
    }
    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }
    /** Print the circle information */
    public void printCircle() {
        System.out.println("Radius of the circle is " + radius + " , area of the circle is " +getArea()+ ", color is" + getColor());
    }
}
