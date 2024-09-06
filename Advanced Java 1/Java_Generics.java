package Advanced_Java_2;

import java.util.ArrayList;

public class Java_Generics {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(33);
        l1.add(45);
        l1.add(17);

        int x = l1.get(0);
        System.out.println(x);

        //second way if we dont have fixed data type
        ArrayList l2 = new ArrayList();
        l2.add("Str");
        l2.add(118);
        l2.add(110);

        int a = (int) l2.get(1); //we can do type casting here, bcz java dont know what datatype is
        System.out.println(a);

        String b = (String) l2.get(0);
        System.out.println(b);
    }
}
