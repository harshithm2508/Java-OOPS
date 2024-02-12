public class MultiLevelInheritance {
    public static void main(String[] args) {

    }
}

class Square extends Shape{
    int sides;

    void area(){
        System.out.println("The area of given square is : "+this.sides * this.sides);
    }
}


class Cube extends Square{

    int volume;

//    void
}