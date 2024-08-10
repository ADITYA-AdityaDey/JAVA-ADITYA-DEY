class G {
    G(String userName) {
        System.out.println("Hello " + userName);
    }
}

class H extends G {
    H() {
        super("USER");
        System.out.println("Welcome");
    }
}

class SuperParameterizedCon {
    public static void main(String[] args) {
        H r = new H();
    }
}