//class MyNewThr1 extends Thread {
//
//    @Override
//    public void run() {
//        while (true) {
//            System.out.println("Thank You!");
//        }
//    }
//}
//class MyNewThr2 extends Thread {
//
//    @Override
//    public void run() {
//        while (true) {
//            System.out.println("You're Welcome");
//        }
//    }
//}
//
//public class Thread_Method {
//    public static void main(String[] args) {
//
//        MyNewThr1 t1 = new MyNewThr1();
//        MyNewThr2 t2 = new MyNewThr2();
//
//        t1.start();
//
//        try{
//            t1.join();
//        }
//        catch (Exception e) {
//            System.out.println(e);
//        }
//        // it will not allow t2 to run untill t1 completes
//
//        t2.start();
//    }
//}


// sleep

class MyNewThr1 extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("Thank You!");

            try{
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
class MyNewThr2 extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("You're Welcome");
        }
    }
}

public class Thread_Method {
    public static void main(String[] args) {

        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();

        t1.start();

//        try{
//            t1.join();
//        }
//        catch (Exception e) {
//            System.out.println(e);
//        }
        // it will not allow t2 to run untill t1 completes

        t2.start();
    }
}

