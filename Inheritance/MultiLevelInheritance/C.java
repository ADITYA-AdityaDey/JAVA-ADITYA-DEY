class A {
    int a,b,c;

    void addition() {
        a=100; b=200;
        c=a+b;

        System.out.println("Addition is "+c);
    }

    void subtraction() {
        a=500; b=300;
        c=a-b;

        System.out.println("Subtraction is: "+c);
    }
}

class B extends A {
    void multiplication() {
        a=30; b=2;
        c=a*b;

        System.out.println("Multiplication is "+c);
    }

    void division() {
        a=90; b=2;
        c=a/b;

        System.out.println("Division is "+c);
    }
}

class C extends B {
    
    void remainder() {
        a=100; b=50;
        c=a%b;

        System.out.println("Remainder is "+c);
    }

    public static void main(String[] args) {
        C rvo = new C();

        rvo.addition(); rvo.subtraction(); rvo.multiplication(); rvo.division(); rvo.remainder();
    }

}