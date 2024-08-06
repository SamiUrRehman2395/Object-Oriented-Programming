/*
Exceptions in Java:
1.Checked Exception (Compile time exception ; handled by compiler)
2.UnChecked Exception (Runtime Exceptions)

COMMONLY OCCURING EXCEPTIONS
1.Null Pointer
2.Arithmetic
3.Array Index out of bound
4.Illegal argument exception
5.Number format exception

 */

public class Exception_Handling_by_Try_Catch_Block {
    public static void main(String[] args) {

        int a = 6000;
        int b = 0;

        try {
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Failed to run. Reason : " + e);
        }

        System.out.println("End the programme");



    }
}
