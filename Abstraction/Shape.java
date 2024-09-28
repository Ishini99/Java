package lesson12;

public abstract class Shape {
    private String color = "white";
    private boolean filled=true;
    /** Construct a default shape */
    protected Shape() {
    }
    /** Construct a shape with the specified color and filled value **/
    protected Shape(String Color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }
    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    /** Return color */
    public String getColor() {
        return color;
    }
    /** Return filled. Since filled is boolean,its get method is named isFilled */
    public boolean isFilled() {
        return filled;
    }
    /** Return a string representation of this object */
    public String toString() {
        return " color: " + color + " and filled: " + filled;
    }
    /** Abstract method getArea */
    public abstract double getArea();
}
