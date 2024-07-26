//class Player{
//    private int JerseyNo;
//    private String name;
//
//    public Player(){
//        JerseyNo = 0;
//        name = "Default";
//    }
//
//    //passing arguments
//    public Player(String player, int shirtNo){
//        JerseyNo = shirtNo;
//        name = player;
//    }
//    //this is a constructor
//
//
//    public void setJerseyNo(int i) {this.JerseyNo = i;}
//    public void setName(String n) {this.name = n;}
//    public int getId() {return JerseyNo;}
//    public String getName() {return name;}
//}
//
//
//public class Constructors_Overloading {
//    public static void main(String[] args) {
//
////        Player martin = new Player("Martin Guptill", 31);
//
//        Player martin = new Player();
//
//        //if we dont pass the argument and keep both constructors, constructor without argument overwrite the construct with argument
//
//
//        System.out.println(martin.getName());
//        System.out.println(martin.getId());
//
//    }
//}


//if we give only 1 argument of the 2, it will print 1 value from constructor with argument and 1 value from constructor without value

class Player{
    private int JerseyNo;
    private String name;

    public Player(){
        JerseyNo = 0;
        name = "Default";
    } //it will get id from this , because it is without argument


    //passing arguments
    public Player(String player, int shirtNo){
        JerseyNo = shirtNo;
        name = player;
    }
    //this is a constructor

    public Player(String player){
        name = player;
    } //it will get name from this because this method is with one argument(name)


    public void setJerseyNo(int i) {this.JerseyNo = i;}
    public void setName(String n) {this.name = n;}
    public int getId() {return JerseyNo;}
    public String getName() {return name;}
}


public class Constructors_Overloading {
    public static void main(String[] args) {

//        Player martin = new Player("Martin Guptill", 31);

//        Player martin = new Player();

        Player martin = new Player("Martin Guptill");

        //if we dont pass the argument and keep both constructors, constructor without argument overwrite the construct with argument


        System.out.println(martin.getName());
        System.out.println(martin.getId());

    }
}

