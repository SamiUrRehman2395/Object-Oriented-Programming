class Base2{
    Base2(){
        System.out.println("Base class constructor");
    }
    Base2(int x){
        System.out.println("OverLoaded Base constructor with a value of x as: " + x);
    }
}
class Derived2 extends Base2{
    Derived2(){
        //super(45); //it will call base class constructor which is with argument
        System.out.println("Derived class constructor");
    }
    Derived2(int x, int y){
        super(x);
        System.out.println("OverLoaded Derived Constructor with a value of y as: " +y);

    }
}
class ChildOfDerived2 extends Derived2{
    ChildOfDerived2(){
        System.out.println("Child of Derived1");
    }
    ChildOfDerived2(int x, int y, int z){
        super(x,y);
        System.out.println("Overloaded Child Constructor with a value of z as: " +z);
    }
}

public class Super_Keyword {
    public static void main(String[] args) {
        //Derived1 d = new Derived1(12,13);
        ChildOfDerived1 cd = new ChildOfDerived1(1,2,3);
    }
}

//Note: If we have multile constructors in parent class, the constructor without parameter is called from thr child class
//If we want to call the constructor having parameter from the parent class, we can use super keyword
