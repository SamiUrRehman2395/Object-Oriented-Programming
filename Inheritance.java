class Base{
    int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}
class Derived extends Base{
    int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Base b = new Base();
        b.setX(96);
        System.out.println(b.getX());

        Derived d = new Derived();
        d.setY(98);
        System.out.println(d.getY());
        d.setX(96);
        System.out.println(d.getX());
    }
}
