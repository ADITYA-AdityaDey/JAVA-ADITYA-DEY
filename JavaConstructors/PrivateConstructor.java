///////////////// Private Constructor ///////////////////////
// Private Constructor works only Same class
// Not possible to create object from Other Class, Only Possible to create object in Same Class

class PrivateConstructor {

    int x, y, z;

    private PrivateConstructor(int a, int b, int c) {
        x = a; y = b; z = c;
    }

    void show() {
        System.out.println(x + " " + y + " " + z);
    }

    public static void main(String[] args) {
        PrivateConstructor ref = new PrivateConstructor(10, 20, 30);
        ref.show();
    }
}