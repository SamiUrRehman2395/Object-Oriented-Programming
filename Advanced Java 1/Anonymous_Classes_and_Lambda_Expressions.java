/*Anonymous classes enable you to make your code more concise.
They enable you to declare and instantiate a class at the same time.
They are like local classes except that they do not have a name.
Use them if you need to use a local class only once.*/

package Advanced_Java_2;

//interface DemoAno{
//    void method1();
//    void method2();
//}
//
//class AnonyDemo implements DemoAno{
//    @Override
//    public void method1() {
//        System.out.println("I am Method 1");
//    }
//
//    @Override
//    public void method2() {
//        System.out.println("I am Method 2");
//    }
//}
//
//public class Anonymous_Classes_and_Lambda_Expressions {
//    public static void main(String[] args) {
//
//        AnonyDemo obj = new AnonyDemo();
//
////        DemoAno obj = new AnonyDemo();
//        //we can also make object with reference of interface
//
//        obj.method1();
//    }
//}
//This is a simple way without using anonymous classes



//Now we will use anonymous classes

//interface DemoAno {
//    void method1();
//    void method2();
//}
//
//public class Anonymous_Classes_and_Lambda_Expressions {
//    public static void main(String[] args) {
//
//        DemoAno obj = new DemoAno() { //this is anonymous class
//            @Override
//            public void method1() {
//
//            }
//
//            @Override
//            public void method2() {
//
//            }
//        };
//
//        obj.method1();
//    }
//}
//we can make object of that class which implements the interface with reference to that interface
//we can make object of sub class with reference to parent class also



//Use of Lambda expression

interface ABCD {
    void Meth_1(int a);
}

//class WXYZ implements ABCD{
//
//    @Override
//    public void Meth_1() {
//
//    }
//}

public class Anonymous_Classes_and_Lambda_Expressions {
    public static void main(String[] args) {

//        ABCD obj_1 = new WXYZ();
//        obj_1.Meth_1();
        //this is how we call method of that class that implements the interface

        ABCD obj_2 = (a)-> {
            System.out.println("AM Method 1 of Lambda Expression " +a);
        };
        obj_2.Meth_1(35);
        //we can also give parameters like this

    }
}