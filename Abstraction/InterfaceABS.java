interface Vehicle {
    String vehicleName = "Bajaj";   // public + static + final

    void start();   // public + abstract
    void stop();    // public + abstract

    default void color() {
        System.out.println("Color is Black");
    }

    static void speed() {
        System.out.println("Speed is 100 km/h");
    }
}

class InterfaceABS implements Vehicle {
    @Override
    public void start() {
        System.out.println(vehicleName + " Start: Insert Key and Press Start Button.");
    }

    @Override
    public void stop() {
        System.out.println(vehicleName + " Stop: Exit Key.");
    }

    public static void main(String[] args) {
        InterfaceABS v = new InterfaceABS();

        v.start(); v.stop(); v.color();
        Vehicle.speed();
    }
}