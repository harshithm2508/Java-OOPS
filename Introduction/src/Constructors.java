public class Constructors {
    public static void main(String[] args) {
        Car ferrari = new Car();
        System.out.println(ferrari.brand);
        System.out.println(ferrari.engine);
        System.out.println(ferrari.seats);
        System.out.println(ferrari.wheels);
    }
}


class Car{
    int wheels = 4;
    int seats = 2;
    String brand = "Ferrari";
    String engine = "Diesel";


    //  This constructor will be called when you use 'new Car()' overriding all the default values declared in the class.
    Car(){
        this.wheels = 5;
        this.seats = 3;
        this.brand = "Lamborghini";
        this.engine = "Diesel";
    }
}
