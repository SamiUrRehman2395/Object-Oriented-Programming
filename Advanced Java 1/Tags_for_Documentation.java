package Advanced_Java_2;

/**
 * This class is to demonstrate what JavaDoc is and how it is used in Java industry
@author Sami-ur-Rehman
 @version 10.5.2
 @since JAN 2024
 @see <a href="https://docs.oracle.com/en/java/javase/21/docs/api/index.html">Java Docs</a>
 */
public class Tags_for_Documentation {

    public void add(int a, int b) {
        a=5;
        b=5;
        System.out.println(a+b);
    }
    public static void main(String[] args) {

        System.out.println("Main Method");
    }
}
