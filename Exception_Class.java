import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString";
    }

    @Override
    public String getMessage() {
        return "I am getMessage";
    }
}

public class Exception_Class {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (a<10){
            try{
                throw new MyException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace(); // to know the error and in which line
            }

        }
    }
}
