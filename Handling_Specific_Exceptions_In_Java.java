import java.util.Scanner;

public class Handling_Specific_Exceptions_In_Java {
    public static void main(String[] args) {

        int [] marks = new int[3];
        marks[0] = 56;
        marks[1] = 63;
        marks[2] = 57;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array Index");
        int Index = sc.nextInt();

        System.out.println("Enter the number you want to divide array value with");
        int number = sc.nextInt();

        try{
            System.out.println("The value at array index entered is: " + marks[Index]);
            System.out.println("Value of array-value/number is: " + marks[Index]/number);
        }
        catch (ArithmeticException e){
        System.out.println("Arithmetic Exception Occured!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bounds Exception Occured!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other Exception Occured!");
            System.out.println(e);
        }
    }
}
