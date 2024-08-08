public class JavaStrings1 {
    public static void main(String[] args) {
        String str1 = "JAVA";
        String str2 = new String("JAVA");

        if (str1 == str2) { // Checking Reference Variable of Object
            System.out.println("Both are equals");
        }
        else {
            System.out.println("Both are not equals");
        }



        String str3 = "JavaScript";
        String str4 = new String("JavaScript");

        if (str3.equals(str4)) {    // Checking Object/Content
            System.out.println("Both are equals");
        }
        else {
            System.out.println("Both are not equals");
        }
    }
}