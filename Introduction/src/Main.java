//  Creation of a class
class Student{

    //  All the below variables are Instance Variables.
    String name;
    int age;
    int roll_no;
}

//  Main Class
public class Main{
    public static void main(String[] args){

        //  Creating an object of Student Class
        Student s1 = new Student();

        //  Default values are printed when not assigned any value.
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.roll_no);

        System.out.println();
        System.out.println();

        //  Assigning values to the Instance Variables of an object.
        s1.name = "Harshith";
        s1.age = 20;
        s1.roll_no = 46;

        //  Printing the values of object
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.roll_no);
    }
}