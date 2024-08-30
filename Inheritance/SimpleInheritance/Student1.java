class StudentDetails {
    int roll, STID;
    String name;

    void clgName() {
        System.out.println("XYZ College");
    }
}

class Student1 extends StudentDetails {
    
    void display() {
    roll=00001; STID=1111111111;
    name="Student1";
    System.out.println("Roll: "+roll+" STID: "+STID+" Name: "+name);
    }

    public static void main(String[] args) {
        Student1 rvo = new Student1();
        rvo.display();
        rvo.clgName();
    }
}