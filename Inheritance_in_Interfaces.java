interface sauces{
    void myoneese();
    void chiliGarlicSauce();
    void chipotleSauce();
}
interface ingredients extends sauces{
    void lowerBun();
    void upperBun();
    void beefPatty();
    void lettuce();
    void cheese();
    void jelopenos();
}
class BeefBurger implements ingredients{
    public void toasting(){
        System.out.println("Toast the buns");
    }
    @Override
    public void lowerBun() {
        System.out.println("Place Lower Bun");
    }

    @Override
    public void chipotleSauce() {
        System.out.println("Add Chipotle Sauce");
    }

    @Override
    public void lettuce() {
        System.out.println("Add Lettuce");
    }

    @Override
    public void jelopenos() {
        System.out.println("Add 3 to 4 Jalepenos");
    }

    @Override
    public void beefPatty(){
        System.out.println("Place smashed Beef Patty");
    }

    @Override
    public void cheese() {
        System.out.println("Add Cheese Slice");
    }

    @Override
    public void chiliGarlicSauce() {
        System.out.println("Add Chili Garlic Sauce");
    }

    @Override
    public void myoneese() {
        System.out.println("Add Myoneese");
    }

    @Override
    public void upperBun() {
        System.out.println("Place Upper Bun");
    }
}

public class Inheritance_in_Interfaces {
    public static void main(String[] args) {
        BeefBurger burger = new BeefBurger();
        burger.toasting();
        burger.lowerBun();
        burger.chipotleSauce();
        burger.lettuce();
        burger.jelopenos();
        burger.beefPatty();
        burger.cheese();
        burger.chiliGarlicSauce();
        burger.myoneese();
        burger.upperBun();
    }
}
