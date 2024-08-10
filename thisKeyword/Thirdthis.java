class Thirdthis {
    Thirdthis() {
        System.out.println("JAVA");
    }

    Thirdthis(int a) {
        this();
        System.out.println(a);
    }

    public static void main(String[] args) {
        Thirdthis r = new Thirdthis(200);
    }
}