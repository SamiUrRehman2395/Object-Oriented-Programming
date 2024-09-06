/*
An ArrayDeque (also known as an “Array Double Ended Queue”, pronounced as “ArrayDeck”)
is a special kind of a growable array that allows us to add or remove an element from
both sides. An ArrayDeque implementation can be used as a Stack (Last-In-First-Out)
or a Queue(First-In-First-Out)
 */

package com.advanced_java;

import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(9);
        ad1.add(17);
        ad1.add(8);
        ad1.addFirst(333);

        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
