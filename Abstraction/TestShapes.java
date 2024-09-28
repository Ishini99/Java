package lesson12;

public class TestShapes{
    public static void main(String[] args) {
        Shape shapeObject1 = new Circle(5);        //create a circle
        Shape shapeObject2 = new Rectangle(5, 3);    //create a rectangle
        System.out.println("The two objects have the same area? " + equalArea(shapeObject1,shapeObject2));
        displayShape(shapeObject1);    // Display circle
        displayShape(shapeObject2);    //Display rectangle
    }
    /** A method for comparing the areas of two shapes */
    public static boolean equalArea(Shape object1,Shape object2){
        return object1.getArea() == object2.getArea();
    }
    /** A method for displaying a shape*/
    public static void displayShape(Shape object){
        System.out.println();
        System.out.println("The area is " + object.getArea());
        }
}
