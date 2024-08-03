class Thread1 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<10000){
            System.out.println("I am watching reels");
            i++;
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
        int i = 0;
                while(i<10000){
                    System.out.println("I am eating food");
                    i++;
                }
    }
}


public class Thread_by_extending_thread_class {
    public static void main(String[] args) {
        Thread1 reels = new Thread1();
        Thread2 food = new Thread2();

        reels.start();
        food.start();
    }
}
