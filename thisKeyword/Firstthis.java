class Firstthis {
    void show() {
        System.out.println(this);
    }
    public static void main(String[] args) {
        Firstthis r = new Firstthis();
        System.out.println(r);
        r.show();
    }
}