public class This_Keyword {
    public static void main(String[] args) {

        Student1 ali = new Student1(15, "Ali Raza", 85.6f);
//        Student1 ali = new Student1();
        Student1 ahmad = new Student1();

//        System.out.println(ali.name);
//        System.out.println(ahmad.name);  //it will print Ali because ahmad replaces this keyword

//        Student1 amir = new Student1();

//        ali.changeName("Aliyan");

        System.out.println(ali.rollNo);
        System.out.println(ali.name);
        System.out.println(ali.marks);

//        Student1 asif = new Student1();
//
//        Student1 random = new Student1(asif);
//        System.out.println(ali.name);

//        ali.Greeting();
//        amir.Greeting();


    }
}
class Student1{
    int rollNo;
    float marks;
    String name;

    Student1 (Student1 other){
        this.name = other.name;
    }
    // this keyword is replaced by random and other is replaced by asif

    Student1(){
        this.name = "Ali"; //ali will be replaced my this keyword
        this.rollNo = 1;
        this.marks = 90.0f;
    }

    void Greeting(){
        System.out.println("Hello ! My name is " + this.name);
    }

    void changeName(String newName){
        name = newName;
    }

//    Student1(int rollNo, String name, float marks){
//        this.rollNo = rollNo;
//        this.name = name;
//        this.marks = marks;
//    }

    //we can use this keyword or we can keep the name of variables different
    Student1(int roll, String naam, float number){
        rollNo = roll;
        name = naam;
        marks = number;

        // its means this.name is set to whatever you've passed in the constructor
        //For example is you wanna print this "System.out.println(ali.name);"
        //and you've passed argument in the object like this
        //Student1 ali = new Student1(15, "Ali Raza", 85.6f);
        //String naam will be = Ali Raza
        //and name = naam
        //this (ali.name) will be basically print "naam" nor "name"

    }
}