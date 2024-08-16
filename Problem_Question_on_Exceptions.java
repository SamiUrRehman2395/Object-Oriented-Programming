/*
Write a programme that keep accessing an array untill the valid index is given,
after 5 retries it will give error
 */

import java.util.Scanner;

public class Problem_Question_on_Exceptions {
    public static void main(String[] args)  {

        int [] marks = new int[3];
        marks[0] = 35;
        marks[1] = 40;
        marks[2] = 45;

//        int [] marks2 = {35, 40, 45};
        // we can also initialize/declare array this way.

        boolean flag = true;

        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;

        while(flag && i<5){
            try {
                System.out.println("Enter value of Index");
                index = sc.nextInt();
                System.out.println("Value you've entered of marks index is: " + marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid");
                i++;
            }

            if(i>=5){
//                System.out.println("Error 404");
                try {
                    throw new MaxRetrieveReached();
                }
                catch (Exception e){
                    System.out.println(e);
                }

            }

        }

    }

}

class MaxRetrieveReached extends Exception{
    @Override
    public String toString() {
        return "Error 404";
    }
}