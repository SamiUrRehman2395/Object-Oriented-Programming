/*
Encapsulation :-
 Wrapping up the implementation of the data members and methods in a class
 */

class encapsule{
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        encapsule x = new encapsule();

        x.setValue(100);

        System.out.println(x.getValue());
    }
}
