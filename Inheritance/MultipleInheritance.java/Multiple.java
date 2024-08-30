// JAVA doesn't support multiple-inheritance
// JAVA support it using Interfaces

interface A {
    void show();
}

interface B {
    void display();
}

class Multiple implements A, B {
    
    public void show() {
        System.out.println("Interface A");
    }

    public void display() {
        System.out.println("Interface B");
    }

    public static void main(String[] args) {
        Multiple ro = new Multiple();

        ro.show(); ro.display();
    }
}