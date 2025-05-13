class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal constructor called");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

// Derived class (Child class) inheriting from Animal
class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // Calling the constructor of the superclass (Animal)
        this.breed = breed;
        System.out.println("Dog constructor called");
    }

    public String getBreed() {
        return breed;
    }

    public void bark() {
        System.out.println(getName() + " is barking."); // Using getName() from the superclass
    }

    // Overriding the eat() method of the superclass
    @Override
    public void eat() {
        super.eat(); // Calling the eat() method of the superclass
        System.out.println(getName() + " is eating dog food.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                "} " + super.toString(); // Calling toString() of the superclass
    }
}
// Main class to demonstrate inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        // Creating an object of the derived class (Dog)
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");

        // Accessing methods and fields from the superclass (Animal)
        System.out.println("Dog's name: " + myDog.getName());
        System.out.println("Dog's age: " + myDog.getAge());
        System.out.println("Dog's breed: " + myDog.getBreed());

        myDog.eat();    // Calling the overridden eat() method
        myDog.sleep();  // Calling the inherited sleep() method
        myDog.bark();   // Calling the method specific to the Dog class

        System.out.println(myDog); // Calling the toString() method
    }
}
