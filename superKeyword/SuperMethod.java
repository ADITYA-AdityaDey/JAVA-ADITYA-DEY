class C {
    void show() {
        System.out.println("JAVA");
    }
}

class D extends C {
    void show() {
        super.show();
        System.out.println("JavaScript");
    }
}

class SuperMethod {
    public static void main(String[] args) {
        D r = new D();
        r.show();
    }
}