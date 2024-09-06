package Advanced_Java_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Library_Management_System {
    public static void main(String[] args) {

        //available books section
        ArrayList<String> arr = new ArrayList<>(25);
        Scanner sc = new Scanner(System.in);
        System.out.print("available books: ");
        arr.add("Java");
        arr.add("C++");
        arr.add("javascript");
        arr.add("python");
        for(String i: arr){
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println();

        //issue books
        System.out.print("enter your name:");
        String name = sc.next();
        System.out.print("enter books name u want to read: ");
        String book = sc.next();
        System.out.print("enter author name: ");
        String author = sc.next();
        String[] book1 = new String[arr.size()];
        for(int i = 0; i<arr.size(); i++){
            book1[i] = arr.get(i);
            String availableBooks = book1[i];
            if(book.equals(availableBooks)){
                System.out.println("book "+book+" of author "+author+" is issued to "+name);
                arr.remove(book1[i]);
                System.out.println("available books are: "+ arr);
            }
        }

        //return any issued books
        System.out.println("if you want to return any issued books then type true or false");
        boolean b1 = sc.nextBoolean();
        if(b1){
            System.out.println("enter the name of books issued to you: ");
            String issuedBooks = sc.next();
            String returnedBooks  = issuedBooks;
            System.out.println("book "+returnedBooks+" of author "+author+" has been returned by "+name);
            arr.add(returnedBooks);
            System.out.println("available books are: "+ arr);
        }
        else{
            System.out.println("no books to be returned");
        }

        //add any additional books
        System.out.println("do you want to add any books type your answer in true or false");
        boolean b2 = sc.nextBoolean();
        String addBooks;
        if(b2){
            System.out.print("enter the name of books to be added: ");
            addBooks = sc.next();
            arr.add(addBooks);
            System.out.print("new list of books are: ");
            System.out.println(arr);
        }
        else{
            System.out.println("thank you for using our service");
        }
    }
}