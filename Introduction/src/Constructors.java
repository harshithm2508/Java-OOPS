public class Constructors {
    public static void main(String[] args) {
        Car lambo = new Car();
        System.out.println(lambo.brand);
        System.out.println(lambo.engine);
        System.out.println(lambo.seats);
        System.out.println(lambo.wheels);
        System.out.println();

        Car mclaren = new Car(4,2,"McLaren","M840T");
        System.out.println(mclaren.wheels);
        System.out.println(mclaren.seats);
        System.out.println(mclaren.brand);
        System.out.println(mclaren.engine);
        mclaren.description();
        System.out.println();

        mclaren.changeName();
        mclaren.whoAreYou();
        System.out.println();


        CallingFromConstructor call = new CallingFromConstructor();
        System.out.println(call.date);
        System.out.println(call.day);
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


    //  Below two functions(changeName, whoAreYou) demonstrate what if we don't use 'this' keyword for instant variables.
    void changeName(){
        brand = "Roll is Royis";
    }
    void whoAreYou(){
        System.out.println("I am "+brand);
    }

    void description(){
        System.out.println("I am "+this.brand+" with "+this.wheels+" wheels and "+this.seats+" seats. I have a powerful "+this.engine+" engine.");
    }
}


//  Calling a constructor from another constructor.
class CallingFromConstructor{
    int date;
    String day;


    //  Whenever you call this default constructor it will automatically call the constructor
    //  that takes date and day as parametes.
    CallingFromConstructor(){
        this(25,"Monday");
    }

    CallingFromConstructor(int date, String day){
        this.date = date;
        this.day = day;
    }
}