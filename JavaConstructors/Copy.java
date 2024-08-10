////////////////////// Copy Constructor /////////////////////

class C {
int x, y;

    C(int a, int b) {
        x = a; y = b;
        System.out.println(x + " " + y);
    }

    C(C ref) {
        x = ref.x;
        y = ref.y;
        System.out.println(x + " " + y);
    }
}

class Copy {
    public static void main(String[] args) {
        C obj1 = new C(100, 200);
        C obj2 = new C(obj1);
    }
}