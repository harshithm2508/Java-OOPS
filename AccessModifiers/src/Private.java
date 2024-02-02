public class Private {
    public static void main(String[] args) {
        Student stu01 = new Student("Harshith",20,46);
        stu01.info();
        System.out.println(stu01.name);
//        System.out.println(stu01.age);    //  can't be accessed as set as private
//        System.out.println(stu01.rollNo); //  can't be accessed as set as private
    }
}

class Student{
     String name;
    private int age;
    private int rollNo;

     Student(String name, int age, int rollNo){
        this.name = name;
        this.age =age;
        this.rollNo = rollNo;
    }

     void info(){
        System.out.println(this.name+" "+this.age+" "+this.rollNo);
    }
}