////////////////// Parameterized Constructor /////////////////

class B {
    int x, y;
    B(int a, int b) {
        x = a; y = b;
    }

    void show() {
        System.out.println(x + " " + y);
    }

    B(int a, String b) {
        System.out.println(a + " " + b);
    }
}

class Parameterized {
    public static void main(String[] args) {
        B ref1 = new B(10, 20);
        ref1.show();

        B ref2 = new B(3, "JAVA");
    }
}