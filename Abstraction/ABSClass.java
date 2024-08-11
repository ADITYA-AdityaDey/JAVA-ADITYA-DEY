abstract class Car {
    void wheel() {
        System.out.println("All Car Have 4 Wheel.");
    }

    abstract void type();
    abstract void color();

}

class BMW extends Car {
    @Override
    void type() {
        System.out.println("Sedan");
    }

    void color() {
        System.out.println("Black Sapphire Metallic");
    }
}

class MercedesBenz extends Car {
    @Override
    void type() {
        System.out.println("SUV");
    }

    void color() {
        System.out.println("Black");
    }
}

class ABSClass {
    public static void main(String[] args) {
        BMW B = new BMW();
        MercedesBenz M = new MercedesBenz();

        B.type(); B.color(); B.wheel();
        M.type(); M.color(); M.wheel();
    }
}