//public class Throw_vs_Throws {
//
//    public static int divide(int a , int b) throws ArithmeticException{
//        int result = a/b;
//        return result;
//    }
//
//
//    public static void main(String[] args) {
//
//        try{
//            int c = divide(6,0);
//            System.out.println(c);
//        }
//        catch (Exception e){
//            System.out.println("Exception");
//        }
//    }
//}

//with custom exception class

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Negative radiusn cannot be taken";
    }

    @Override
    public String getMessage() {
        return "Negative Radius cannot be taken";
    }
}

public class Throw_vs_Throws {

    public static double area(int radius) throws NegativeRadiusException{
        if(radius<0){
            throw new NegativeRadiusException();
        }

        double result = Math.PI * radius * radius;
        return result;
    }


    public static void main(String[] args) {

        try{
            double c = area(-2);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }
}
