/*
Finally block contains the code which is always executed weather the exception is handled or not
It is used to execute code containing instructions to release the system resources, close the connection etc.
 */

//public class Finally_Block {
//    public static void main(String[] args) {
//        try{
//            int a = 5;
//            int b = 0;
//            int c = a/b;
//            System.out.println(c);
//        } catch (Exception e){
//            System.out.println(e);
//        }
//
//        finally {
//            System.out.println("End of programme");
//        }
//    }
//}


//Another Example

//public class Finally_Block {
//
//    public static int greet() {
//        try {
//            int a = 50;
//            int b = 5;
//            int c = a / b;
//            return c;
//        }
//        catch (Exception e) {
//            System.out.println(e);
//        }
//
//        finally {
//            System.out.println("End of programme function");
//        }
//
//        System.out.println("End of programme function");
//
//        return 0;
//    }
//
//        public static void main (String[]args){
//
//        int k = greet();
//            System.out.println(k);
//
//        }
//    }


//Example 3


public class Finally_Block {


    public static void main (String[]args){

        int a = 7;
        int b = 9;

        while(true){
            try {
                System.out.println(a / b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally for value of b = " +b);
            }
            b--;
        }

        //we can do one more thing
        //we can use try with finally

        try{
            System.out.println(50/0);
        }
        finally {
            System.out.println("I am finally");
        }

        // here we have used finally with try
        //if the exception occurs it will print the finally block


    }
}
