class Person {

// Common Properties
    int age = 20;
    int weight = 50;
    String Color = "Light";

// Common Behaviours
    void eat() {
        System.out.println("I am Eating.");
    }

    void sleep() {
        System.out.println("I am Sleeping.");
    }

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.age);
        System.out.println(p.weight);
        System.out.println(p.Color);

        p.eat();
        p.sleep();
    }
}