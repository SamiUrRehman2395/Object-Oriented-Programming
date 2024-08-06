import java.util.Scanner;

public class Types_of_Errors {
    public static void main(String[] args) {

        // 1.Syntax Errors

//        int a = 5 // no semicolon
//        b = 7; // b is not declared



        // 2.Logical Errors

        // for example , we have to print even numbers from 1 to 10

        for (int i = 1; i<5; i++){
            System.out.println(2*i+1);
        }
        // it has printed odd numbers instead of even numbers
        // because its our logical error



        // 3.Runtime Errors

        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integral part of 1000 divided by k is " + 1000/k);

        // if we give 2 as input , it will give us 500 as answer
        // but if we put 0 , it will give runtime error as 1000 can't be divided by 0
    }
}
