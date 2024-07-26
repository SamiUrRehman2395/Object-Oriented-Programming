public class Interface {
    public static void main(String[] args) {
        Honda bike = new Honda();

        bike.speedUp(20);
        bike.applyBrake(20);

//        System.out.println(bike.a); //can print the property we created
//        can't modify property because they are final

        bike.blowHorn1();
        bike.blowHorn2();
    }
}

interface MotorBike{
    int a = 35; // can create properties like this in interfaces
    void applyBrake(int decrement);
    void speedUp(int increment);
    //Interface methods are public by default so either write public with them or not doesn't matter
    //writing public with them.....redundancy
}
interface HeavyBike{
    void blowHorn1();
    void blowHorn2();

}
//class Honda implements MotorBike{
//    int speed = 70;
//    public void applyBrake(int decrement){
//        speed = speed - decrement;
//    }
//    public void speedUp(int increment){
//        speed = speed + increment;
//    }
//}

// group of related methods with empty bodies are called interfaces

class Honda implements MotorBike, HeavyBike{
    int speed = 70;
    public void applyBrake(int decrement){
        System.out.println("Applying Brake...");
    }
    public void speedUp(int increment){
        System.out.println("Speeding Up...");
    }

    public void blowHorn1(){
        System.out.println("Tee...");
    }
    public void blowHorn2(){
        System.out.println("Peeen...");
    }

}