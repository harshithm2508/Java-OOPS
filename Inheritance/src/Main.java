public class Main {
    public static void main(String[] args) {
        //  Defining various constructors
        Box defaultBox = new Box();
        Box cube = new Box(3);
        Box cuboid = new Box(1,8,12);
        Box boxType = new Box(cuboid);

        //  Accessing the instance variables of the classes
        System.out.println("Default Box : "+defaultBox.length+" "+ defaultBox.width+" "+ defaultBox.height);
        System.out.println("Cube box    : "+cube.length+" "+cube.width+" "+ cube.height);
        System.out.println("Cuboid Box  : "+cuboid.length+" "+ cuboid.width+" "+cuboid.height);
        System.out.println("Box Type box: "+boxType.length+" "+ boxType.width+" "+ boxType.height);



        //  Accessing the variables while inheriting all the Box variables
        BoxWeight box1 = new BoxWeight();
        System.out.println(box1.height+" "+box1.width+" "+box1.length+" "+box1.weight);


        //  Box(parent class) type referencing to BoxWeight(child class) type object
        //  The type of refere
        Box box2 = new BoxWeight(10,10,10,0.5);
        System.out.println(box2.length+" "+box2.height+" "+box2.width);

//        BoxWeight box3 = new Box(1,2,3);
    }
}