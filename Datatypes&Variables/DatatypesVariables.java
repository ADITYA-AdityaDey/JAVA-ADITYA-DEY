/////////////////////////////////////// datatypes ///////////////////////////////////

//////////// Primitive ///////////////
/*
    Numeric:

        *byte (size: 1 bytes)
        *short (size: 2 bytes)
        *int (size: 4 bytes)
        *long (size: 8 bytes)
        *double (size: 8 bytes)
        *float (size: 4 bytes)
*/

/*
    Non-numeric:

        *char (size: 2 bytes)
        *boolean (1 bit)
*/


/////////// Non-primitive ////////////
/*
    *class
    *Array
    *String
    etc.
*/



/////////////////////////////////// variables //////////////////////////////////////

/*
    Types of variables:

        *local
        *static
        *instance
        *final
*/


public class DatatypesVariables {

    int score1 = 90; // instance variable
    static double score2 = 90.7; // static variable

    public static void main(String[] args) {

        boolean qualify = true; // local variable

        // create object of class variable instance variable
        DatatypesVariables obj1 = new DatatypesVariables();

        System.out.println(obj1.score1);
        System.out.println(score2);
        System.out.println(qualify);
        
    }
}