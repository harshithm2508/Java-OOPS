public class SingleInheritance {
    public static void main(String[] args) {
        Rectangle box = new Rectangle("Rectangle",4,20,10);
        box.description();
        box.area();
    }
}


class Shape{
    String name;
    int sides;

    Shape(){}

    Shape(String name,int sides){
        this.name = name;
        this.sides = sides;
    }

    void description(){
        System.out.println("I am "+this.name+" and I have "+this.sides+" sides.");
    }
}

class Rectangle extends Shape{
    int length;
    int width;

    Rectangle() {}

    Rectangle(String name, int sides,int length, int width){
        super(name,sides);
        this.length = length;
        this.width = width;
    }

    void area(){
        System.out.println("Length : "+this.length+" Width : "+this.width);
        System.out.println("The area of rectangle is : "+this.length*this.width);
    }
}