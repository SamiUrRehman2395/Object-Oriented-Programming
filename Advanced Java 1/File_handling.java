package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_handling {
    public static void main(String[] args) {

        // Code to create a new file

//        File myFile = new File("filehandling.txt");
//        try {
//            myFile.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Unable to create this file");
//            e.printStackTrace();
//        }


        // Code to write to a file
//        try {
//            FileWriter fileWriter = new FileWriter("filehandling.txt");
//            fileWriter.write("This is our first file from this java course\nOkay now bye");
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Reading a file
//        File myFile = new File("filehandling.txt");
//        try {
//            Scanner sc = new Scanner(myFile);
//            while(sc.hasNextLine()){
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


        // Deleting a file
        File myFile = new File("filehandling.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }

    }
}
