/*Although multiple inheritance is not allowed in Java,
but we can have indirect multiple inheritance by using interfaces.
given is the example where we inherit smartphone from cellular phone,
but also have multiple interfaces of camera, calculator etc*/

class CellularPhone{
    public void call(){
        System.out.println("Calling");
    }
    public void text(){
        System.out.println("Texting");
    }

}
interface Camera{
    void captureImage();
    void recordVideo();
}
interface Calculator{
    void makeCalculations();
}
interface MediaPlayer {
    void playMusic();
    void playVideo();
}
interface Wifi{
    String[] networks();
}



class SmartPhone extends CellularPhone implements Camera, Calculator, MediaPlayer {

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
}

public class Multiple_Inheritance {
    public static void main(String[] args) {

        SmartPhone F9 = new SmartPhone();

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

    }
}

