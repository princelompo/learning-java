// Classes, heritages, polymorphism, constructors, getters, setters

class Animal{
    private String name;    
    int age;
    private static int count = 0;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public String getName() {  return this.name;  }
    public int getAge() {  return this.age;  }

    void setName(String name) {  this.name = name;  }
    void setAge(int age) {  this.age = age;  }

    void display() {
        System.out.println("Name : " + name + ", Age : " + age);
    }

    void cry() {
        System.out.println(name + " is making a sound.");
    }

}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {  return this.breed;  }
    void setBreed(String breed) {  this.breed = breed;  }

    @Override
    void cry() {
        System.out.println(getName() + " is barking.");
    }

    @Override
    void display() {
        System.out.println("Name : " + getName() + ", Age : " + getAge() + ", Breed : " + breed);
    }
}

class Person extends Animal {
    private String profession;

    public Person(String name, int age, String profession) {
        super(name, age);
        this.profession = profession;
    }

    public String getProfession() {  return this.profession;  }
    void setProfession(String profession) {  this.profession = profession;  }

    @Override
    void cry() {
        System.out.println(getName() + " is talking.");
    }

    @Override
    void display() {
        System.out.println("Name : " + getName() + ", Age : " + getAge() + ", Profession : " + profession);
    }
}

class Student extends Person {
    private String school;

    public Student(String name, int age, String profession, String school) {
        super(name, age, profession);
        this.school = school;
    }

    public String getSchool() {  return this.school;  }
    void setSchool(String school) {  this.school = school;  }

    @Override
    void display() {
        System.out.println("Name : " + getName() + ", Age : " + getAge() + ", Profession : " + getProfession() + ", School : " + getSchool());
    }
}

public class jav18 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        dog.display();
        dog.cry();

        Person person = new Person("Alice", 25, "Engineer");
        person.display();
        person.cry();

        Student student = new Student("Bob", 20, "Student", "XYZ University");
        student.display();
        student.cry();

    }

}