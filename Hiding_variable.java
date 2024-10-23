package practice_codes;

class SuperClass {
    int x = 10;  // Superclass variable
}

class SubClass extends SuperClass {
    int x = 20;  // Subclass variable hiding the superclass variable
}

public class Hiding_variable {
    public static void main(String[] args) {
        SuperClass superObj = new SuperClass();
        SubClass subObj = new SubClass();

        System.out.println(superObj.x);  // Outputs: 10
        System.out.println(subObj.x);    // Outputs: 20

        // To access the superclass variable in a subclass object, you need to use super:
        System.out.println(((SuperClass) subObj).x);  // Outputs: 10 (Superclass variable)
    }
}
