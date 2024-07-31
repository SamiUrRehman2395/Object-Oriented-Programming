public class Abstract_Class {
    public static void main(String[] args) {

//        Parent obj = new Parent(); // cant make obj of abstract class
        Child1 obj1 = new Child1();
//        Child2 obj2 = new Child2(); // cant make obj of abstract class
        // Although it is possible to make the object with the reference of abstract class
        //Parent obj = new Child1();


        obj1.sayHello();
//        obj1.greeting();
//        obj1.greet();
    }
}

abstract class Parent{

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();
    abstract public void greeting();
}
class Child1 extends Parent{
    @Override
    public void greet(){
        System.out.println("How are You?");
    }
    public void greeting(){
        System.out.println("What are you doing?");
    }
}
/*
Here it gives red lines because it says either override a method from abstract parent class
or make the class abstract because parent class is abstract and you can't make child class
which is not abstract or which don't have abstract method
*/

//class Child2 extends Parent{
//    public void abc(){
//        System.out.println("ABC");
//    }
//}

/*
We've seen in Child1 , Child1 has abstract method so its ok,
 now we will make the class Child2 abstract so it will be okk too
 */

abstract class Child2 extends Parent{
    public void abc(){
        System.out.println("ABC");
    }
}

//Note: We can't make object of abstract class
//Abstract class is actually a standard

/*
Now let say there are more than one abstract methods in a parent class
then we have to override that abstract method into child classes or
we have me make the child classes , abstract classes
 */