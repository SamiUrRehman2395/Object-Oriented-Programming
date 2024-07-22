//class Employee{
//    int id;
//    String name;
//}
//
//public class Custom_Class {
//    public static void main(String[] args) {
//
//        Employee sami = new Employee();
//
//        sami.id = 86;
//        sami.name = "SAMI-UR-REHMAN";
//
//        System.out.println(sami.id);
//        System.out.println(sami.name);
//
//    }
//}


//PART 2

//class Employee{
//    int id;
//    String name;
//
//    public void printdetails(){
//        System.out.println("My name is " + name);
//        System.out.println("My Id is " + id);
//    }
//}
//
//public class Custom_Class {
//    public static void main(String[] args) {
//
//        Employee sami = new Employee();
//        Employee imad = new Employee();
//
//        sami.id = 86;
//        sami.name = "SAMI-UR-REHMAN";
//
//        imad.id = 20;
//        imad.name = "IMAD WASIM";
//
//
//        sami.printdetails();
//        imad.printdetails();
//
//    }
//}

//PART 3

class Employee{
    int id;
    String name;
    int salary;

    public void printdetails(){
        System.out.println("My name is " + name);
        System.out.println("My Id is " + id);
    }

    public int getSalary(){
        return salary;
    }
}

public class Custom_Class {
    public static void main(String[] args) {

        Employee sami = new Employee();
        Employee imad = new Employee();

        sami.id = 86;
        sami.name = "SAMI-UR-REHMAN";
        sami.salary = 300;

        imad.id = 20;
        imad.name = "IMAD WASIM";
        imad.salary = 900;

//        System.out.println(sami.id);
//        System.out.println(sami.name);

        sami.printdetails();
        imad.printdetails();

        int salary = imad.getSalary();
        System.out.println(salary);

    }
}