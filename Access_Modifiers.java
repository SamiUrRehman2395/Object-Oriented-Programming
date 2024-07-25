//access private attributes by using getters and setters
//can't access private attributes with the help of dot operators

class Cricketer{

    private int JerseyNo;
    private String name;

    public void setJerseyNo(int i) {this.JerseyNo = i;}
    public void setName(String n) {this.name = n;}
    public int getId() {return JerseyNo;}
    public String getName() {return name;}
}

public class Access_Modifiers {
    public static void main(String[] args) {

        Cricketer james = new Cricketer();

        james.setJerseyNo(9);
        james.setName("James Anderson");

        System.out.println(james.getId());
        System.out.println(james.getName());

    }
}
