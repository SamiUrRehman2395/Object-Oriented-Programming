/*Here I will use the same code of multiple inheritance but with the addition of default method
 */

/*Although multiple inheritance is not allowed in Java,
but we can have indirect multiple inheritance by using interfaces.
given is the example where we inherit smartphone from cellular phone,
but also have multiple interfaces of camera, calculator etc*/

class CellularPhone2{
    public void call(){
        System.out.println("Calling");
    }
    public void text(){
        System.out.println("Texting");
    }

}

interface Camera2{
    void captureImage();
    void recordVideo();

    //wanna add default method
     default void slowMotion(){
        System.out.println("Recording Slomo");
    }
    //we use default if we don't wanna add something to class and we can directly add a new function to it

    private void wareHouse(){
        System.out.println("Additional things");
    }
    //this private can't be access in main method
    //but if we have a big default class that we can't manage
    //we can make private class and call it in default
    //so indirectly it will be called through default
    default void defautMethod(){
         wareHouse();
    }

}
interface Calculator2{
    void makeCalculations();
}
interface MediaPlayer2 {
    void playMusic();
    void playVideo();
}
interface Wifi2{
    String[] networks();
}


class SmartPhone2 extends CellularPhone2 implements Camera2, Calculator2, MediaPlayer2 {

    @Override
    public void captureImage() {
        System.out.println("Capturing Image");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video");
    }

    @Override
    public void makeCalculations() {
        System.out.println("Calculating");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing Video");
    }

    public String[] networks(){
        System.out.println("Getting Networks...");
        String[] networkList = {"Storm Fiber", "PTCL-BB", "Zoom"};
        return networkList;
    }

    public void slowMotion(){
        System.out.println("Recording Slomo video");
    }
    //overriding the default method
    //in this case this will implement and not that default
}


public class Default_Method {
    public static void main(String[] args) {

        SmartPhone2 F9 = new SmartPhone2();

        F9.call();
        F9.text();
        F9.captureImage();
        F9.recordVideo();
        F9.makeCalculations();
        F9.playMusic();
        F9.playVideo();


        String[] ar = F9.networks();
        for(String item: ar){
            System.out.println(item);
        }

        F9.slowMotion();

        F9.defautMethod();

    }
}


