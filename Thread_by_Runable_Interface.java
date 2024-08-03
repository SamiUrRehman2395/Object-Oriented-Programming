class MyThread1  implements Runnable{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("I am a thread 1");
            i++;
        }
    }
}
class MyThread2 implements Runnable{
    @Override
    public void run() {
        int i = 0;
                while(i<100){
                    System.out.println("I am a thread 2");
                    i++;
                }

    }
}
public class Thread_by_Runable_Interface {
    public static void main(String[] args) {

        MyThread1 bullet1 = new MyThread1();
        Thread gun1 = new Thread(bullet1);

        MyThread2 bullet2 = new MyThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();


        Sportage petrol = new Sportage();
        Thread car1 = new Thread(petrol);

        Sonata diesel = new Sonata();
        Thread car2 = new Thread(diesel);

        car1.start();
        car2.start();
    }
}

class Sportage implements Runnable{
    @Override
    public void run() {
        int i =0;
        while(i<100) {
            System.out.println("Kia Sportage");
            i++;
        }
    }
}
class Sonata implements Runnable{
    @Override
    public void run() {
        int i=0;
        while(i<100) {
            System.out.println("Hyundai Sonata");
            i++;
        }
    }
}
