/*
A Java HashSet class represents a set of elements (objects).
It does not guarantee the order of elements.
It constructs a collection that uses a hash table for storing elements.
 */

package com.advanced_java;

import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("Karachi Kings");
        myHashSet.add("Islamabad United");
        myHashSet.add("Lahore Qalandars");
        myHashSet.add("Quetta Gladiators");

        System.out.println(myHashSet);

        //it will not take repetitive values
    }
}
