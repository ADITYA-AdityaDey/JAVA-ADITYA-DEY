////////////////// Default Constructor ///////////////

class A {
    String name; int roll;

    A() {
        name = "ADITYA"; roll = 1;
    }

    void show() {
        System.out.println(name + " " + roll);
    }
}

class Default {
    public static void main(String[] args) {
        A ref = new A();

        ref.show();
    }
}