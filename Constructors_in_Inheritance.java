//class Base1{
//    Base1(){
//        System.out.println("Base class constructor");
//    }
//}
//class Derived1 extends Base1{
//    Derived1(){
//        System.out.println("Derived class constructor");
//    }
//}
//
//public class Constructors_in_Inheritance {
//    public static void main(String[] args) {
//        Derived1 d = new Derived1();
//    }
//}



//Constructor Overloading

//class Base1{
//    Base1(){
//        System.out.println("Base class constructor");
//    }
//    Base1(int a){
//        System.out.println("OverLoaded constructor with a value of: " + a);
//    }
//}
//class Derived1 extends Base1{
//    Derived1(){
//        super(45); //it will call base class constructor which is with argument
//        System.out.println("Derived class constructor");
//    }
//}
//
//public class Constructors_in_Inheritance {
//    public static void main(String[] args) {
//        Derived1 d = new Derived1();
//    }
//}




//A bit more complex

//class Base1{
//    Base1(){
//        System.out.println("Base class constructor");
//    }
//    Base1(int x){
//        System.out.println("OverLoaded Base constructor with a value of: " + x);
//    }
//}
//class Derived1 extends Base1{
//    Derived1(){
//        //super(45); //it will call base class constructor which is with argument
//        System.out.println("Derived class constructor");
//    }
//    Derived1(int x, int y){
//        super(x);
//        System.out.println("OverLoaded Derived Constructor");
//
//    }
//}
//
//public class Constructors_in_Inheritance {
//    public static void main(String[] args) {
//        Derived1 d = new Derived1(12,13);
//    }
//}




//Another Example with more complexities

class Base1{
    Base1(){
        System.out.println("Base class constructor");
    }
    Base1(int x){
        System.out.println("OverLoaded Base constructor with a value of x as: " + x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        //super(45); //it will call base class constructor which is with argument
        System.out.println("Derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("OverLoaded Derived Constructor with a value of y as: " +y);

    }
}
class ChildOfDerived1 extends Derived1{
    ChildOfDerived1(){
        System.out.println("Child of Derived1");
    }
    ChildOfDerived1(int x, int y, int z){
        super(x,y);
        System.out.println("Overloaded Child Constructor with a value of z as: " +z);
    }
}

public class Constructors_in_Inheritance {
    public static void main(String[] args) {
        //Derived1 d = new Derived1(12,13);
        ChildOfDerived1 cd = new ChildOfDerived1(1,2,3);
    }
}

//Note: If we have multile constructors in parent class, the constructor without parameter is called from thr child class
//If we want to call the constructor having parameter from the parent class, we can use super keyword