public class Private {
    public static void main(String[] args) {
        Student stu01 = new Student("Harshith",20,46);
        stu01.getInfo();
        stu01.setInfo("Harshith Muthangi",21,4246);     //  Using setter function instance variables are accessed and changed
        stu01.getInfo();
//        System.out.println(stu01.name);
//        System.out.println(stu01.age);    //  can't be accessed as set as private
//        System.out.println(stu01.rollNo); //  can't be accessed as set as private
    }
}

//  Anything set private can only be accessed in that class
//  age, rollNo are made private so they cannot be accessed outside the Student class.
//  But they can be accessed by 'setter' and 'getter' functions

class Student{
     String name;
    private int age;
    private int rollNo;

     Student(String name, int age, int rollNo){
        this.name = name;
        this.age =age;
        this.rollNo = rollNo;
    }

    void setInfo(String name, int age, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }
     void getInfo(){
        System.out.println("Name : "+this.name+" ; Age : "+this.age+" ; Roll Number : "+this.rollNo);
    }
}