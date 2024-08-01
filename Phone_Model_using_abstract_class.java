abstract class PhoneModel{
    abstract public void onn();
    abstract public void interface1();
    abstract public void interface2();
}
class Samsung extends PhoneModel{
    public void onn(){
        System.out.println("Starting...");
    }
    public void interface1(){
        System.out.println("SAMSUNG");
    }
    public void interface2(){
        System.out.println("NOTE 10 PLUS");
    }

}
class Vivo extends PhoneModel{
    public void onn(){
        System.out.println("Starting...");
    }
    public void interface1(){
        System.out.println("VIVO");
    }
    public void interface2(){
        System.out.println("Y20");
    }
}
class Oppo extends PhoneModel{
    public void onn(){
        System.out.println("Starting...");
    }
    public void interface1(){
        System.out.println("OPPO");
    }
    public void interface2(){
        System.out.println("F15");
    }
}

public class Phone_Model_using_abstract_class {
    public static void main(String[] args) {
        Samsung s = new Samsung();
        Vivo v = new Vivo();
        Oppo o = new Oppo();

        o.onn();
        o.interface1();
        o.interface2();

        v.onn();
        v.interface1();
        v.interface2();

        s.onn();
        s.interface1();
        s.interface2();
    }
}
