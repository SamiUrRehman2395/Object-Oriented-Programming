//public class Dynamic_Method_Dispatch {
//    public static void main(String[] args) {
//
//        Car obj = new Audi();
//
//        obj.on();
//    }
//}
//
//class Car{
//    public void on(){
//        System.out.println("Car is starting... ");
//    }
//}
//
//class Audi extends Car{
//    @Override
//    public void on() {
//        System.out.println("Audi is starting...");
//    }
//}



public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {

        Car obj = new Audi();

        obj.on();
        obj.open(); //allowed
//        obj.sunRoof(); // not allowed
    }
}

class Car{
    public void on(){
        System.out.println("Car is starting... ");
    }
    public void open(){
        System.out.println("Door is opening...");
    }

}

class Audi extends Car{
    @Override
    public void on() {
        System.out.println("Audi is starting...");
    }
    public void sunRoof() {
        System.out.println("Sun Roof is opening...");
    }

}