public class Super {
    public static void main(String[] args) {
        Dog ani1 = new Dog("Puppy","dog",2,20,"doberman",25,"bowbow");
        ani1.access();
    }
}


class Animal{
    String name;
    String species;
    int age;
    double weight;


    Animal(){}  //  default constructor

    Animal(String name, String species, int age, double weight){
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }
}


class Dog extends Animal{

    String breed;
    double tailLength;
    String barkSound;

    Dog(String name, String species, int age, double weight, String breed, double tailLength, String barkSound){
        super(name,species,age,weight); // calling parent class constructor
        this.barkSound = barkSound;
        this.tailLength = tailLength;
        this.breed = breed;
    }

    //  Method to access the parent class members
    void access(){
        System.out.println(super.name+" "+super.species+" "+super.age+" "+super.weight);
    }
}