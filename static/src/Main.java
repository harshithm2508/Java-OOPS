public class Main {
    public static void main(String[] args) {
        Human munna = new Human(20,"Harshith",180000,true);

        System.out.println(Human.population);

        Human p1 = new Human(25,"Guruji",150000,true);
        System.out.println(Human.population);

        greeting();     // static inside static
//        fun();  // non-static inside static

        Main obj = new Main();
        obj.fun();      //  Using non-static inside static by creating an instance of the class.
    }

    void fun(){
        System.out.println("I am having fun");
        greeting(); // static method inside non-staic
    }


    static void greeting(){
        System.out.println("Hello World");
    }
}