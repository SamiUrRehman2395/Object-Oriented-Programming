public class Practice_Questions_on_AbstractClasses_and_Interfaces {
    public static void main(String[] args) {

        // Q1
        FountainPen pen = new FountainPen();

        pen.write();
        pen.refill();
        pen.changeNib();

        // Q2
        Human human = new Human();

        human.eat();
        human.sleep();
        human.jump();
        human.bite();
    }
}

/*
Q1: Make abstract class and make another class and extends previous class
*/

abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    @Override
    void write() {
        System.out.println("WRITE");
    }

    @Override
    void refill() {
        System.out.println("REFILL");
    }

    void changeNib(){
        System.out.println("CHANGE NIB");
    }
}


/*
Q2: Create class monkey with jump and bite method,
Create a class human which inherits monkey and implements BasicHuman interface with
eat and sleep methods
 */

class Monkey{
    void jump(){
        System.out.println("Can Jump");
    }
    void bite(){
        System.out.println("Can Bite");
    }
}
interface BasicHuman{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicHuman{
    @Override
    public void eat(){
        System.out.println("Eats Food");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps at Night");
    }
}

/*

 */