//class Batsman{
//    private int JerseyNo;
//    private String name;
//
//
//    public Batsman(){
//        JerseyNo = 18;
//        name = "Virat Kohli";
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
//public class Constructors {
//    public static void main(String[] args) {
//
//        Batsman virat = new Batsman();
//
//        System.out.println(virat.getName());
//        System.out.println(virat.getId());
//
//    }
//}



//Constructor With Arguments

class Batsman{
    private int JerseyNo;
    private String name;

    //passing arguments
    public Batsman(String player, int shirtNo){
        JerseyNo = shirtNo;
        name = player;
    }
    //this is a constructor


    public void setJerseyNo(int i) {this.JerseyNo = i;}
    public void setName(String n) {this.name = n;}
    public int getId() {return JerseyNo;}
    public String getName() {return name;}
}


public class Constructors {
    public static void main(String[] args) {

        Batsman virat = new Batsman("Virat Kohli", 18);

        System.out.println(virat.getName());
        System.out.println(virat.getId());

    }
}
