package packageB;
import packageA.GreetingA;  // importing GreetingA class from packageA.

public class GreetingB {

    String name = "Harshith";

    public void wish(){
        System.out.println("Hello "+name+" from package B.");
    }

    public static void main(String[] args) {
        GreetingB obj = new GreetingB();
        obj.wish();


        GreetingA packA = new GreetingA();
        packA.wish();
    }
}
