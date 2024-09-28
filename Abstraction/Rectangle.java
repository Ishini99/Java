package lesson12;

public class Rectangle extends Shape {
    private double width;
    private double height;
    /** Construct a default rectangle */
    public Rectangle() {
    }
    /** Construct a default rectangle with width and height */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    /** Construct a default rectangle with width and height, color and filled value */
    public Rectangle(double width, double height, String color,boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);     /** invoke a method in super class */
        setFilled(filled);   /** invoke a method in super class */
    }

    /** Return width */
    public double getWidth() {
        return width;
    }
    /** Set a new width */
    public void setWidth(double width) {
        this.width = width;
    }
    /** Return height */
    public double getHeight() {
        return height;
    }
    /** Set a new height */
    public void setHeight(double height) {
        this.height = height;
    }
    /** Return area */
    public double getArea() {
        return width * height;
    }
    /** Print the rectangle information */
    public void printRectangle() {
        System.out.println("Details of rectangle: Width :" + width + ", Hight:" +height+" ,Area: " +getArea());
    }
}
