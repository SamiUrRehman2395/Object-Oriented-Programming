package com.advanced_java;

import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.HashSet;

public class Advanced_Java_PracticeSet {
    public static void main(String[] args) {

        // Question No1
        //storing playing xi of your dream t20 team , print with for each loop
        System.out.println("My Dream T20 XI");
        ArrayList<String> names = new ArrayList<>();
        names.add("1.  Rohit Sharma     - India");
        names.add("2.  Chris Gayle      - West Indies");
        names.add("3.  Virat Kohli      - India");
        names.add("4.  AB Deviliers     - South Arica");
        names.add("5.  Kieron Pollard   - West Indies");
        names.add("6.  Andre Russell    - West Indies");
        names.add("7.  MS Dhoni (c)(wk) - India");
        names.add("8.  Rashid Khan      - Afghanistan");
        names.add("9.  Dale Steyn       - South Africa");
        names.add("10. Lasith Malinga   - Sri-Lanka");
        names.add("11. Jasprit Bumrah   - India");
        names.add("");
        names.add("12. Sunil Narine     - West Indies");

//        for (int i=0; i< names.size(); i++){
//            System.out.println(names.get(i));
//        }

        for(String i : names){
            System.out.println(i);
        }


        // Question No 2
        // Create a set in java, try to store duplicate elements inside the set and verify
        //that only one instance is stored

        HashSet<Integer> s = new HashSet<>();
        s.add(5);
        s.add(40);
        s.add(5);

        System.out.println(s);
    }
}