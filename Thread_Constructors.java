class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

//    @Override
//    public void run() {
//        System.out.println("I am a thread");
//    }
}
public class Thread_Constructors {
    public static void main(String[] args) {

        MyThr t = new MyThr("AJ");
        t.start();

        System.out.println(t.getName());
        System.out.println(t.getId());


    }
}

