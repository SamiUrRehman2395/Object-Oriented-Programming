class Cellphone{

    public void ring(){
        System.out.println("Ringing...");
    }

    public void vibrate(){
        System.out.println("Vibrating...");
    }

    public void text(){
        System.out.println("Texting...");
    }

}

public class Cell_Phone {
    public static void main(String[] args) {

        Cellphone vivo = new Cellphone();

        vivo.ring();
        vivo.vibrate();
        vivo.text();
    }
}
