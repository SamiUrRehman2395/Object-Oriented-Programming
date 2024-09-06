package com.advanced_java;
import java.util.*;
public class Array_List {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        l2.add(11);
        l2.add(12);
        l2.add(13);


        l2.addAll(0, l1);

//        l2.clear(); // It will clear all the data we've put

        l2.addFirst(444);
        //print at first


        for(int i=0; i< l2.size(); i++){
            System.out.println(l2.get(i));
        }

        //if we wanna know if the specific element is present in this list or not
        System.out.println(l1.contains(27));
        //it will return true or false


        //if we wanna see the list horizontally
//        for(int i=0; i< l2.size(); i++){
//            System.out.print(l2.get(i));
//            System.out.print(", ");
//        }



//        System.out.println(l1.indexOf(5));
        //if we give 5, it will tell 5 is at which index
        //if there are 5 multiple times, it will access 5 which comes first


//        System.out.println(l1.lastIndexOf(5));
        //it will access 5 which is at last


//        System.out.println(l2.remove(1));
        //to remove value from the inputted index


//        System.out.println(l1.set(0, 786));
        //it will print 786 at 0th index

    }
}

/*
clone()
ensureCapacity()


 */