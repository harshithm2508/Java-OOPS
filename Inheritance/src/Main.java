public class Main {
    public static void main(String[] args) {
        Box defaultBox = new Box();
        Box cube = new Box(3);
        Box cuboid = new Box(1,8,12);
        Box boxType = new Box(cuboid);


        System.out.println("Default Box : "+defaultBox.length+" "+ defaultBox.width+" "+ defaultBox.height);
        System.out.println("Cube box    : "+cube.length+" "+cube.width+" "+ cube.height);
        System.out.println("Cuboid Box  : "+cuboid.length+" "+ cuboid.width+" "+cuboid.height);
        System.out.println("Box Type box: "+boxType.length+" "+ boxType.width+" "+ boxType.height);




        BoxWeight box1 = new BoxWeight();
        System.out.println(box1.height+" "+box1.width+" "+box1.length+" "+box1.weight);
    }
}