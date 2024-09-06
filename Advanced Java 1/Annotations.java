/*
Annotations in Java
Used to provide extra information about a programme
Annotations provide metadata to class/methods

1. @Override
2. @SupressWarnings
3. @Depricated
4. @Functional Inerface

An Interface that contains exactly one abstract method is known as functional interface.
It can have any number of default, static methods but can contain only one abstract method.
It can also declare methods of object class. Functional Interface is also known as
Single Abstract Method Interfaces or SAM Interfaces.
 */

package Advanced_Java_2;

class A{

    @Deprecated
    public int add(int a, int b){
    return a+b;
    }

}


public class Annotations {
    @SuppressWarnings(" deprecation ")
    public static void main(String[] args) {

        A obj = new A();

        obj.add(5, 5);
    }
}
