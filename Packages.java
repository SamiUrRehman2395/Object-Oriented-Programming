import java.util.Scanner;

// import java.util.*;
// Here we've imported all the util packages

public class Packages {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //We can have scanner this way as well
        //java.util.Scanner sc = new java.util.Scanner(System.in);

        int x = sc.nextInt();

        System.out.println("This is my scanner taking input as " + x);

    }
}
// packAge is basically a folder

/*
javac Harry.java    (harry.java to java class)
java (name of the class)..... java Harry
javac -d . Harry.java ------it will make a folder of the name package and then compile by adding all the files by putting it into the folder
javac -d . *.java ----- it will organize all the files by putting them into their respective folders
javac -d  abc *.java --- the package will be made inside the package abc
javac -d . abc *.java --- the package will be made there but not inside that abc
 */