class A {
    int score = 100;
}

class B extends A {
    int score = 90;

    void show() {
        System.out.println(score);
        System.out.println(super.score);
    }
}

class SuperVar {
    public static void main(String[] args) {
        B r = new B();
        r.show();
    }
}