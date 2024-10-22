class Animal1 {
    protected String name;
    protected double high;
    protected double weight;
    protected String color;
    public Animal1(String name, double high, double weight, String color) {
        this.name = name;
        this.high = high;
        this.weight = weight;
        this.color = color;
    }

    public void properties() {
        System.out.println("Name: " + name + " High: " + high + " Weight: " + weight + " Color: " + color);
    }

    public void eat() {}
    public void sleep() {}
    public void makeSound() {}
}

class Cat extends Animal1 {
    public Cat(String name, double high, double weight, String color) {
        super(name, high, weight, color);
    }

    @Override
    public void properties() {
        super.properties();
    }

    public void eat() {
        System.out.println(name + " eat milk");
    }

    public void sleep() {
        System.out.println(name + " sleep everyday");
    }

    public void makeSound() {
        System.out.println(name + " says mewwww\n");
    }
}

class Dog extends Animal1 {
    public Dog(String name, double high, double weight, String color) {
        super(name, high, weight, color);
    }

    @Override
    public void properties() {
        super.properties();
    }

    public void eat() {
        System.out.println(name + " eat bone");
    }

    public void sleep() {
        System.out.println(name + " sleep sometimes");
    }

    public void makeSound() {
        System.out.println(name + " says gaf\n");
    }
}

class Cow extends Animal1 {
    public Cow(String name, double high, double weight, String color) {
        super(name, high, weight, color);
    }

    @Override
    public void properties() {
        super.properties();
    }

    public void eat() {
        System.out.println(name + " eat grass");
    }

    public void sleep() {
        System.out.println(name + " sleep also sometimes");
    }

    public void makeSound() {
        System.out.println(name + " says moooooo\n");
    }
}

public class Main {

    public static void main(String[] args) {
        Animal1 cat = new Cat("Fil", 40, 5, "brown");
        Animal1 dog = new Dog("Digger", 50, 13, "white");
        Animal1 cow = new Cow("Muuu", 130, 100, "mixed");
        cat.properties();
        cat.eat();
        cat.sleep();
        cat.makeSound();

        dog.properties();
        dog.eat();
        dog.sleep();
        dog.makeSound();

        cow.properties();
        cow.eat();
        cow.sleep();
        cow.makeSound();
    }
}
