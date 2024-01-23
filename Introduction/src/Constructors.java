public class Constructors {
    public static void main(String[] args) {
        Car lambo = new Car();
        System.out.println(lambo.brand);
        System.out.println(lambo.engine);
        System.out.println(lambo.seats);
        System.out.println(lambo.wheels);


        Car mclaren = new Car(4,2,"McLaren","M840T");
        System.out.println(mclaren.wheels);
        System.out.println(mclaren.seats);
        System.out.println(mclaren.brand);
        System.out.println(mclaren.engine);
        mclaren.description();
    }
}


class Car{
    int wheels = 4;
    int seats = 2;
    String brand = "Ferrari";
    String engine = "Diesel";


    //  This constructor will be called when you use 'new Car()' overriding all the default values declared in the class.
    //  The below constructor is itself the Default Constructor.
    Car(){
        this.wheels = 5;
        this.seats = 3;
        this.brand = "Lamborghini";
        this.engine = "Diesel";
    }

    Car(int wheels, int seats, String brand, String engine){
        this.wheels = wheels;
        this.seats = seats;
        this.brand = brand;
        this.engine = engine;
    }

    void description(){
        System.out.println("I am "+this.brand+" with "+this.wheels+" wheels and "+this.seats+" seats. I have a powerful "+this.engine+" engine.");
    }
}
