interface myCamera{
    void takeSnap();
}
interface myWhatsapp{
    void sendMessage();
}
class mySmartPhone implements myCamera, myWhatsapp{
    @Override
    public void takeSnap() {
        System.out.println("Taking snapshot");
    }

    @Override
    public void sendMessage(){
        System.out.println("Sending Message");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        myCamera camera = new mySmartPhone();

        camera.takeSnap();
//        camera.sendMessage(); //not allowed

    }
}

// Smartphone shows polymorphism as it is used as both camera and whatsapp
// if we made object with reference to camera , we cant call whatsapp