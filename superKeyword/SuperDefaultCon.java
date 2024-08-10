class E {
    E() {
        System.out.println("JAVA");
    }
}

class F extends E {
    F() {
        // super();
        System.out.println("JavaScript");
    }
}

class SuperDefaultCon {
    public static void main(String[] args) {
        F r = new F();
    }
}