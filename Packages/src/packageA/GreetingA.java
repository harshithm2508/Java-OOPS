package packageA;
import packageB.GreetingB;      //  importing GreetingB class form packageB

public class GreetingA {

    String name = "Harshith";

    public void wish(){
        System.out.println("Hello "+name+" from package A.");
    }

    public static void main(String[] args) {
        GreetingA obj = new GreetingA();
        obj.wish();


        GreetingB packB = new GreetingB();
        packB.wish();
    }
}