class MyThr3 extends Thread {
    public MyThr3(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(this.getName());
        }
    }
}

public class Thread_Priorities {
    public static void main(String[] args) {

        MyThr3 t1 = new MyThr3("Abdullah Shafique");
        MyThr3 t2 = new MyThr3("Shan Masood");
        MyThr3 t3 = new MyThr3("Fakhar Zaman");
        MyThr3 t4 = new MyThr3("Salman Ali Agha");
        MyThr3 t5 = new MyThr3("Imad Wasim");

        t5.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
