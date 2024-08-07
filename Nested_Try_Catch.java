//import java.util.Scanner;
//
//public class Nested_Try_Catch {
//    public static void main(String[] args) {
//
//        int [] marks = new int[3];
//        marks[0] = 56;
//        marks[1] = 63;
//        marks[2] = 57;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the Array Index");
//        int Index = sc.nextInt();
//
//        try{
//            System.out.println("Nested Try Catch");
//
//
//            try {
//                System.out.println("The value at array index entered is: " + marks[Index]);
//            } catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("Exception in Level 2 " + e);
//            }
//
//
//        }
//        catch (Exception e){
//            System.out.println("Exception in Level 1");
//        }
//
//
//    }
//}





// Keep Taking input from user and accessing array untill a user gives valid index

import java.util.Scanner;

public class Nested_Try_Catch {
    public static void main(String[] args) {

        int [] marks = new int[3];
        marks[0] = 56;
        marks[1] = 63;
        marks[2] = 57;

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while(flag) {
        System.out.println("Enter the Array Index");
        int Index = sc.nextInt();

            try {
                System.out.println("Nested Try Catch");


                try {
                    System.out.println("The value at array index entered is: " + marks[Index]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Exception in Level 2 " + e);
                }


            } catch (Exception e) {
                System.out.println("Exception in Level 1");
            }

        }


    }
}
