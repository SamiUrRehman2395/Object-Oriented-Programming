package Advanced_Java_2;

import java.util.LinkedList;
import java.util.Scanner;

class Library {

    LinkedList<String> listOfBooks = new LinkedList<>();

    public void welcome(){
        System.out.println("********************************");
        System.out.println("***Welcome to Central Library***");
        System.out.println("********************************");
    }

    public void facilities(){
        System.out.println("""
                Please Choose an Option :
                ○ 1. List All The Book
                ○ 2. Request a Book
                ○ 3. Add/Donate a Book
                ○ 4. Return Book
                ○ 5. Exit The Library
                """);
    }

    public void addBook(){
        listOfBooks.add("java");
        listOfBooks.add("python");
        listOfBooks.add("c++");
        listOfBooks.add("javascript");
    }

    public void takeBooks(String book_name){
        String book = book_name.toLowerCase();
        listOfBooks.remove(book);
    }

    public void bookName_Author(){
        System.out.println("Avilable books : ");
        System.out.println(listOfBooks);
    }

    public void returnBook(String book_name){
        String book = book_name.toLowerCase();
        listOfBooks.add(book);
    }
}

public class Library_Management_System_2 {

    public static void main(String[] args) {

        Library l = new Library();
        l.welcome();
        l.facilities();
        l.addBook();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Choose Option : ");
            try{
                int option = sc.nextInt();
                if (option == 1){
                    l.bookName_Author();
                }
                else if (option == 2){
                    l.bookName_Author();
                    try {
                        System.out.print("Enter Book Name : ");
                        String bookname = sc.next();
                        String book = bookname.toLowerCase();
                        try{
                            l.takeBooks(book);
                            System.out.println("You successfully issued book!");
                        }
                        catch (Exception e){
                            System.out.println("Not Available!");
                        }
                    }
                    catch (Exception e){
                        System.out.println("Please Enter Valid Input!");
                    }
                }
                else if (option == 3){
                    System.out.print("Enter Book Name : ");
                    try{
                        String bookname = sc.next();
                        String book = bookname.toLowerCase();
                        l.returnBook(book);
                        System.out.println("You successfully added a book to Library");
                    }
                    catch (Exception e){
                        System.out.println("Please Enter Valid Input!");
                    }
                }
                else if (option == 4){
                    System.out.print("Enter Book Name : ");
                    try{
                        String bookname = sc.next();
                        String book = bookname.toLowerCase();
                        l.returnBook(book);
                        System.out.println("You successfully returned a book to Library");
                    }
                    catch (Exception e){
                        System.out.println("Please Enter Valid Input!");
                    }
                }
                else {
                    System.out.println("Thank You for using this library. Have A Nice Dat!");
                    System.out.println("Visit Again!");
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Please Enter Valid Input!");
            }
        }
    }
}