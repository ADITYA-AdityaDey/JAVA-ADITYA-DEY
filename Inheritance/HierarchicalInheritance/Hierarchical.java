class A {
    void showName() {
        System.out.println("Your Name: ");
    }
}

class B extends A {
    void BName() {
        System.out.println("B");
    }
}

class C extends A {
    void CName() {
        System.out.println("C");
    }
}

class Hierarchical {
    public static void main(String[] args) {
        B roB = new B();
        C roC = new C();

        roB.showName(); roB.BName();
        roC.showName(); roC.CName();
    }
}