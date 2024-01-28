public class Human {
    int age;
    String name;
    int salary;
    boolean male;
    static long population;


    static void message(){
        System.out.println("This is a static message");
//        System.out.println(this.age);   // Shows error because 'this' is dependent on object.
    }


    Human(int age,String name, int salary, boolean male){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.male = male;
        Human.population += 1;
    }


}
