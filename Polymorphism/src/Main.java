public class Main {
    public static void main(String[] args) {

        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();


        //  Calling the area functions of each class
        shapes.area();
        circle.area();
        square.area();
        triangle.area();

        //  But we know that the Type of Reference Variable determines what properties and methods can be accessed.
        //  But here the 'area()' method in the Square class gets called
        //  This is "Method Overriding"
        //  'area()' method of Shapes class is being overridden by the 'area()' method of 'Square' class
        Shapes square1 = new Square();
        square1.area();

    }

    public static class Interfaces {
        public static void main(String[] args) {

        }
    }
}